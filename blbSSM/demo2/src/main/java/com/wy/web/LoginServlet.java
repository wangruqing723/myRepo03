package com.wy.web;

import com.wy.beans.UserInfo;
import com.wy.service.IUserInfoService;
import com.wy.service.Impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  // 处理post请求乱码问题
        String username = request.getParameter("username");
        String userPwd = request.getParameter("userPwd");

        IUserInfoService service = new UserInfoServiceImpl();
        UserInfo userInfo = service.findByName(username);
        if (userInfo.getUserName().equals(username)) {
            if (userInfo.getUserPwd().equals(userPwd)) {
                request.setAttribute("userInfo", userInfo);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.setAttribute("msg", "密码错误,请重新输入!!!");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("msg", "用户名不存在,请重新输入!!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); // 处理响应乱码问题:字节流需getBytes("UTF-8")
        // str = new String(str.getBytes("ISO-8859-1"), "UTF-8");   // 处理get请求乱码问题
        doPost(request, response);
    }
}
