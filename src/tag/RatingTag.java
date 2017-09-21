package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class RatingTag extends SimpleTagSupport {
	
	private String name;
	private double value;
	private String click;
	private String hover;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		boolean isClick = click != null;
		JspWriter out = this.getJspContext().getOut();
		String className = "star" + (isClick ? " star-hover" : "");
		
		out.println("<span class='rating'>");
		for(int i=0; i < 5 ; i++) {
			out.println("	<span class='"+className+ ( this.value >= (5 - i) ? " filled" : "" )+"' value='"+(5-i)+"')></span>");
		}
		if(this.name != null) 
			out.println("<input type='hidden' value='"+this.value+"'" + (this.name != null ? " name='"+this.name+"'" : "" ) + " id='ip-rating-value'>");
		
		if(isClick) out.println("	<input type='hidden' id='ip-star-click' value='"+this.click+"' disabled>");
		if(hover != null) out.println("		<input type='hidden' id='ip-star-hover' value='"+this.hover+"' disabled>");
		
		out.println("</span>");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}


	public String getClick() {
		return click;
	}


	public void setClick(String click) {
		this.click = click;
	}


	public String getHover() {
		return hover;
	}


	public void setHover(String hover) {
		this.hover = hover;
	}
	
}
