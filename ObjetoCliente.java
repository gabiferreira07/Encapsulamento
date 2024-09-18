package Encapsulamento;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(44);
		cliente1.setNome("Luana");
		cliente1.setTelefone("995362-2818");
		cliente1.setCpf("1234-5678/09");
		cliente1.setRg("1234-5678");
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		//**************************************
		
		Cliente cliente2 = new Cliente(55,"Carlos Sainz","425672-4321","09876-6354","1234-5678");
		
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
	}
}