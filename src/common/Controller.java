package common;

import javax.servlet.http.HttpServletRequest;

public abstract class Controller {
	public abstract String process(HttpServletRequest request);
}
