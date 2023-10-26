package repositorio_array;

public class Programa {

	public static void main(String[] args) {
		Conta conta1 = new Conta("123",100);
		Conta conta2 = new Conta("345",200);
		RepositorioContasArray banco = new RepositorioContasArray();
		
		
		banco.inserir(conta1);
		banco.inserir(conta2);
		
		Conta conta = banco.procurar("123");
		System.out.println(conta.getSaldo());
		
		banco.imprimirContas();

	}

}
