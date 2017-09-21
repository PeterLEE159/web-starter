package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class RatingTag extends SimpleTagSupport{
	
	private String id;
	private double point;
	private String click;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		boolean isClick = click != null;
		JspWriter out = this.getJspContext().getOut();
		String className = "star" + (isClick ? " star-hover" : "");
		out.println("<span class='rating'"+(id != null ? " id='"+this.id+"'" : "")+">");
		for(int i=0; i < 5 ; i++) {
			out.println("	<span class='"+className+ ( point >= (5 - i) ? " filled" : "" )+"'"+(isClick ? " onclick='execStar("+(5 - i)+", "+this.click+")'" : "" )+")></span>");
		}
		out.println("</span>");
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
