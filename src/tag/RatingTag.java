package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class RatingTag extends SimpleTagSupport {
	
	private String name;
	private String id;
	private double value;
	private String click;
	private String hover;
	
	
	@Override
	public void doTag() throws JspException, IOException {
		
		boolean isClick = click != null;
		JspWriter out = this.getJspContext().getOut();
		String className = "star" + (isClick ? " star-hover" : "");
		String onclick = null;
		String onhover = null;
		out.println("<span class='rating'>");
		for(int i=0; i < 5 ; i++) {
			onclick = (isClick ? " onclick=\"chkStar("+(5 - i)+", "+this.click+(this.name != null ? ", '"+this.name+"'" : "")+")\"" : "");
			onhover = (hover != null ? " onmouseover='"+hover+"("+(5-i)+")'" : "");
			out.println("	<span class='"+className+ ( this.value >= (5 - i) ? " filled" : "" )+"'"+onclick+onhover+")></span>");
		}
		out.println("</span>");
		
		if(this.name != null || this.id != null) 
			out.println("<input type='hidden' value='"+this.value+"'"+ (this.name != null ? " name='"+this.name+"'" : "") + 
					(this.id != null ? " id='"+this.id+"'" : "")+">");	
	}
	

	

	public String getHover() {
		return hover;
	}




	public void setHover(String hover) {
		this.hover = hover;
	}




	public String getName() {
		return name;
	}


	

	public void setName(String name) {
		this.name = name;
	}

	


	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
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

	
	
}
