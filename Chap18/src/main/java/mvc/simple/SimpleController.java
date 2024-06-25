package mvc.simple;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet {

	// 1. Http 요청받음
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}
	
	private void processRequest(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		//2. 요청 파악
		// request 객체로 부터 사용자의 요청을 파악
		String type = req.getParameter("type");
		
		//3. 요청한 기능 수행
		// 요청에 따라 알맞은 코드를 실행
		Object resultObject = null;
		if(type == null || type.equals("greeting")) {
			resultObject = "안녕하세요";
		}else if (type.equals("date")){
			resultObject = new java.util.Date();
		}else {
			resultObject = "Invaild Type";
		}
		
		//4. request or session에 처리한 결과를 저장
		req.setAttribute("result", resultObject);
		
		//5. RequestDispatcher로 알맞은 뷰로 포워딩
		RequestDispatcher dispatcher = req.getRequestDispatcher("/simpleView.jsp");
		dispatcher.forward(req, resp);
	}
	
}
