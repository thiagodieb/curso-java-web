package actions;

import java.util.Locale;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport {
	
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String enviar(){
		return SUCCESS;
	}
	public String execute(){
		String [] eb = new String[2];
		eb[0] = "Substitui.......";
		eb[1] =  "novo texto";
		
		//ServletActionContext.getContext().setLocale(new Locale("en","US"));
		this.setMsg(getText("minha.msg",eb));
		return "success";
	}

}
