package kh.test.first.member.model.dao;

import static kh.test.first.common.jdbc.JdbcTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kh.test.first.member.model.vo.MemberVo;

public class MemberDao {
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public int insertMember(Connection conn, MemberVo vo) {
		int result =0;
		String sql = "insert into member (m_id, nickname, email, phone, password) values (?,?,?,?,?)";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getmId());
			pstmt.setString(2, vo.getNickname());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getPhone());
			pstmt.setString(5, vo.getPassword());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(pstmt);
		}
		return result;
	}
	public int updateMember(Connection conn, MemberVo vo) {
		int result = 0;
		String sql = "";
		try { 
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(pstmt);
		}
		return result;
	}
	public int deleteMember(Connection conn, MemberVo vo) {
		int result = 0;
		String sql = "";
		try { 
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(pstmt);
		}
		return result;
	}
	public ArrayList<MemberVo> listMember(Connection conn){
		ArrayList<MemberVo> result = null;
		String sql = "select * from member";
		try { 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			result = new ArrayList<MemberVo>();
			while(rs.next()) {
				MemberVo vo = new MemberVo();
				vo.setEmail(rs.getString("email"));
				vo.setmId(rs.getString("m_Id"));
				vo.setNickname(rs.getString("nickname"));
				vo.setPassword(rs.getString("password"));
				vo.setPhone(rs.getString("phone"));
				result.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(rs);
			close(pstmt);
		}
		return result;
	}
	public MemberVo readMember(Connection conn, String mId){
		MemberVo result = null;
		String sql = "";
		try { 
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(rs);
			close(pstmt);
		}
		return result;
	}
	
	
	public MemberVo login(Connection conn, String mId, String pwd){
		MemberVo result = null;
		String sql = "select * from member where m_id=? and password=?";
		try { 
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mId);
			pstmt.setString(2, pwd);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new MemberVo();
				result.setEmail(rs.getString("email"));
				result.setmId(rs.getString("m_Id"));
				result.setNickname(rs.getString("nickname"));
				result.setPassword(rs.getString("password"));
				result.setPhone(rs.getString("phone"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { 
			close(rs);
			close(pstmt);
		}
		return result;
	}
}
