import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {

	public static void main(String[] args) throws Exception {
		Server server = new Server(60000);
		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");
		server.setHandler(context);
		context.addServlet(new ServletHolder(new SleepServlet()), "/rpm/sleep");
		context.addServlet(new ServletHolder(new RebootServlet()), "/rpm/reboot");
		context.addServlet(new ServletHolder(new PowerOffServlet()), "/rpm/poweroff");
		context.addServlet(new ServletHolder(new LandingServlet()), "/rpm/");
		server.start();
		server.join();
	}
}