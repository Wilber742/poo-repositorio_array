package repositorio_array;

public class RepositorioContasArray {

	private Conta[] contas;
	private int indice;

	public RepositorioContasArray() {
		contas = new Conta[100];
		indice = 0;
	}

	public void inserir(Conta conta) {
		contas[indice] = conta;
		indice = indice + 1;
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