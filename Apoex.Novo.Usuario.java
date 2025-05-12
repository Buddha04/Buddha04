package br.com.apoex;

import java.util.Date;

public class NovoUsuario {
	private String nome;
	private String email;
	private String senha;
	private String confsenha;
	public NovoUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NovoUsuario(, String nome,String email, String senha, String confsenha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.confsenha = confsenha;
	}
	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getConfsenha() {
		return confsenha;
	}
	public void setConfsenha(String confsenha) {
		this.confsenha = confsenha;
	}	
	@Override
	public String toString() {
		return "NovoUsuario [nome=" + nome + ", email=" + email + ", senha=" + senha + " confsenha=" + confsenha + "]";
	}
}
