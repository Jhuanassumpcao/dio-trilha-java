import java.util.concurrent.ThreadLocalRandom;

public class ValidacaoProcesso {
    public static void main(String[] args) throws Exception {
        selecaoCandidados();
    }
	

	static void selecaoCandidados() {
		// Array com a lista de candidatos

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

		int cadidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(cadidatosSelecionados < 5 ){
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O cadidato " + candidato + " Solicitou " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O cadidato " + candidato + " foi selecionado ");

				cadidatosSelecionados++;
			}
			candidatoAtual++;
		}

	}

// Método que simula o valor pretendido


	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("ligar para o candidato");
			
		}else if(salarioBase == salarioPretendido){
			System.out.println("ligar para o candidato com contra proposta");
		}else {
			System.out.println("aguardando o resultado");
		}

	}
}
