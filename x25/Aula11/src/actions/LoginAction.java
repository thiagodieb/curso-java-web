package actions;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.Validate;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private HttpSession s = ServletActionContext.getRequest().getSession(true);

	private  String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	 
	public String logout(){
		s.invalidate();
		return "success";
	}
	public String execute(){
		if(getLogin() != null && getLogin().equals("dieb") && getSenha().equals("123")){
			s.setAttribute("Usuario", true);
			return "success";
		}
		addActionError("Login e senha invalidos");
		return "input";
		
	}

}
