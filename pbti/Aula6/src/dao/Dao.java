package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Aluno;

import db.Conexao;

public abstract class Dao<T> {
	
	protected Connection c;
	
	public Dao(){
		this.c = new Conexao().conectar();
	}

	public abstract void adicionar(T a);
	public abstract void excluir(T a);
	public abstract void excluir(int id);
	public abstract List<T> listar();
	public abstract T buscarPorId(int id);
	
	
}
