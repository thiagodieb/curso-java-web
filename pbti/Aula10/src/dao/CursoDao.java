package dao;

import java.util.List;

import beans.Curso;

public class CursoDao extends GenericDao<Curso>{
	
	public List<Curso> list(){
		return super.list(Curso.class.getName());
	}	
}
