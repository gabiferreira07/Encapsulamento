package Encapsulamento;

public class Tema {

	private int id;
	private String nome;
	private double valorAluguel;
	private String corToalha;

	public Tema() {}

	public Tema(int id, String nome, double valorAluguel, String corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	//construtor
	public Tema( int id, String nome, String corToalha,double valorAluguel) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCorToalha() {
		return corToalha;
	}
	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public void valorAluguel(double valorAluguel) {
		if (id >= 0) {
			valorAluguel += id;
		}else {
			System.out.println("Aluguel inválido!");
		}
	}
	public void setvalorAluguel(double valorAluguel) {
		if (valorAluguel >= 0) { 
			this.valorAluguel = valorAluguel;
		} else {
			System.out.println("Valor do aluguel não pode ser negativo.");
		}
	}
}