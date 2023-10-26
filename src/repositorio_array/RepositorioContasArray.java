package repositorio_array; //pacote

public class RepositorioContasArray { //classe

	private Conta[] contas; //objeto conta
	private int indice; //objeto indice

	public RepositorioContasArray() {  //declarando array
		contas = new Conta[100]; //conta recebe um array com 100 posições
		indice = 0; //indice possui zero
	}

	public void inserir(Conta conta) { 
		contas[indice] = conta; //permite inserir valores da conta 
		indice = indice + 1; //incrementa mais 1 no indice
	}

	public void atualizar(Conta conta)  {
		int i = getIndice(conta.getNumero());
		if (i == indice) {
			System.out.println("Conta Não Encontrada");
		} else {
			contas[i] = conta;
		}
	}

	public void remover(String numero){
		int i = getIndice(numero);
		if (i == indice) {
			System.out.println("Conta Não Encontrada");
		} else {
			contas[i] = contas[indice - 1];
			indice = indice - 1;
		}
	}

	public Conta procurar(String numero) {
		Conta resposta = null;
		int i = getIndice(numero);
		if (i == indice) {
			System.out.println("Conta Não Encontrada");
		} else {
			resposta = contas[i];
		}
		return resposta;
	}

	public boolean existe(String numero) {
		boolean resposta;
		int i = getIndice(numero);
		if (i == indice) {
			resposta = false;
		} else {
			resposta = true;
		}
		return resposta;
	}

	private int getIndice(String numero) {
		String n;
		boolean achou = false;
		int i = 0;
		while ((!achou) && (i < indice)) {
			n = contas[i].getNumero();
			if (n.equals(numero)) {
				achou = true;
			} else {
				i = i + 1;
			}
		}
		return i;
	}
	
	public void imprimirContas() {
	    for (int i = 0; i < indice; i++) {
	        System.out.println("Número da Conta: " + contas[i].getNumero());
	        System.out.println("Saldo: " + contas[i].getSaldo());
	        System.out.println(); // Add a line break for better formatting
	    }
	}

}
