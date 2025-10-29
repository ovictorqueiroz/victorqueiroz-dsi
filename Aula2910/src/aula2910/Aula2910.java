package aula2910;
import javax.swing.JOptionPane;
/**
 *
 * @author Laboratorio-Info
 */
public class Aula2910 {

    public static void main(String[] args) {
        int [] codVend = {1,2,3,4,5,6,7,8,9,10};
        String [] nomeVend = {"Pedro", "Daniele", "Augusto", "Emily", "Tiago", "Rosana", "Alisson", "Meire", "Thales", "Valéria"};
        double [] totVnd = new double [10];
        double [] cmsVnd = new double [10];
	double [] vlrReceber = new double [10];
        String print = "";
        String print2 = "";
        
        
        for(int i = 0; i < 10; i++){
            String temp = JOptionPane.showInputDialog(null, "Cód: " + codVend[i] + " | Vendedor: " + nomeVend[i] + " | Digite o total da sua venda: ");
            totVnd[i] = Double.parseDouble(temp);
            print += totVnd[i] + " | ";
            
            temp = "";
            
            temp = JOptionPane.showInputDialog(null, "Digite o % da comissão:");
            cmsVnd[i] = Double.parseDouble(temp);
            print2 += cmsVnd[i] + " | ";
            
        }
            JOptionPane.showMessageDialog(null, print);
            JOptionPane.showMessageDialog(null, print2);
    }
    
}
