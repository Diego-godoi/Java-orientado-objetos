
package classe;


public class Vendedores {
    private String nome;
    private float valor_total_mes;
    private int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor_total_mes() {
        return valor_total_mes;
    }

    public void setValor_total_mes(float valor_total_mes) {
        this.valor_total_mes = valor_total_mes;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public float Gratificacao(){
        if(idade <=40){
            if (valor_total_mes <=5000){
                return(float) (valor_total_mes*3.6/100);
            }else{
                return(float) (valor_total_mes*4.5/100);
            }
        }else{
            if(valor_total_mes <=7000){
                return(float) (valor_total_mes*5.5/100);
            }else{
                return(float) (valor_total_mes*6.5/100);
            }
        }
    }
}
