package src.com.rate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.com.rate.dao.impl.UserDaoImpl;
import src.com.rate.model.User;

/**
 * Servlet implementation class AddUserServlet
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String code = "100";
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		User user = new User(id,password,null,null,null,phone,null,null,null);
		int i = new UserDaoImpl().insert(user);
		
		if (i==1) {
			//成功插入一条数据
			code = "200";
		}else{
			code = "100";
		}
		
		out.println(code);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
