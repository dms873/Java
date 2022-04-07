package kh.test.first.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.first.board.model.service.BoardService;
import kh.test.first.board.model.vo.BoardVo;

/**
 * Servlet implementation class BoardReadController
 */
@WebServlet("/boardread")
public class BoardReadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardReadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet boardread");
		String bnoStr = request.getParameter("bno");
		System.out.println(bnoStr);
		int bNo=0;
		try {
			bNo = Integer.parseInt(bnoStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		if(bNo < 1) {  // 오류발생
			// 읽어온 게시글 번호가 이상할 경우
			// main page 이동할지 boardlist로 이동할지 요구사항에 명시
			response.sendRedirect("boardlist");
			return;
		}
		// db 읽어오기
		BoardVo vo = new BoardService().readBoardAndReComment(bNo);
		System.out.println(vo);
		if(vo == null) {
			// db query문 실행 중 오류발생
			response.sendRedirect("boardlist");
			return;
		}
		request.setAttribute("bVo", vo);
		request.getRequestDispatcher("WEB-INF/view/board/boardread.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
