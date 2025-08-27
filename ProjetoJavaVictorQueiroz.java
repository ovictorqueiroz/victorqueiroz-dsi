
package projetojavavictorqueiroz;

import java.util.Scanner;

public class ProjetoJavaVictorQueiroz {

    public static void main(String[] args) {
        // Introdução ao Switch Case
        Scanner input = new Scanner  (System.in);
        //EXERCICIO 1
        // crie um programa que exiba na tela os numeros impares entre 100 e 200.
        int cont = 100;
        int valor = 100;
        while(cont <= 200){
            if (valor  % 2 != 0){
                System.out.println(valor);
            }
            valor++;
            cont++;
        }
    
        }
        
   
    }
