package sample.controll;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sample.model.Calculator;

/**
 * Servlet implementation class CalculatorController
 */
public class CalculatorController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CalculatorController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out = response.getWriter();
		try {
			String action = request.getParameter("action");
			String a = request.getParameter("txtNumber1");
			String b = request.getParameter("txtNumber2");
			int number1 = Integer.parseInt(a);
			int number2 = Integer.parseInt(b);
			if (action.equals("+")) {
				Calculator tinh = new Calculator();
				out.write(number1 + " + " + number2 + " = " + tinh.addition(number1, number2));
			} else if (action.equals("-")) {
				Calculator tinh = new Calculator();
				out.write(number1 + " - " + number2 + " = " + tinh.subtraction(number1, number2));
			} else if (action.equals("*")) {
				Calculator tinh = new Calculator();
				out.write(number1 + " * " + number2 + " = " + tinh.multiplication(number1, number2));
			} else if (action.equals("/")) {
				Calculator tinh = new Calculator();
				out.write(number1 + " / " + number2 + " = " + tinh.division(number1, number2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
