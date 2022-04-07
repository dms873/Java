package kh.test.first.board.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

import kh.test.first.board.model.vo.BoardVo;
import kh.test.first.board.model.vo.ReCommentVo;

import static kh.test.first.common.jdbc.JdbcTemplate.close;


public class BoardDao {
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int insertBoard(Connection conn, BoardVo vo) {
		String mId = vo.getmId(); 	
		
		int result = 0;  // 1. 리턴자료형으로 변수 생성 [+ 초기값]
		// 2. sql문 작성. 메소드 기능을 기반으로 
		String sql = "insert into board values(seq_board_b_no.nextval," 
	            + "'" + vo.getbTitle() + "','" + vo.getbContent()+ "'"
	            + ", default,default, (select nickname from member where m_id='" + mId + "'),'" + mId + "')";
		try {  // 4. try-catch
			// 3. pstmt/stmt 생성 - 2.sql문을 실행해야하므로 pstmt(?,없는경우) / stmt(없는경우) 선택
			pstmt = conn.prepareStatement(sql);
			// 7. 2,3번을 기반으로 sql문에 채워줄 값을 채움. -? pstmt.setXxx(1,);  pstmt.setInt / setString / setDate..
			// 8. sql문 실행 + 결과값 변수에 담기 - 2기반으로 메소드(executeUpdate / executeQuery) 결정 및 리턴변수(int / ResultSet) 결정
			result = pstmt.executeUpdate();
			// 9.10.11. select 문의 결과 rs 인 경우 
			// 12. 리턴변수에 값 채움 - 목표한바 확인			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {  // 5. finally
			// 6. 사용한 객체 close - 2.sql문 기반 rs / stmt / pstmt
			close(pstmt);
		}
		// 목표 : 리턴변수에 값을 채움. 아마도 구현 마지막 단계에서 결과 값을 알 수 있어 수행절차상 마지막에 구현됨.
		return result;   // 1. 리턴변수 값을 리턴함.
	}

