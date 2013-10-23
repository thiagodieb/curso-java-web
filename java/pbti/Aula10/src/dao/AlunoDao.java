package dao;

import java.util.List;

import beans.Aluno;

public class AlunoDao extends GenericDao<Aluno>{

	public List<Aluno> list(){
		return super.list(Aluno.class.getName());
	}	

}
