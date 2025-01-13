
package lista4_6;

import classes.Cliente;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class Lista4_6 {
static int x,op;
static DecimalFormat df= new DecimalFormat("#,##0.00");
static Cliente c[] = new Cliente[6];
static Date dataHoje = new Date();
    
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair do programa? ");
            }while(op==2);
        }while(op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "CADASTRO DE 6 CLIENTES");
        for(x=0;x<6;x++){
            c[x] = new Cliente();
            c[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° cliente: "));
            do{}while(!c[x].setSexo(Character.toUpperCase(JOptionPane.showInputDialog("Sexo(M/F): ").charAt(0))));
            do{}while(!c[x].setNasc(JOptionPane.showInputDialog("Data de Nascimento (dd/mm/aaaa): ")));
        }
    }
    
    static void Listar(){
        Calendar cal = Calendar.getInstance();
        int mesH;
        mesH = cal.get(Calendar.MONTH);
        System.out.println("RELAÇÃO DOS ANIVERSARIANTES DO MÊS");
        System.out.println("Nome\t\tSexo\t\tIdade");
        for(x=0;x<6;x++){
            if(c[x].Idade(dataHoje)== mesH){
                System.out.print(c[x].getNome()+"\t\t");
                //Sexo
                System.out.println(c[x].Idade(dataHoje));
            }
        }
    }
}
