
package lista3_2;

import classe.aposentadores;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista3_2 {
    
    static aposentadores apo[] = new aposentadores[5];
    static int x,op,mes;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) {
        do{
            Digitar();
            Ordenar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair ?");
            }while (op == 2);
        }while (op ==1);
    }
    
    static void Digitar(){
            JOptionPane.showMessageDialog(null, "Aposentadoria de 5 aposentadores");
            for(x=0;x<5;x++){
                apo[x]  = new aposentadores();
                apo[x].setNome(JOptionPane.showInputDialog("Nome do"+(x+1)+"° aposentador: "));
                do{
                    mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de aniversario: "));
                }while((mes>0)&&(mes<13));
                apo[x].setTempo(Integer.parseInt(JOptionPane.showInputDialog("Tempo de aposentadoria (ano): ")));
                apo[x].setValor_atual(Float.parseFloat(JOptionPane.showInputDialog("Valor atual da aposentadoria: ")));
            }
    }
    
    static void Ordenar(){
        int y;
        aposentadores aux;
        for(x=0;x<4;x++){
            for(y=(x+1);y<5;y++){
                if (apo[x].getNome().compareTo(apo[y].getNome())>0){
                    aux = apo[x];
                    apo[x] = apo[y];
                    apo[y] = aux;
                }
            }
        }
    }

    static void Listar(){
        System.out.println("Relacao dos aposentadores");
        System.out.println("Nome\t\tValor atual\t\tValor com aumento");
        for(x=0;x<5;x++){
            System.out.print(apo[x].getNome()+"\t\t");
            System.out.print(df.format(apo[x].getValor_atual())+"\t\t");
            System.out.println(df.format(apo[x].valor_final()));
        }
    }
}
