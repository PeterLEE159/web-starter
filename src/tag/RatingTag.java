package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class RatingTag extends SimpleTagSupport{
	private boolean hover;
	private String id;
	private double point;
	private String click;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = this.getJspContext().getOut();
		String className = "star" + (hover ? " star-hover" : "");
		out.println("<span class='rating'"+(id != null ? " id='"+this.id+"'" : "")+">");
		for(int i=0; i < 5 ; i++) {
			out.println("	<span class='"+className+ ( point >= (5 - i) ? " filled" : "" )+"'"+(hover ? " onclick='execStar("+(5 - i)+", "+this.click+")'" : "" )+")></span>");
		}
		out.println("</span>");
	}
	
	public boolean isHover() {
		return hover;
	}
	public void setHover(boolean hover) {
		this.hover = hover;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}

	public String getClick() {
		return click;
	}

	public void setClick(String click) {
		this.click = click;
	}

	
	
}
