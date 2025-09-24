/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24set;
import java.util.Scanner;
/**
 *
 * @author Laboratorio-Info
 */
public class Aula24set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*
        //Exercicio 01
        
        for(int num = 1; num < 100; num++){
            if(num % 4 == 0){
                System.out.println("O número " + num + " é divisível por 4");
            }
        }
        */
        
        /*
        //Exercicio 02
        
        int numPares = 0;
        
        for(int c = 1; c <= 4; c++){
            System.out.println("Digite o " + c + "° número: ");
            int numInput = input.nextInt();
            
            if(numInput % 2 == 0){
                numPares += numInput;
            }
            else{
                System.out.println("Números ímpares não entram na soma");
            }
        }
        
        System.out.println("A soma dos números pares é: " + numPares);
        */
        
        /*
        //Exercicio 03
        for(int ano = 2000; ano <= 2025; ano++){
            if(ano % 4 == 0 && ano % 100 != 0){
                System.out.println(ano + " é um ano bissexto");
            }
        }
        */
        
        //Exercicio 04
        int fInterval = 0;
        int dInterval = 0;
        
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Digte o " + i + "° valor: ");
            int n = input.nextInt();
            
            if(n > 10 && n < 50){
                dInterval++;
            }
            else{
                fInterval++;
            }
        }
        
        System.out.println("Ao total, " + dInterval + " números estavam entre 10 e 50");
        
        
        
    }
    
}
