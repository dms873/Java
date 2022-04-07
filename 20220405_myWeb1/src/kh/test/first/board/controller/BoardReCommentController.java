package kh.test.first.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.first.board.model.service.BoardService;
import kh.test.first.board.model.vo.ReCommentVo;
import kh.test.first.member.model.vo.MemberVo;

/**
 * Servlet implementation class BoardReCommentController
 */
@WebServlet("/boardcomment")
public class BoardReCommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardReCommentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String bNoStr = request.getParameter("bNo");
		int bNo=0;
		try {
			bNo = Integer.parseInt(bNoStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if(bNo < 1) {  // 게시글번호가 온전하지 않은 상태로 판단함. 오류 상황으로 판단함.
			response.sendRedirect("boardlist");
			return;
		}
		String rContent = request.getParameter("rContent");
		String rWriter = "";
		String mId = "";
		// 로그인 정보 읽어오기
		MemberVo ssvo = (MemberVo)request.getSession().getAttribute("ssMemberVo");
		if(ssvo == null) {  // 로그인 되지 않은 상황 - 글작성불가 - login 페이지로 이동
			response.sendRedirect("login");
			return;
		} else {
			rWriter = ssvo.getNickname();
			mId = ssvo.getmId();
		}
		ReCommentVo vo = new ReCommentVo();
		vo.setbNo(bNo);
		vo.setrContent(rContent);
		vo.setmId(mId);
		vo.setrWriter(rWriter);
		int result = new BoardService().insertReCommentBoard(vo);
		if(result < 1) {  // comment 등록에 실패
			response.sendRedirect("boardlist");
		} else {
			response.sendRedirect("boardread?bno="+bNo);
		}
	}

}


















