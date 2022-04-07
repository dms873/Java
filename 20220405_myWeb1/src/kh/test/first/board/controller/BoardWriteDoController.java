package kh.test.first.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.first.board.model.service.BoardService;
import kh.test.first.board.model.vo.BoardVo;
import kh.test.first.member.model.vo.MemberVo;

/**
 * Servlet implementation class BoardWriteDoController
 */
@WebServlet("/boardwrite.do")
public class BoardWriteDoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardWriteDoController() {
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
		System.out.println("doPost: /boardwrite.do");
		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		System.out.println(bTitle);
		System.out.println(bContent);
		String bWriter = "";
		String mId = "";
		// 로그인 정보 읽어오기
		MemberVo ssvo = (MemberVo)request.getSession().getAttribute("ssMemberVo");
		System.out.println("로그인 정보 내놔 : " + ssvo);
		if(ssvo == null) {  // 로그인 되지 않은 상황 - 글작성불가 - login 페이지로 이동
			response.sendRedirect("login");
			return;
		} else {
			bWriter = ssvo.getNickname();
			mId = ssvo.getmId();
		}
		BoardVo vo = new BoardVo();
		vo.setbContent(bContent);
		vo.setbTitle(bTitle);
		vo.setmId(mId);
		vo.setbWriter(bWriter);
		int result = new BoardService().insertBoard(vo);
		if(result < 1) { // 글쓰기 실패
			response.sendRedirect("boardlist");
		} else{
			response.sendRedirect("boardlist");
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
