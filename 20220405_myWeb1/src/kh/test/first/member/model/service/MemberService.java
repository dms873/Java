package kh.test.first.member.model.service;

import java.sql.Connection;
import java.util.ArrayList;

import kh.test.first.member.model.dao.MemberDao;
import kh.test.first.member.model.vo.MemberVo;

import static kh.test.first.common.jdbc.JdbcTemplate.*;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int insertMember(MemberVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insertMember(conn, vo);
		close(conn);
		return result;
	}
	public int updateMember(MemberVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.updateMember(conn, vo);
		close(conn);
		return result;
	}
	public int deleteMember(MemberVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.deleteMember(conn, vo);
		close(conn);
		return result;
	}
	public ArrayList<MemberVo> listMember(){
		ArrayList<MemberVo> result = null;
		Connection conn = getConnection();
		result = dao.listMember(conn);
		close(conn);
		return result;
	}
	public MemberVo readMember(String mId){
		MemberVo result = null;
		Connection conn = getConnection();
		result = dao.readMember(conn, mId);
		close(conn);
		return result;
	}
	
	public MemberVo login(String mId, String pwd){
		MemberVo result = null;
		Connection conn = getConnection();
		result = dao.login(conn, mId, pwd);
		close(conn);
		return result;
	}
}
