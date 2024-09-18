package Encapsulamento;

public class Endereco {

	// Atributos privados
	private int id;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String uf;

	// Construtor
	public Endereco(int id, String logradouro, int numero, String complemento, String bairro, String cidade, String cep, String uf) {
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.uf = uf;
	}
	// Getter e Setter para id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	// Getter e Setter para logradouro
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	// Getter e Setter para número
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// Getter e Setter para complemento
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	// Getter e Setter para bairro
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	// Getter e Setter para cidade
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	// Getter e Setter para cep
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	// Getter e Setter para uf
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	//Método para exibir as informações do endereço
	public void exibirInformacoes() {
		System.out.println("Endereço: " + logradouro + ", Número: " + numero + ", Complemento: " + complemento + ", Bairro: " + bairro + ", Cidade: " + cidade + ", CEP: " + cep + ", UF: " + uf);
	}
}
