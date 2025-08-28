
package projetojavavictorqueiroz;

import java.util.Scanner;

public class ProjetoJavaVictorQueiroz {

    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        
        /*
        //LISTA 1 | EXERCICIO 1 - crie um programa que exiba na tela os numeros impares entre 100 e 200.
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
        

        //LISTA 1 | EXERCICIO 3 - receba a somaIdade de n alunos e forneça a média
        int idadeAluno =0, somaIdade =0, cont = 0;
        int mediaIdades =0, loopControl = -1;

        //15, 14, 20, 27
        while (true){
            System.out.println("Digite a idade do aluno [Digite 0 para parar]");
            idadeAluno = input.nextInt();

            if (idadeAluno == 0){
                break;
            }
            
            somaIdade += idadeAluno;
            cont++;
        }

        if (cont > 0){
        mediaIdades = somaIdade / cont;
        }

        System.out.println("A média das idades é: " + mediaIdades);

        /*
        // LISTA 1 | EXERCICIO 4 - eceba  via teclado quantas vezes a mensagem "Isso é um teste" deve aparecer na tela
        int quant = 0, contIni = 0;
      
        System.out.print("Digite quantas vezes a mensagem será exibida: ");
        quant = input.nextInt();
        
        while(contIni < quant){
            contIni++;
            System.out.println(contIni + " - Isso é um teste");
        }
        */
        
        }
        
   
    }
