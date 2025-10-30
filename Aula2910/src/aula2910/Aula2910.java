package aula2910;
import javax.swing.JOptionPane;
/**
 *
 * @author Laboratorio-Info
 */
public class Aula2910 {

    public static void main(String[] args) {
        /*
        //EXERCICIO 04
        
        int [] codVend = {1,2,3,4,5,6,7,8,9,10};
        String [] nomeVend = {"Pedro", "Daniele", "Augusto", "Emily", "Tiago", "Rosana", "Alisson", "Meire", "Thales", "Valéria"};
        double [] totVnd = new double [10];
        double [] cmsVnd = new double [10];
	double [] vlrReceber = new double [10];
        String print = "";
        String print2 = "";
        String temp = "";
        
        //Valor das vendas
        for(int i = 0; i < 10; i++){
            temp = JOptionPane.showInputDialog(null, "Cód: " + codVend[i] + " | Vendedor: " + nomeVend[i] + " | Digite o total da sua venda: ", "Valor das vendas", -1);
            totVnd[i] = Double.parseDouble(temp);
            print += totVnd[i] + " | ";
            
            temp = "";   
        }
        
        //  Valor da comissão
        for(int i = 0; i < 10; i++){
            temp = JOptionPane.showInputDialog(null, nomeVend[i] + " vendeu R$ " + totVnd[i] +  " | Digite o % da comissão:", "Valor das comissões", -1);
            cmsVnd[i] = Double.parseDouble(temp);
            print2 += cmsVnd[i] + " | ";
            temp = "";
        }
        
        //Relatório das vendas
        String relatorio = "";
        for(int i =0; i < 10; i++ ){
            vlrReceber[i] = (totVnd[i] * (cmsVnd[i] / 100));
            relatorio += "Cód: " + codVend[i] + " | Vendedor: " + nomeVend[i] + " | Valor a receber: " + String.format("R$ %.2f", vlrReceber[i]) + "\n";
	}
        
        JOptionPane.showMessageDialog(null, relatorio, "Relatório de Vendas", 1);
        
        //Total de vendas
	double somaVendas = 0;
	for(int i =0; i < 10; i++ ){
			somaVendas += totVnd[i];
		}
		
	JOptionPane.showMessageDialog(null, "Total vendido: " + String.format("R$ %.2f", somaVendas), "Valor Total das Vendas", 1);
        
        //Maior valor a ser recebido (valor + quem é o vendedor)
		double maiorPgto = 0;
		int mlrVendedor = 0;
		
		for(int i =0; i < 10; i++ ){
                    if(vlrReceber[i] > maiorPgto){
			maiorPgto = vlrReceber[i];
			mlrVendedor = codVend[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "O vendedor " + mlrVendedor + " é o que tem o maior valor a ser recebido: R$ " + maiorPgto, "Melhor vendedor", 1);
		
		//Menor valor a ser recebido (valor + quem é o vendedor)
		double menorPgto = 999;
		int piorVendedor = 0;
		
		for(int i =0; i < 10; i++ ){
                    if(vlrReceber[i] >= 0 && vlrReceber[i] < menorPgto){
			menorPgto = vlrReceber[i];
			piorVendedor = codVend[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "O vendedor " + piorVendedor + " é o que tem o menor valor a ser recebido: R$ " + menorPgto, "Pior vendedor", 1);
	*/
        
        //EXERCICIO 01 - Matriz
        
        
        int [][] valor = new int[6][6];
        
        String total ="";
        for(int lin =0 ; lin < 6 ; lin++){
            for(int c =0; c < 6 ; c++){
           
           valor[lin][c]= 1;
           total = total + valor[lin][c] + " | ";
            
           if(valor[lin][c] > 0 && valor[lin][c] < 6){
                valor[lin][c]= 2;
                total = total + valor[1][c] + " | ";
           } 
            }
            total = total +"\n";          
        }
        
        
        JOptionPane.showMessageDialog(null, total);
        
    }
    
}
