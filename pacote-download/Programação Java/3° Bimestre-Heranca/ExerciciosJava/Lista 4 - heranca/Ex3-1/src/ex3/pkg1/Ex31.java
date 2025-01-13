
package ex3.pkg1;

import classe.Socio;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Ex31 {
    
static Socio s[]=new Socio[5];
static int x,op;
static DecimalFormat df = new DecimalFormat("#,##0.00");

    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while (op ==2);
        }while (op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Mensalidade de 5 socios");
        for(x=0;x<5;x++){
            s[x]=new Socio();
            s[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° socio: "));
            JOptionPane.showMessageDialog(null, "Categorias A/B/C");
            do{}while(!s[x].setCat(JOptionPane.showInputDialog("Categoria: ").toUpperCase().charAt(0)));
            s[x].setMens(Float.parseFloat(JOptionPane.showInputDialog("Mensalidade atual: ")));
        }
    }
    
    static void Listar(){
        System.out.println("Relacao dos socios");
        System.out.println("Nome\t\tCategoria\t\tNova mensalidade");
        for(x=0;x<5;x++){
            System.out.print(s[x].getNome()+"\t\t");
            System.out.println(s[x].getCat()+"\t\t");
            System.out.println(s[x].mensalidade());
        }
    }
    
}
