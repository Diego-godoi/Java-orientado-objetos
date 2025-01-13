package lista5_04;

import classes.Diaristas;
import classes.Horistas;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Lista5_04 {
    static int op;
    static DecimalFormat df = new DecimalFormat("R$ #,##0.00");
    //arrays (vetores) que nao tem um limete definido
    static List<Horistas> horistas = new ArrayList<>();
    static List<Diaristas> diaristas = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        do{
            digitar();
            listar();
            do{
                op  = JOptionPane.showConfirmDialog(null, "Sair? ");
            }while(op==2);
        }while(op==1);
    }
    
    static void digitar(){
        int tipo=0;
        JOptionPane.showMessageDialog(null, "Calculo do salario de 10 funcionarios");
        for (int i = 0; i < 10; i++) {
            do{
                tipo = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    Tipo de Funcionarios
                                                                    1-Horista
                                                                    2-Diarista
                                                                    Tipo do"""+ (1+i) +"° funcionario: "));
            }while(!(tipo==1||tipo==2));
            switch(tipo){
                case 1:
                    String nome = JOptionPane.showInputDialog("Nome: ");
                    int tempo = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de horas trabalhadas: "));
                    float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor por hora: "));
                    horistas.add(new Horistas(nome, tempo, valorHora)); //metodo dos arrays para criar novos objetos e adicionar ao array horistas
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Nome: ");
                    tempo = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de dias trabalhadas: "));
                    valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor por hora: "));
                    diaristas.add(new Diaristas(nome, tempo, valorHora));//metodo dos arrays para criar novos objetos e adicionar ao array diaristas
                    break;
                default: //caso de tudo errado
                    JOptionPane.showMessageDialog(null, "Erro");
                    break;
            }
        }
    }
    
    static void listar(){
        float totalSalarios = 0;
        System.out.println("-----------------------Relacao dos Funcionarios-------------------------------");
        System.out.println("                            **HORISTAS**");
        System.out.println("Nome\t\tHoras\t\tSalario\t\tAdicional\t\tValor a Receber");
        //laco que percorrera todo o vetor/array de horistas
        for (Horistas horista : horistas) {
            System.out.print(horista.getNome()+"\t\t");
            System.out.print(horista.getTempo()+"\t\t");
            System.out.print(df.format(horista.salario())+"\t\t");
            System.out.print(df.format(horista.adicional())+"\t\t");
            System.out.println(df.format(horista.receber()));
            totalSalarios += horista.receber();
        }
        
        System.out.println("");
        
        System.out.println("                            **DIARISTAS**");
        System.out.println("Nome\t\tHoras\t\tSalario\t\tAdicional\t\tValor a Receber");
        //laco que percorrera todo o array de diaristas
        for (Diaristas d : diaristas) {
            System.out.print(d.getNome()+"\t\t");
            System.out.print(d.getTempo()+"\t\t");
            System.out.print(df.format(d.salario())+"\t\t");
            System.out.print(df.format(d.adicional())+"\t\t");
            System.out.println(df.format(d.receber()));
            totalSalarios += d.receber();
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Total de salarios a pagar: "+ df.format(totalSalarios));
    }
}
