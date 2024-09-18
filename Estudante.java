package Encapsulamento;

public class Estudante {

	private String nome;
	private  double nota1;
	private double nota2;

	//Construtor
	public Estudante(String nome, double nota1, double nota2) {
		this.nome = nome;
		setNota1(nota1);
		setNota2(nota2);
	}

	//Getter e Setter para nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Getter e Setter para nota1 bcom validação
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		if(nota1 >= 0 && nota1 <= 10) {
			this.nota1 = nota1;
		} else {
			System.out.println("Nota 1 inválida! Deve estar entre 0 e 10.");
		}
	}
	//Getter e Setter para nota2 bcom validação
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		if(nota2 >= 0 && nota2 <= 10) {
			this.nota2 = nota2;
		} else {
			System.out.println("Nota 2 inválida! Deve estar entre 0 e 10.");
		}
	}
	//Método para calcular a média
	public double calcularMedia() {
		return(nota1 + nota2) / 2;
	}
	//Método para exibir as informações do estudante
	public void exibirInformacoes() {
		System.out.println("Estudante: " + nome + ", Méida: " + calcularMedia());
	}
}

