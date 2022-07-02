package Financiamento.Class;

public class Cliente {

	private String nome;
	private double renda;
	private double endividamento;
	private int idade;
	private double parcelamento;
	/* =================== */
	double porcent_endividamento;
	double margem_financiamento;
	double end_total;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public double getEndividamento() {
		return endividamento;
	}

	public void setEndividamento(double endividamento) {
		this.endividamento = endividamento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(double parcelamento) {
		this.parcelamento = parcelamento;
	}

	public double getEnd_Total() {
		return ((parcelamento + endividamento) / renda) * 100;
	}

	public double getPorcent_Endividamento() {
		return (endividamento / renda) * 100;
	}
	
	public double getMargem_Financiamento() {
		return (0.4*renda) - endividamento;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", renda=" + renda + ", endividamento=" + endividamento + ", idade=" + idade
				+ ", parcelamento=" + parcelamento + ", porcent_endividamento=" + porcent_endividamento
				+ ", margem_financiamento=" + margem_financiamento + ", end_total=" + end_total + "]";
	}
	
	
	
}
