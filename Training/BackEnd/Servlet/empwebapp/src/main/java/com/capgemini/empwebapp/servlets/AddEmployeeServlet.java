package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBean;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if (session != null) {
			// valid session
			// get data from add employee form
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("password");
			String designation = req.getParameter("designation");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			long mobile = Long.parseLong(req.getParameter("mobile"));

			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setMobile(mobile);

			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			if (isAdded) {
				out.println("<h2 style ='color : red '>Employee Record Successfully added");
			} else {
				out.println("<h2 style = 'color : red '>Something went wrong</h2>");
			}
			out.println("</body>");
			out.println("</html>");

		} else { // invalid session
			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 style ='color : red '>Please Login First!</h2>");
			out.println("</body>");
			out.println("</html>");

			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}
	}
}
