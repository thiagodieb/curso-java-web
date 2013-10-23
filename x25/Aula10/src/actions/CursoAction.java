package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import beans.Curso;

public class CursoAction extends ActionSupport implements ModelDriven{
	
	private Curso curso  = new Curso();
	
	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void validate() {
		//System.out.println(ActionContext.getContext().getActionInvocation().getProxy());
	
		if(getCurso() != null && "".equals(getCurso().getNome())){
			addFieldError("curso.nome", "Campo de nome deve ser preenchido");
		}
		if(getCurso() != null &&  "".equals(getCurso().getEmpresa())){
			addFieldError("curso.empresa", "Campo da empresa deve ser preenchido");
		}
	}
	
	public String add(){
		System.out.println(this.getCurso());
		return "ok";
	}
	
	public String execute(){
		return "success";
	}

	public Object getModel() {
	
		return null;
	}

}
