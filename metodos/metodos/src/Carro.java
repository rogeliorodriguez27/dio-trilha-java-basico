public class Carro {
String modelo= "";
int rodas = 0;
int portas = 0;
double velocidade =0;
static boolean ligado = false;


public void ligar() {
    ligado = true;
    System.out.println("ligado");

}

public void desligar() {
    ligado = false;
    System.out.println("desligado");

}

public void aumentarVelocidade() {
    velocidade++;
    System.out.println("velocidade: "+ velocidade);

}

public void diminuiVelocidade() {
    if (velocidade>0) {
        velocidade--;
        System.out.println("velocidade: "+ velocidade);
 
    } else {
        System.out.println("Carro detenido");
    }
}

}
