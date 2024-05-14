import java.util.concurrent.ThreadLocalRandom;

public class selecaoCandidatos {
    public static void main(String[] args) throws Exception {
        static void selecaoCandidatos() {
            String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Daniela", "Jose"};
            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5) {
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido(); 
                
                System.out.println("O candidato" + candidato + "Solicitou esse valor: " + salarioPretendido);
                if (salarioBase >= salarioPretendido){
                    System.out.println("O candidato" + candidato + "foi selecionado");
                    candidatosSelecionados++;
                }
                candidatosSelecionados++;
            }
}       static void double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
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