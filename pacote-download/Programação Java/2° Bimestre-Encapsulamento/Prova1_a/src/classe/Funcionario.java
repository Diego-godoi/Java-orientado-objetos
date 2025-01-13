
package classe;

import javax.swing.JOptionPane;


public class Funcionario {
    private String nome;
    private int local,horas;
    private float valorhoras;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLocal() {
        return local;
    }

    public boolean setLocal(int local) {
        if ((local==1)||(local==2)){
            this.local = local;
            return(true);
        }else{
            JOptionPane.showMessageDialog(null, "Local Invalido");
            return(false);
        }
                    
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getValorhoras() {
        return valorhoras;
    }

    public void setValorhoras(float valorhoras) {
        this.valorhoras = valorhoras;
    }
    
    public String Local(){
        if(local ==1){
            return("Area do show");
        }else{
            return("Praca de alimentacao");
        }
    }
    
    public float Servico(){
        return(horas*valorhoras);
    }
    
    public float adicional(){
        if(local==1)
            if(Servico()<=550)
                return(float) (Servico()*14.5/100);
            else
                return(float) (Servico()*16.5/100);
        else
            if (Servico()<=700)
                return(Servico()*12/100);
            else
                return(Servico()*14/100);
    }
    
    public float Total(){
        return(Servico()+adicional());
    }
}
