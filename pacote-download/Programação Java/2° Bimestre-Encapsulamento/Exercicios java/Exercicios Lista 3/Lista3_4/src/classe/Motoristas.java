
package classe;


public class Motoristas {
    private String nome;
    private float km;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }
    
    public float Valor_Transporte(){
        if (km <=60)
            return(float) (km*2.30);
        else if (km <= 80)
            return(float) (km*2.15);
        else if (km <= 100)
            return(float) (km*2.00);
        else
            return(float) (km*1.90);
    }
    
    public float Taxa_Administracao(){
        if (km <=60)
            return(float) (Valor_Transporte()*12.5/100);
        else if (km <= 80)
            return(float) (Valor_Transporte()*11.5/100);
        else if (km <= 100)
            return(float) (Valor_Transporte()*10.5/100);
        else
            return(float) (Valor_Transporte()*9.5/100);
    }
}
