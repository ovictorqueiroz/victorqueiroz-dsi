package aula;
import java.util.Scanner;
import java.util.Random;

public class Aula {

    public static void main(String[] args) {
        //Criando objetos necessários;
        Scanner input = new Scanner (System.in);
        Random random = new Random();

        /*
        //EXERCÍCIO 1 - Jogo da Adivinhação

        int randNum = random.nextInt(20);
        int userInput, tent = 5, contTent = 0;


        System.out.println("[COMPUTADOR]: Eu pensei num número entre 0 e 20. Você precisa adivinhar!");
        System.out.print("Digite aqui que número você acha que eu pensei: ");

        while (tent >= 0){

            userInput = input.nextInt();

            if(userInput < randNum){
                System.out.println("É maior!");
            }

            else if (userInput > randNum){
                System.out.println("É menor!");
            }

            else if (userInput == randNum){
                System.out.println("Acertou!");
                System.out.println("Você precisou de " + contTent + " tentativas");
            }

            else{
                System.out.println("Entrada inválida");
            }
            tent--;
            contTent++;

            if (tent == 0){
                System.out.println("[GAME OVER] X__X");
                System.out.println("Suas tentativas acabaram!");
            }
        }
        */

        /*
        //EXERCICIO 2 - Jogo dos Dados

        String player1, player2;
        int contJogada = 1, dado1 = 0, dado2 = 0, jogp1=0, jogp2=0;


        System.out.print("Digite o nome do Jogador n°1: ");
        player1 = input.next();
        System.out.print("Digite o nome do Jogador n°2: ");
        player2 = input.next();

        System.out.println("Bem vindos, " + player1 + " e " + player2 + "!");
        System.out.println("Vamos começar!");
        System.out.println("");

        while(contJogada <= 3){

            dado1= random.nextInt(6);
            dado2= random.nextInt(6);

            /*
            Teste 1
            System.out.println("Resultado dado1: " + dado1);
            System.out.println("Resultado dado2: " + dado2);
            System.out.println("");
            */

            /*
            jogp1 = jogp1 + dado1;
            jogp2 = jogp2 + dado2;

            System.out.println("Jogada n° " + contJogada);
            System.out.println(player1 + ":" + jogp1);
            System.out.println(player2 + ":" + jogp2);
            System.out.println("");

            contJogada++;

        }
        */

        /*
        if(jogp1 > jogp2){
            System.out.println("");
            System.out.println(player1 + " é o vencedor!");
            System.out.println("[PLACAR]");
            System.out.println(player1 + ":" + jogp1);
            System.out.println(player2 + ":" + jogp2);
        }
        else{
            System.out.println("");
            System.out.println(player2 + " é o vencedor!");
            System.out.println("[PLACAR]");
            System.out.println(player2 + ":" + jogp2);
            System.out.println(player1 + ":" + jogp1);
        }
        */

            /*
        //EXERCICIO 3 - Contando vogais

        String palavra;

        System.out.print("Digite uma palavra para saber quantas vogais ela tem: ");
        palavra = input.next().toLowerCase();

        int cont =0;

        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;

        while(cont < palavra.length()){
            if(palavra.){
                contA++;
            }

            else {
            }

        }




        System.out.println(palavra + " contém " + contA + " letra A");
        */

        /*
       //EXERCICIO 4 - Asterisco

       String desenho = "", caracter = "$";
       int tamDesenho = 0, c = 0;

       while(c <= 5){
           System.out.println(desenho);
           tamDesenho = desenho.length();

           if (tamDesenho < 5){
            desenho = caracter + desenho;
           }

           c++;
        */


    }

}
