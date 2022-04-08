package kh.test.first.main.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import kh.test.first.board.model.service.BoardService;
import kh.test.first.board.model.vo.BoardVo;

/**
 * Servlet implementation class AjaxSampleController
 */
@WebServlet("/AjaxSampleController.ax")
public class AjaxSampleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxSampleController() {
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
		
		
		System.out.println("doPost");
		// controller servlet이면 out관련 3줄 세트로 꼭 있어야함! 
		PrintWriter out = response.getWriter();
		
		String param1 = request.getParameter("id");
		String param2 = request.getParameter("pwd");
		System.out.println(param1);
		
		int currentPage = 1;
		
		final int pageSize = 20;
		final int pageBlock = 3;
		int totalCnt = countBoardList();
		
		// paging 처리
		int pageCnt = (totalCnt/pageSize) + (totalCnt%pageSize==0 ? 0 : 1);
		int startPage = 1;
		int endPage = 1;
		if(currentPage%pageBlock == 0) {
			startPage = ((currentPage/pageBlock)-1)*pageBlock + 1;
		} else {
			startPage = (currentPage/pageBlock)*pageBlock + 1;
		}
		endPage = startPage + pageBlock - 1;
		if(endPage > pageCnt) {
			endPage = pageCnt;
		}
		System.out.println("paging" + startPage+"~"+endPage);
		
		// rownum 처리
		int startRnum = 0;
		int endRnum = 0;
		startRnum = (currentPage-1)*pageSize + 1;
		endRnum = startRnum + pageSize - 1;
		if(endRnum > totalCnt) {
			endRnum = totalCnt;
		}
		
		ArrayList<BoardVo> volist = new BoardService().listBoard(startRnum, endRnum);
		System.out.println(volist);
		
		// out에 실어서 보냄
		// request.setAttribute("boardVolist", volist);
		// 없어야 함
		// request.getRequestDispatcher("WEB-INF/view/board/boardlist.jsp").forward(request, response);
		
		
		// 예시4) 여러 값을 전달하고 싶을 때(key: value, key: value, ..)하는 모양으로 list 모양으로 담아줌.
		// 주로 장바구니, 주문내역
		Gson gobj = new GsonBuilder().setPrettyPrinting().create();
		ArrayList<HashMap<String, Object>> listmap = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		for(int i = 0; i < 5; i++) {
			// value자리에 어떤 모양이어도 상관없음!
			map.put("boardVolist", volist);
			map.put("currentPage", currentPage);
			map.put("startPage", startPage);
			map.put("endPage", endPage);
			map.put("pageCnt", pageCnt);
			
			listmap.add(map);
		}
		String gobjStr = gobj.toJson(listmap);
		out.println(gobjStr);
		
		
		// vo형식이면 key: value; 형식으로 넣어주어야 함!
		
		// 예시3) 여러 값을 전달하고 싶을 때(key: value, key: value, ..) -> json + map사용
		// 주로 게시글 등 사용
//		HashMap<String, Object> map = new HashMap<String, Object>();
//		// value자리에 어떤 모양이어도 상관없음!
//		map.put("boardVolist", volist);
//		map.put("currentPage", currentPage);
//		map.put("startPage", startPage);
//		map.put("endPage", endPage);
//		map.put("pageCnt", pageCnt);
//
//		String gobjStr = gobj.toJson(map);
//		System.out.println(gobjStr);
//		out.println(gobjStr);
		
		// 예시2) java 참조자료형 객체 1개 전달할 때 -> json사용
//		String gobjStr = gobj.toJson(volist);
//		out.print(gobjStr);
//		out.println(gobj.toJson(volist));
		
		
		// 예시1) 단순 값 전달 "성공" / "실패" / 1 / 0 - 주로 login 성공여부, 글 작성 성공여부
//		out.println("성공");
		
		out.flush();
		out.close();
	}
	public int countBoardList() {		
		int result = new BoardService().countBoardList();
		return result;
	}

}
