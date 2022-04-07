package kh.test.first.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kh.test.first.member.model.service.MemberService;
import kh.test.first.member.model.vo.MemberVo;

/**
 * Servlet implementation class MemberLoginController
 */
@WebServlet("/login")
public class MemberLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberLoginController() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet: /login");
		request.getRequestDispatcher("WEB-INF/view/member/login.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost: /login");
		// request 인자 확인
		String mId = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(mId);
		
		// 한글깨짐
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// DB 확인
		MemberVo vo = new MemberService().login(mId, pwd);
		if(vo == null) {  // 로그인실패
			System.out.println("로그인 실패");
			response.sendRedirect("login");
		}else {  // 로그인성공
			request.getSession().setAttribute("ssMemberVo", vo);
//			response.sendRedirect("./");  // 상대경로
			response.sendRedirect(request.getContextPath()+"/");  // 절대경로사용시 request.getContextPath() 과 함께 작성해야함.
			//절대하지 마세요.response.sendRedirect("myWeb1"+"/");  // 절대경로사용시 request.getContextPath() 과 함께 작성해야함.
		}
		
		
	}
//	controller 에서 page 이동 방법
//	1. response.sendRedirect("컨트롤러url");
	// url에 이동한페이지가 나타남. 이전페이지를 누르면 login 나타나지 않음. 즉, login이라는 url이 이동할페이지로 replace됨.
	// 이동할페이지 = controller의url
	// 데이터저장가능 단, session, application  scope 객체 사용
//	2. request.getRequestDispatcher("jsp파일").forward(request, response);
	// url에 이동한페이지가 나타나지 않고, url에는 이동전페이지가 나타남. 즉, controller url(login)이 유지됨.
	// 이동할페이지 = jsp파일
	// 데이터전달가능 단, request, page, context, session, application
//	3. ajax - 이동페이지 정하지 않음-why-왔던곳으로 돌아가므로 이동할페이지작성하지 않아야 함. TODO 
	
	
//	jsp 에서 page 이동 방법
//	1. <a href="컨트롤러url"> 				==> method는 항상 get
//	2. <form action="컨트롤러url" method="">   // js submit() ==> method선택가능 get/post
//	3. ajax TODO "컨트롤러url"				==> method선택가능 get/post
	
}
