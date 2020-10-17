package projeto_gripe;

import java.util.Scanner;
import java.util.Random;
import java.io.IOException;


public class Projeto_Gripe {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        Influenza inf;
        
        int i = 0;
        Cabeca cab = new Cabeca();
        
        for(int j = 0; j < 5; j++){
            inf = new Influenza(5,ran.nextInt(60),ran.nextInt(30));
            cab.alocaInfluenzas(inf);
        }
        
        cab.instanciaLeucocitos();
        while(true){
            cab.verificaCelula();
            cab.mataLeucocitos();
            cab.limpaMapa();
            cab.moveLeucocitos();
            if(i % 2 == 0){
                cab.moveInfluenzas();
            }
            cab.contaLeucocitos();
            cab.contaInfluenzas();
            cab.contaTempo(i);
            cab.desenhaCabeca();
            i++;
            Thread.sleep(1000);
        }
    } 
}
