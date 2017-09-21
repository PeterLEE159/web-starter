package common;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet {
	Properties prop;
	String controllerPath = "controller.";
	String jspPath = "/WEB-INF/views/";
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String uri = request.getRequestURI().replace(request.getContextPath(), "");
			Controller controller = (Controller) Class.forName(controllerPath + prop.getProperty(uri)).newInstance();
			String url = controller.process(request);
			if(url.endsWith(".jsp")) {
				request.getRequestDispatcher(jspPath + url).forward(request, response);
			} else {
				response.sendRedirect(url);
			}
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	public void init() throws ServletException {
		prop = new Properties();
		try {
			prop.load(this.getClass().getResourceAsStream("mapping.properties"));
		} catch (IOException e) {
			throw new ServletException(e);
			
		}
	}
}
