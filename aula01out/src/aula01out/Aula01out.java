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
        //Menu
        int menuOpt = 0;
        
        switch(menuOpt){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida!", "Mensagem", 0);
                
        }
        
        
        
    }
    
}
