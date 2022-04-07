package kh.test.first.board.model.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import kh.test.first.board.model.dao.BoardDao;
import kh.test.first.board.model.vo.BoardVo;
import kh.test.first.board.model.vo.ReCommentVo;

import static kh.test.first.common.jdbc.JdbcTemplate.*;

public class BoardService {
	// Service 에서 하는 일 DB연결  - DAO메소드호출(sql실행) -   DB해제
	
	private BoardDao dao = new BoardDao();
	
	public int insertBoard(BoardVo vo) {
		Connection conn = getConnection();
		int result = dao.insertBoard(conn, vo);
		
		close(conn);
		return result;
	}
	
	public int insertReCommentBoard(ReCommentVo vo) {
		Connection conn = getConnection();
		int result = dao.insertReCommentBoard(conn, vo);
		
		close(conn);
		return result;
	}
	
	public ArrayList<BoardVo> listBoard() {
		Connection conn = getConnection();
		ArrayList<BoardVo> volist = dao.listBoard(conn);
		close(conn);
		return volist;
	}
	
	public ArrayList<BoardVo> listBoard(int startRnum, int endRnum) {
		Connection conn = getConnection();
		ArrayList<BoardVo> volist = dao.listBoard(conn, startRnum, endRnum);
		close(conn);
		return volist;
	}
	
	public int countBoardList() {
		Connection conn = getConnection();
		int result = dao.countBoardList(conn);
		close(conn);
		return result;
	}
	public BoardVo readBoard(int bNo) {
		Connection conn = getConnection();
		BoardVo vo = dao.readBoard(conn, bNo);
		close(conn);
		return vo;
	}	
	public ArrayList<ReCommentVo> readBoardReComments(int bNo) {
		Connection conn = getConnection();
		ArrayList<ReCommentVo> result = dao.readBoardReComments(conn, bNo);
		close(conn);
		return result;
	}
	public Map<String, Object> readBoardAndReCommentMap(int bNo) {
		Connection conn = getConnection();
		BoardVo vo = dao.readBoard(conn, bNo);
		ArrayList<ReCommentVo> rVolist = dao.readBoardReComments(conn, bNo);
		close(conn);
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("board", vo);
		result.put("rVolist", rVolist);
		return result;
	}
	public BoardVo readBoardAndReComment(int bNo) {
		Connection conn = getConnection();
		BoardVo vo = dao.readBoard(conn, bNo);
		vo.setReVolist(dao.readBoardReComments(conn, bNo));
		close(conn);
		
		return vo;
	}
}

















