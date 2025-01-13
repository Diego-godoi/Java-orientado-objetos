
package classe;

import javax.swing.JOptionPane;


public class Aluno {
    protected String nome;
    protected char sexo;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public boolean setSexo(char sexo) {
        if ((sexo == 'M') || (sexo == 'F')){
            this.sexo = sexo;
            return(true);
        }else{
            JOptionPane.showMessageDialog(null, "sexo invalido!");
                return(false);
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
