package com.hillel.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-form")
public class RegisterFormServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    PrintWriter out = resp.getWriter();
    out.println("<html>");
    out.println("<body>");
    out.println("<form action=\"/servlets/register\" method=\"POST\">");
    out.println("<table>");
    out.println("<tr>");
    out.println("<td>Login: </td>");
    out.println("<td><input type=\"text\" name=\"login\"/></td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td>Password: </td>");
    out.println("<td><input type=\"password\" name=\"password\"/></td>");
    out.println("</tr>");
    out.println("<tr>");
    out.println("<td></td>");
    out.println("<td><input type=\"submit\" value=\"Register\"/></td>");
    out.println("</tr>");
    out.println("</table>");
    out.println("</form>");
    out.println("</body>");
    out.println("</html>");
  }
}
