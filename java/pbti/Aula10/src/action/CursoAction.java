package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import dao.AlunoDao;

public class CursoAction {
	
	
	public String execute(){
		HttpServletRequest r =  ServletActionContext.getRequest();
		if(r.getParameter("tipo") != null && 
				r.getParameter("tipo").equals("ok")){
			return "success";	
		}else{
			return "error";
		}
		
	}

}
