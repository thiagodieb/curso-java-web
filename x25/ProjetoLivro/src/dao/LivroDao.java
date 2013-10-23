package dao;

import beans.Livro;

public class LivroDao extends GenericDao<Livro>{
	public LivroDao() {
		super.classe = Livro.class;
	}
}
