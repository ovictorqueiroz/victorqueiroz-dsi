package aula01out;
import java.util.Random;
import javax.swing.JOptionPane;

 class Aula01out {

 
    public static void main(String[] args) {
        /*
        double peso, altura, IMC = 0;
        String temp;
        
        temp = JOptionPane.showInputDialog(null, "Digite seu peso em kg (80)", "Peso", 3);
        peso = Double.parseDouble(temp);
        
        temp = JOptionPane.showInputDialog(null, "Digite sua altura em metros (1.58)", "Altura", 3);
        altura = Double.parseDouble(temp);
        
        IMC = (peso / (altura * altura));
        
        JOptionPane.showMessageDialog(null, "Seu IMC é " + String.format("%.2f", IMC), "IMC", 1);
        
         if( IMC <= 18.5){
            JOptionPane.showMessageDialog(null, "Você está abaixo do peso", "IMC", 1);    
             
             
         }else if ( IMC <= 25 ){
            JOptionPane.showMessageDialog(null, "Você está no peso ideal", "IMC", 1);    
             
         }else if ( IMC <= 30){
            JOptionPane.showMessageDialog(null, "Você está acima do peso", "IMC", 1);    
             
         }else{
            JOptionPane.showMessageDialog(null, "Você está obeso", "IMC", 1);    
         }  
        */
        
        //DESAFIO - LOTERIA
        Random random = new Random();
        
        int menuOpt = 0;
        
        while(menuOpt != 5){
        String temp = JOptionPane.showInputDialog(null, "Escolha o tipo de Jogo: \n [1] QUINA \n [2] SENA \n [3] DUPLA SENA \n [4] LOTOMANIA \n [5] SAIR", "Loteria Virtual", -1);
        
        menuOpt = Integer.parseInt(temp);
        
        switch(menuOpt){
            case 1:
                String qFinal = "";
                int [] quina = new int [5];
                for(int c = 0; c < 5; c++){
                    int rQuina = random.nextInt(80);
                    quina[c] = rQuina;
                    qFinal += quina[c] + " | ";
                }
                JOptionPane.showMessageDialog(null, " | " + qFinal, "Resultado - Quina", -1);
                break;
                
            case 2:
                String sFinal = "";
                int [] sena = new int [6];
                for(int c = 0; c < 6; c++){
                    int rSena = random.nextInt(60);
                    sena[c] = rSena;
                    sFinal += sena[c] + " | ";
                }
                JOptionPane.showMessageDialog(null, " | " + sFinal, "Resultado - Sena", -1);
                break;
                
            case 3:
                String dsFinal = "";
                int [] duplaSena = new int [12];
                for(int c = 0; c < 12; c++){
                    int rSena = random.nextInt(50);
                    duplaSena[c] = rSena;
                    dsFinal += duplaSena[c] + " | ";
                    if(c % 6 == 0){
                 						dsFinal = "\n";
                 					}
                }
                JOptionPane.showMessageDialog(null, " | " + dsFinal, "Resultado - Dupla Sena", -1);
                break;
                
            case 4:
                String lotoFinal = "";
                int [] lotomania = new int [20];
                for(int c = 0; c < 20; c++){
                    int rSena = random.nextInt(100);
                    lotomania[c] = rSena;
                    lotoFinal += lotomania[c] + " | ";
                    if(c % 5 == 0){
                						lotoFinal = "\n";
                					}
                }

                JOptionPane.showMessageDialog(null, " | " + lotoFinal, "Resultado - Lotomania", -1);
                
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null, "Saindo do Sistema...", "Saída", 2);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!", "Mensagem", 0);    
            }
        }
    }
        
        
        
    }
    

