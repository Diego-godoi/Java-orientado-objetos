
package lista3_1;

import classe.funcionario;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Lista3_1 {
    static funcionario fun[]=new funcionario[5];
    static int x,op;
    static DecimalFormat df = new DecimalFormat("#,##0.00");
    static Date dataHoje= new Date();
    
    public static void main(String[] args) {
        do{
            Digitar();
            Ordenar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op == 2);
        }while(op ==1);
    }
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Premio de 5 funcionarios");
        for(x=0;x<5;x++){
            fun[x] = new funcionario();
            fun[x].setNome(JOptionPane.showInputDialog("Nome do"+(x+1)+"° Funcionario: "));
            do{}while(!fun[x].setAdimissao(JOptionPane.showInputDialog("Data de admissao: ")));
            fun[x].setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario: ")));
        }
    }
    
    static void Ordenar(){
        int y;
        funcionario aux;
        
        for(x=0;x<4;x++){
            for(y=(x+1);y<5;y++){
                if (fun[x].getNome().compareTo(fun[y].getNome())>0){
                    aux = fun[x];
                    fun[x] = fun[y];
                    fun[y] = aux;
                }
            }
        }
    }
    
    static void Listar(){
        System.out.println("Relação de Funcionarios");
        System.out.println("Nome\t\tTempo de Serviço\t\tSalario\t\tPremio");
        for(x=0;x<5;x++){
            System.out.print(fun[x].getNome()+"\t\t");
            System.out.print(fun[x].Tempo(dataHoje)+"\t\t");
            System.out.print(df.format(fun[x].getSalario())+"\t\t");
            System.out.println(df.format(fun[x].Premio()));
        }
    }
    
}
