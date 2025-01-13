
package classe;


public class Vendedores {
    private String nome;
    private int idade;
    private float valormes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValormes() {
        return valormes;
    }

    public void setValormes(float valormes) {
        this.valormes = valormes;
    }
    
    public float Gratificacao(){
        if(idade<=40){
            if(valormes<=5000){
                return(float) (valormes*3.6/100);
            }else{
                return(float) (valormes*4.5/100);
            }
        }else{
            if(valormes<=7000){
                return(float) (valormes*5.5/100);
            }else{
                return(float) (valormes*6.5/100);
            }
        }
    }
}