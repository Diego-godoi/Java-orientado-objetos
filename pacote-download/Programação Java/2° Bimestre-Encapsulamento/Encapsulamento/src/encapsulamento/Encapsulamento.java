
package encapsulamento;

import classe.Aluno;
import javax.swing.JOptionPane;

public class Encapsulamento {
    static Aluno a[]=new Aluno[5];
    static int x,op;
    
    public static void main(String[] args) {
        do{
            Digitar();
            Listar();
            do{
                op = JOptionPane.showConfirmDialog(null, "Sair?");
            }while(op == 2);
        }while (op == 1);
    }
     static void Digitar(){
         JOptionPane.showMessageDialog(null, "Cadastro de 5 alunos");
         for(x=0;x<5;x++){
             a[x] = new Aluno();
             a[x].setNome(JOptionPane.showInputDialog("Nome do "+(x+1)+"° aluno: "));
             a[x].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
             do{}while(!a[x].setSexo(Character.toUpperCase(JOptionPane.showInputDialog("Sexo (M/F): ").charAt(0))));
         }
     }
     
     static void Listar(){
         System.out.println("Relação de Estudantes");
         System.out.println("Nome\t\tSexo\t\tIdade");
         for(x=0;x<5;x++){
             System.out.print(a[x].getNome()+"\t\t");
             System.out.print(a[x].getSexo()+"\t\t");
             System.out.println(a[x].getIdade());
         }
     }
}