	public int insertReCommentBoard(Connection conn, ReCommentVo vo) {
		String mId = vo.getmId(); 
		int result = 0;
		//ORA-01400: cannot insert NULL into ("SCOTT"."RE_COMMENT"."R_WRITE_DATE")
		//ORA-01400: cannot insert NULL into ("SCOTT"."RE_COMMENT"."R_CONTENT")
		//java.sql.SQLSyntaxErrorException: ORA-00904: "B_WRITER": invalid identifier
		String sql = "insert into re_comment (R_NO, B_NO, R_WRITER, R_WRITE_DATE, R_CONTENT,M_ID) "
				+ " values((select nvl(max(R_NO),0)+1 from re_comment)"
				+ ",?,(select nickname from member where m_id=?) "
				+ ",sysdate,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getbNo());  // 읽기화면의 b_no 를 넣어줘야함.
			pstmt.setString(2, mId); 
			pstmt.setString(3, vo.getrContent());
			pstmt.setString(4, mId);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
		}
		return result;
	}
	//------------ -------- -------------- 
	//B_NO         NOT NULL NUMBER         
	//B_TITLE      NOT NULL char(300)  
	//B_CONTENT    NOT NULL VARCHAR2(3000) 
	//B_COUNT      NOT NULL NUMBER         
	//B_WRITE_DATE NOT NULL TIMESTAMP(6)   
	//B_WRITER     NOT NULL VARCHAR2(60)   
	//M_ID         NOT NULL VARCHAR2(20)  
	
	public ArrayList<BoardVo> listBoard(Connection conn) {
		ArrayList<BoardVo> volist = null;
		
		String sql = "select b.*, (select count(*) from re_comment r where r.b_no= b.b_no) reCommentCnt "
				+ " from board b  order by B_WRITE_DATE desc";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			/* 방법 c */
//			if(rs!=null) {
//				System.out.println("rs is not null");
//				volist = new ArrayList<BoardVo>();
//				while(rs.next()) {
//					BoardVo vo = new BoardVo(rs.getInt("b_no"),rs.getString("b_Title"),rs.getString("b_Content")
//							,rs.getInt("b_Count"),rs.getTimestamp("b_Write_Date"),rs.getString("b_Writer")
//							,rs.getString("m_Id"), rs.getInt("reCommentCnt"));
//					volist.add(vo);
//				}
//			} else System.out.println("rs is null");
			/* 방법 b*/
			
			// 9. 리턴변수의 자료형이 참조자료형이면 객체생성 (기본자료형x)	
			volist = new ArrayList<BoardVo>();
			// 10. if / while - 2sql문에 조건식에따라서 결정 
			while(rs.next()) {
				// 10-1. while + 참조자료형 - 객체생성
				BoardVo vo = new BoardVo();
				// 11. rs.getXxx("컬럼라벨") - rs에서 각 컬럼마다 값 읽기
				vo.setbNo(rs.getInt("b_no"));
				vo.setbTitle(rs.getString("b_Title"));
				vo.setbContent(rs.getString("b_Content"));
				vo.setbCount(rs.getInt("b_Count"));
				vo.setbWriteDate(rs.getTimestamp("b_Write_Date"));
				vo.setbWriter(rs.getString("b_Writer"));
				vo.setmId(rs.getString("m_Id"));
				vo.setReCommentCnt(rs.getInt("reCommentCnt"));
				// 12. 리턴변수에 값 넣기
				volist.add(vo);
			}
			/* 방법 a */
//			if(rs.next()) {
//				volist = new ArrayList<BoardVo>();
//				do {
//					BoardVo vo = new BoardVo();
//					vo.setbNo(rs.getInt("b_no"));
//					vo.setbTitle(rs.getString("b_Title"));
//					vo.setbContent(rs.getString("b_Content"));
//					vo.setbCount(rs.getInt("b_Count"));
//					vo.setbWriteDate(rs.getTimestamp("b_Write_Date"));
//					vo.setbWriter(rs.getString("b_Writer"));
//					vo.setmId(rs.getString("m_Id"));
//					vo.setReCommentCnt(rs.getInt("reCommentCnt"));
//					// CHAR(1) 여도 getString 사용 
//					//char a = rs.getString("M_ID").charAt(0);
//					
//					volist.add(vo);
//				} while(rs.next());
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return volist;
	}


	public ArrayList<BoardVo> listBoard(Connection conn,int startRnum, int endRnum) {
		ArrayList<BoardVo> volist = null;
		String sql = "select * from "
				+ " (select rownum r, t1.* from "
				+ " (select b.*, (select count(*) from re_comment r where r.b_no= b.b_no) reCommentCnt from board b order by B_WRITE_DATE desc)t1) "
				+ " where r between ? and ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRnum);
			pstmt.setInt(2, endRnum);
			rs = pstmt.executeQuery();
//			if(rs.next()) {
				volist = new ArrayList<BoardVo>();
				while(rs.next()) {
					BoardVo vo = new BoardVo();
					vo.setbNo(rs.getInt("b_no"));
					vo.setbTitle(rs.getString("b_Title"));
					vo.setbContent(rs.getString("b_Content"));
					vo.setbCount(rs.getInt("b_Count"));
					vo.setbWriteDate(rs.getTimestamp("b_Write_Date"));
					vo.setbWriter(rs.getString("b_Writer"));
					vo.setmId(rs.getString("m_Id"));
					vo.setReCommentCnt(rs.getInt("reCommentCnt"));
					volist.add(vo);
				} 
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return volist;
	}
	
	public int countBoardList(Connection conn) {  // DML 결과가 아니라 ResultSet으로 부터 읽은 후 int형으로 결과를 담을 것임.
		int result = 0;
		String sql = "select count(*) from board";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// 9. 리턴변수의 자료형이 참조자료형이면 객체생성 (기본자료형x)	
			// 10. if / while - 2sql문에 조건식/집계함수 등에 따라서 단일행인지 확인 
			if(rs.next()) {
				// 10-1. while + 참조자료형 - 객체생성
				// 11. rs.getXxx("컬럼라벨") - rs에서 각 컬럼마다 값 읽기
				result = rs.getInt(1);
				// 12. 리턴변수에 값 넣기
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		
		return result;
	}
//	
//				volist = new ArrayList<BoardVo>();
//				// 10. if / while - 2sql문에 조건식에따라서 결정 
//				while(rs.next()) {
//					// 10-1. while + 참조자료형 - 객체생성
//					BoardVo vo = new BoardVo();
//					// 11. rs.getXxx("컬럼라벨") - rs에서 각 컬럼마다 값 읽기
	public BoardVo readBoard(Connection conn, int bNo) {
		BoardVo vo = null;
//		String sql = "select * from board where b_no=?";
		String sql = "select b.*, (select count(*) from re_comment r where b_no=?) reCommentCnt "
				+ " from board b where b_no=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bNo);
			pstmt.setInt(2, bNo);
			rs = pstmt.executeQuery();
			// 9. 리턴변수의 자료형이 참조자료형이면 객체생성 (기본자료형x)	
			vo = new BoardVo();
			// 10. if / while - 2sql문에 조건식에따라서 결정 
			if(rs.next()) {
				// 10-1. while + 참조자료형 - 객체생성
				// 11. rs.getXxx("컬럼라벨") - rs에서 각 컬럼마다 값 읽기
				vo.setbNo(rs.getInt("b_no"));
				vo.setbTitle(rs.getString("b_Title"));
				vo.setbContent(rs.getString("b_Content"));
				vo.setbCount(rs.getInt("b_Count"));
				vo.setbWriteDate(rs.getTimestamp("b_Write_Date"));
				vo.setbWriter(rs.getString("b_Writer"));
				vo.setmId(rs.getString("m_Id"));
				vo.setReCommentCnt(rs.getInt("reCommentCnt"));
				// 12. 리턴변수에 값 넣기  -vo
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		return vo;
	}
	
	public ArrayList<ReCommentVo> readBoardReComments(Connection conn, int bNo) {
		ArrayList<ReCommentVo> volist = null;

		String sql = "select * from re_comment where b_no=? order by r_Write_Date desc, b_no desc";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bNo);
			rs = pstmt.executeQuery();

			volist = new ArrayList<ReCommentVo>();
			while (rs.next()){
				ReCommentVo vo = new ReCommentVo(
						rs.getInt("r_no"), rs.getInt("b_no")
						,rs.getString("r_Writer"), rs.getTimestamp("r_Write_Date")
						, rs.getString("r_Content"), rs.getString("m_Id")
						);
				//(int rNo, int bNo, String rWriter, Timestamp rWriteDate, String rContent, String mId)
				volist.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}		
		return volist;
	}	
		


//	R_NO         NOT NULL NUMBER        
//	B_NO         NOT NULL NUMBER        
//	R_WRITER     NOT NULL VARCHAR2(60)  
//	R_WRITE_DATE NOT NULL TIMESTAMP(6)  
//	R_CONTENT    NOT NULL VARCHAR2(900) 
//	M_ID         NOT NULL VARCHAR2(20) 

}
