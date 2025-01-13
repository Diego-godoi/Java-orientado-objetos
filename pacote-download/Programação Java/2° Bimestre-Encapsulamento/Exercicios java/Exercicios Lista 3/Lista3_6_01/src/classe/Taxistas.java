
package classe;


public class Taxistas {
    private String nome;
    private float valor_semana;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor_semana() {
        return valor_semana;
    }

    public void setValor_semana(float valor_semana) {
        this.valor_semana = valor_semana;
    }
    
    public float Taxa_Manutencao(){
        if(valor_semana<=500){
            return(float) (valor_semana*3.0/100);
        }else if(valor_semana<=650){
            return(float) (valor_semana*3.5/100);
        }else if(valor_semana<=850){
            return(float) (valor_semana*4.0/100);
        }else{
            return(float) (valor_semana*4.5/100);
        }
    }
}
