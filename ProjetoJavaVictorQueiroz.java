
package projetojavavictorqueiroz;

import java.util.Scanner;

public class ProjetoJavaVictorQueiroz {

    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        
        /*
        //LISTA 1 | EXERCICIO 1
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
        */
        
        /*
        //LISTA 1 | EXERCICIO 2 - Crie um programa que exiba na tela os numeros de 100 ate 0;
        
        int cont = 100;
        while(cont >= 0){
            System.out.println(cont);
            cont--;
        }
        */
        
        /*
        //LISTA 1 | EXERCICIO 3 - receba a idade de n alunos e forneça a média
        
        int numAlunos = 0;
        int somaIdades = 0;
        int mediaIdades = 0;
        int cont = 0;
        
        int sysOpt = 0;
        
        while(sysOpt != 2){
        System.out.println("Escolha uma opção:\n[1] Calcular média de idade dos alunos\n[2] Sair\nSua escolha: ");
        sysOpt = input.nextInt();
            
            System.out.print("Digite a idade do aluno: ");
            somaIdades = input.nextInt();
            somaIdades += somaIdades;
            numAlunos++;
        }
        System.out.println("Saindo do sistema...");
        while(numAlunos <= 4){
        }
        
        mediaIdades = somaIdades / numAlunos;
        System.out.println("A média de idade do grupo é " + mediaIdades);
        */
        
        // LISTA 1 | EXERCICIO 4
        int quant = 0, contIni = 0;
      
        System.out.print("Digite quantas vezes a mensagem será exibida: ");
        quant = input.nextInt();
        
        while(contIni < quant){
            contIni++;
            System.out.println(contIni + " - Isso é um teste");
        }
        }
        
   
    }
