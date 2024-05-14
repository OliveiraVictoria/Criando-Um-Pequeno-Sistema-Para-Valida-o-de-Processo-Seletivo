import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletico {
    public static void main(String[] args) {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentivasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

        } while (continuarTentando && tentivasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + "na" + tentivasRealizadas);
        else
            System.out.println(
                    "Não conseguimos contato com " + candidato + "numero maximo de tentativas" + tentivasRealizadas);
    }

    // metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligara para o candidato com contra proposta");

        else {
            System.out.println("Aguardando demais candidatos");
        }
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice + 1) + "é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Mirela", "Daniela",
                "José" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou este valor de salário" + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
        }

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido)
            System.out.println("Ligara para o candidato com contra proposta");

        else {
            System.out.println("Aguardando demais candidatos");
        }
    }
}
