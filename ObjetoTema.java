package Encapsulamento;

public class ObjetoTema {

	public static void main(String[] args) {

		Tema tema1= new Tema();

		tema1.setId(7);
		tema1.setNome("Dharana");
		tema1.setValorAluguel(800);
		tema1.setCorToalha("Preto e branco");

		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorToalha());

		Tema tema2 = new Tema();

		System.out.println(tema2.getId());
		System.out.println(tema2.getNome());
		System.out.println(tema2.getValorAluguel());
		System.out.println(tema2.getCorToalha());
	}
}

