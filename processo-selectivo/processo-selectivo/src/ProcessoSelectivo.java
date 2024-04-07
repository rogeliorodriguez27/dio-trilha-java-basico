import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelectivo {
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1000);
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String candidatos[] = { "Pedro", "Lucia", "Jacinta", "José", "Luis", "Pedro", "Pablo" };
        int candidatosSelecionados = 0, salarioBase = 2000,candidatoAtual = 0;
        
        while (candidatosSelecionados <= 5) {
            if (candidatoAtual >= candidatos.length) {
                candidatoAtual--;
            }
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidato %s, solicitou o salario de %.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga", candidato);
                candidatosSelecionados++;

            }
            candidatoAtual++;
            
        }
    }



    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para o candidato");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Enviar contraproposta");

        } else {
            System.out.println("Aguardando o resto de candidatos");

        }
    }



    static double valorPretendido()
    {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }
}


