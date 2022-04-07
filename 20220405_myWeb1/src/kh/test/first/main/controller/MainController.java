package kh.test.first.main.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainController
 */
@WebServlet("")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
		request.getRequestDispatcher("WEB-INF/view/template_content.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/ : post");
		doGet(request, response);
	}
//	controller 에서 page 이동 방법
//	1. response.sendRedirect("서블릿url");
	// url에 이동한페이지가 나타남. 이전페이지를 누르면 login 나타나지 않음. 즉, login이라는 url이 이동할페이지로 replace됨.
	// 이동할페이지 = 서블릿url
	// 데이터전달가능 단, session, application
//	2. request.getRequestDispatcher("jsp파일경로").forward(request, response);
	// url에 이동한페이지가 나타나지 않고, url에는 이동전페이지가 나타남. 즉, controller url(login)이 유지됨.
	// 이동할페이지 = jsp파일
	// 데이터전달가능 단, request, page, context, session, application
//	3. ajax - 이동페이지 정하지 않음-why-왔던곳으로 돌아가므로 이동할페이지작성하지 않아야 함. TODO 
	
	
//	html 에서 page 이동 방법
//	1. <a href="서블릿url"> 				==> method는 항상 get
//	2. <form action="서블릿url" method="">   // js submit() ==> method선택가능 get/post
//		3. ajax TODO "서블릿url"						==> method선택가능 get/post
	
}
