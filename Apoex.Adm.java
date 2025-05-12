	private String rg;
	private String cpf;
	
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrador(int re, String rg, String cpf) {
		super();
		this.re = re;
		this.rg = rg;
		this.cpf = cpf;
		
	public int getRe() {
		return re;
	}
	public void setRe(int re) {
		this.re = re;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Funcionario [re=" + re + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
}
