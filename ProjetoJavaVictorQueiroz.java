
package projetojavavictorqueiroz;

import java.util.Scanner;

public class ProjetoJavaVictorQueiroz {

    public static void main(String[] args) {
        // Introdução ao Switch Case
        Scanner input = new Scanner  (System.in);
        System.out.print("Escolha uma opção de 1 a 3:");
        int opt = input.nextInt();
        
        switch(opt){
            case 1:
                System.out.println("Você escolheu a opção 1");
                break;
                
            case 2:
                System.out.println("Você escolheu a opção 2");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3");
                break;
                
            default:
                System.out.println("Você escolheu a opção DEFAULT");
                break;
        }
    }
}
