package ua.lviv.lgs;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lviv.lgs.ClientService;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		ClientService clientService = ClientService.getClientsService();
		Client client = clientService.getClients(login);
		if(client == null) {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		if(client.getPassword().equals(password)) {
			request.setAttribute("clientEmail", login);
			request.getRequestDispatcher("account.jsp").forward(request, response);
		}
		request.getRequestDispatcher("login.jsp").forward(request, response);

		
	}

}
