package br.edu.fatecpg.heranca3.model;
public class SistemaDeSeguranca implements Autenticavel {
	private String userCorreto = "admin";
	private String passwordCorreto = "1234";
	private boolean autenticado = false;

	@Override
	public boolean login(String usuario, String senha) {
		if (usuario.equals(userCorreto) && senha.equals(passwordCorreto)) {
			autenticado = true;
			return true;
		} else {
			autenticado = false;
			return false;
		}
	}

	@Override 
		public void logout() {
			autenticado = false;
			System.out.println("Logout realizado com sucesso!");
		}
	
	public boolean isAutenticado() {
		return autenticado;
	}
}
