import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSelectivo {
    public static void main(String[] args) throws Exception {
        // analisarCandidato(1000);
        selecaoCandidatos();
        ArrayList<String> listaCandidatosSelecionados = selecaoCandidatos();
        imprimirCandidatos(listaCandidatosSelecionados);
        entrandoEnContato(listaCandidatosSelecionados);
    }

    static ArrayList<String> selecaoCandidatos() {
        String candidatos[] = { "Pedro", "Lucia", "Jacinta", "José", "Luis", "Pedro", "Pablo" };
        int candidatosSelecionados = 0, salarioBase = 2000, candidatoAtual = 0;
        ArrayList<String> listaCandidatosSelecionados= new ArrayList<>();

        while (candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {
            /*if (candidatoAtual >= candidatos.length) {
                candidatoAtual--;
            }*/
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidato %s, solicitou o salario de %.2f\n", candidato, salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga\n", candidato);
                candidatosSelecionados++;
                listaCandidatosSelecionados.add(candidato);
                

            }
            candidatoAtual++;

        }
        return listaCandidatosSelecionados;
    }
    
    static void imprimirCandidatos(ArrayList<String> listaCandidatos) {
        if (listaCandidatos.size() > 0) {
            for (int i = 0; i < listaCandidatos.size(); i++) {
                System.out.printf("Candidato Nº %d: %s\n", i + 1, listaCandidatos.get(i));
            }

        } else {
            System.out.println("No hay candidatos seleccionados");

        }
    }


    static void entrandoEnContato(ArrayList<String> listaCandidatos) {
        
     
        for (String candidato : listaCandidatos) {
            boolean continuarTentando = true;
            boolean atendeu = false;
            int tentativasRealizadas = 1;

        
            do {

                atendeu = atender();
                if (atendeu) {
                    System.out.printf(" o Candidato %s atendeu depois de %d tentativas\n", candidato,
                            tentativasRealizadas);
                    continuarTentando = !atendeu;
                } else 
                    if (tentativasRealizadas > 2 ) {
                        System.out.printf(" o Candidato %s não atendeu depois do numero maximo de tentativas: %d\n ",
                                candidato, tentativasRealizadas);
                        continuarTentando = false;

                    }
                
                tentativasRealizadas++;
            } while (continuarTentando && tentativasRealizadas <=3 );
        }
    }
    


    //metodo auxiliar
    static boolean atender() {
        boolean sucesso = new Random().nextInt(3) == 1;
        if (sucesso) {
            System.out.println("Contato realizado com sucesso\n");
        }
        return sucesso;
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


