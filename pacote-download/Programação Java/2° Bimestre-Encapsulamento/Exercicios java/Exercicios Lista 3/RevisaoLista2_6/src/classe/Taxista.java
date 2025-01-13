
package classe;


public class Taxista {
    private String nome;
    private float valorsemana;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorsemana() {
        return valorsemana;
    }

    public void setValorsemana(float valorsemana) {
        this.valorsemana = valorsemana;
    }
    
    public float taxamanutencao(){
        if(valorsemana<=500){
            return(float) (valorsemana*3.0/100);
        }else if (valorsemana<=650){
            return(float) (valorsemana*3.5/100);
        }else if(valorsemana<=850){
            return(float) (valorsemana*4.0/100);
        }else{
            return(float) (valorsemana*4.5/100);
        }
    }
}
