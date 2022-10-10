package ua.lviv.lgs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ClientService clientService = ClientService.getClientsService();  
	private CatalogServis catalogServis = CatalogServis.getCatalogServis();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String catalogName = request.getParameter("catalogName");
		String frequency = request.getParameter("frequency");
		int price = Integer.parseInt(request.getParameter("price"));

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("laststName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		clientService.saveClient(new Client(firstName, lastName, email, password));
		catalogServis.saveCatalog(new Catalog(catalogName, frequency, price));
		
		HttpSession session = request.getSession(true);
		session.setAttribute("clientEmail", email);
		session.setAttribute("clientFirstName", firstName);
		
		session.setAttribute("catalogName", catalogName);
		session.setAttribute("frequency", frequency);
		session.setAttribute("price", price);
			
		//request.getRequestDispatcher("account.jsp").forward(request, response);
		request.getRequestDispatcher("login.jsp").forward(request, response);	
	}

}
