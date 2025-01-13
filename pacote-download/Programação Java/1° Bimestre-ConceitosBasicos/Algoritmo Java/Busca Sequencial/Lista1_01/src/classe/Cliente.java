
package classe;


public class Cliente {
    public String nome;
    public char sexo;
    public int idade;
    
    public boolean ValidaSexo(){
        if ((sexo == 'M')||(sexo =='F'))
            return true;
        else
            return false;
    }
}
