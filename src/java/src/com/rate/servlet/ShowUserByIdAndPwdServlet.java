package src.com.rate.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;
import src.com.rate.dao.impl.UserDaoImpl;
import src.com.rate.model.User;

/**
 * Servlet implementation class ShowUserByIdAndPwdServlet
 */
@WebServlet("/ShowUserByIdAndPwdServlet")
public class ShowUserByIdAndPwdServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		
		String code = "100";
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		User user = new UserDaoImpl().showuserByIdAndPwd(id, password);
		
		HttpSession session = request.getSession();
		if (user!=null) {
			//登陆成功 把用户信息保存在session
			session.setAttribute("user", user);
			code="200";//200表示验证成功
		}else{
			code = "100";
		}
		
		out.println(code);

                //将数据作为json格式数据输出为响应
                response.setContentType("application/x-json;charset=utf-8");
                //JSONObject类提供静态方法fromObject()用于将一个java对象转换成一个JSON对象
                //转换的时候，会使用Student类的各个属性名作为json对象的键的名称，也就是json对象的属性的名称
                //json对象的值就是Student类对象各个属性的值
                JSONObject obj = JSONObject.fromObject(code);
                //{"sbatch":"17软件J04","sgender":"男","sname":"杨宗凯","spassword":"123456","srollno":"2017204444"}
                response.getWriter().println(obj.toString());//将json对象以字符串格式输出，也就是返回数据
	}

	

}
