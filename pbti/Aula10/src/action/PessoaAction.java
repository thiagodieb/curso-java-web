package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import beans.Aluno;

public class PessoaAction {
	
	private Aluno aluno;
	
	public String cadastro(){
		return "success";
	}
	
	public String execute(){
		return "success";
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
