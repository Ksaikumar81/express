package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ContractEmployee;
import model.EmployeeManager;

/**
 * Servlet implementation class AddContractEmployee
 */
@WebServlet("/AddContractEmployee")
public class AddContractEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContractEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("ID"));
		String name = request.getParameter("NAME");
		double payperhour = Double.parseDouble(request.getParameter("PAYPERHOUR"));
		String duration = request.getParameter("DURATION");
		
		
		response.setContentType("text/html");
		PrintWriter PW= response.getWriter();
		try {
			ContractEmployee C = new ContractEmployee();
			C.setEid(id);
			C.setEName(name);
			C.setPayperhour(payperhour);
			
			C.setDuration(duration);
			
			EmployeeManager EM = new EmployeeManager();
			String ack = EM.addContractEmployee(C);
			PW.println(ack);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			PW.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
