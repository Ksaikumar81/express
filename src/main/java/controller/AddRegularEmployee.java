package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeManager;
import model.RegularEmployee;

/**
 * Servlet implementation class AddRegularEmployee
 */
@WebServlet("/AddRegularEmployee")
public class AddRegularEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRegularEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("ID"));
		String name = request.getParameter("NAME");
		double salary = Double.parseDouble(request.getParameter("SALARY"));
		int bonus = Integer.parseInt(request.getParameter("BONUS"));
		
		response.setContentType("text/html");
		PrintWriter PW= response.getWriter();
		try {
			
			RegularEmployee R = new RegularEmployee();
			R.setEid(id);
			R.setEName(name);
			R.setSalary(salary);
			R.setBonus(bonus);
			
			EmployeeManager EM = new EmployeeManager();
			String ack = EM.addRegularEmployee(R);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			PW.print(e.getMessage());
		}
	}

}
