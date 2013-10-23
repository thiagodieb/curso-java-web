package action;
 
import java.util.Locale;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
 
public class LoginAction extends ActionSupport{
 
	private String login = "aaaa";
	private String senha;
 
	public LoginAction() {
		setLogin("Novo login");
	}
	public String getSenha() {
		return senha;
	}
 
	public void setSenha(String senha) {
		this.senha = senha;
	}
 
	public String getLogin() {
		return login;
	}
 
	public void setLogin(String login) {
		this.login = login;
	}
  
	public String execute() { 
		if(getLogin().equals("dieb") && getSenha().equals("123")){
			return SUCCESS;	
		}else{
			//addActionMessage(getText("form.invalido"));
			return INPUT;	
		} 
	} 
	public void validate(){
		
		//ServletActionContext.getContext().setLocale(new Locale("en","US"));
		
		if("".equals(getLogin())){
			addFieldError("login",getText("login.obrigatorio")); 
		}
		if("".equals(getSenha())){
			String [] a = {"Senhasss"};
			addFieldError("senha", getText("campo.obrigatorio",a)); 
		}
	}
}