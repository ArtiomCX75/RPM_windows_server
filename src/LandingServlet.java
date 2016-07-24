import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LandingServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setStatus(HttpServletResponse.SC_OK);
		response.getWriter().println("<h1>" + "RPM - Remote Power Manager" + "</h1>");
		response.getWriter().println("<br><a href=/rpm/>" + " help<a>");
		response.getWriter().println("<br><a href=/rpm/sleep>" + " sleep or hibernate<a>");
		response.getWriter().println("<br><a href=/rpm/reboot>" + " reboot<a>");
		response.getWriter().println("<br><a href=/rpm/poweroff>" + " poweroff<a>");
	}
}