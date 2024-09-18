package Encapsulamento;

public class ObjetoEndereco {

	public static void main(String[] args) {

		Endereco endereco1 = new Endereco(1, "R. Carlos Weber", 835, "Escola Sesi", "Vila Leopoldina", "São Paulo", "05303-902", "SP");
		
        endereco1.exibirInformacoes();

		
		Endereco endereco2 = new Endereco(2, "Av. Padre Antônio Brunetti", 1360, "Escola Sesi", "Vila Rio Branco", "Itapetininga", "18208-080", "SP");

        endereco2.exibirInformacoes();

    }
}
	
