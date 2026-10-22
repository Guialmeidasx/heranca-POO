package br.edu.fatecpg.heranca3.model;

public interface Autenticavel {
	boolean login(String usuario, String senha);
	void logout();
}

