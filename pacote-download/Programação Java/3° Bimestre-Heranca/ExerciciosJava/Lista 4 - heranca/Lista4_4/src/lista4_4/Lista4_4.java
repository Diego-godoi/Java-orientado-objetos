
package lista4_4;

import classes.Venda;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class Lista4_4 {
static Venda v = new Venda();
static int x,op;
static DecimalFormat df =new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) {
        do{
            Digitar();
            Resumo();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
    
    static void Digitar(){
        JOptionPane.showMessageDialog(null, "Cadastro da venda de vinhos");
        for(x=0;x<4;x++){
            v.setQuantidadeCaixa(Integer.parseInt(JOptionPane.showInputDialog("Vinho "+v.getTipoNome(x)+"\n"+"Quantidade de caixas:")),x);
            v.setValorGarrafa(Float.parseFloat(JOptionPane.showInputDialog("Valor por garrafa:")), x);
        }
    }
    
    static void Resumo(){
        System.out.println("Resumo dos vinhos");
        System.out.println("Tipo\t\tGarrafas\t\tValor\t\tDesconto\t\tTotal");
        for(x=0;x<4;x++){
            System.out.print(v.getTipoNome(x)+"\t\t");
            System.out.print(v.Garrafas(x)+"\t\t");
            System.out.print(df.format(v.ValorNormal(x))+"\t\t");
            
            if(v.TemDesconto())
                System.out.print(df.format(v.Desconto(x))+"\t\t");
            else
                System.out.print("\t\t\t\t");
            
            System.out.println(df.format(v.ValorPagar(x)));
        }
    }
}