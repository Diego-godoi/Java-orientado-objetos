
package classe;


public class Garcom {
    public String nome;
    public int mucarela, presunto, borda_mucarela, borda_presunto;
    public float valor_total; 
    
    public float Mucarela(){
        float soma=0;
        float valor_mucarela=0;
        
        soma = (float) (borda_mucarela * 4.50);
        valor_mucarela = (35*10/100)*mucarela;
        valor_total = soma + valor_mucarela;
        
        return(soma+valor_mucarela);
    }
    
    public float Presunto(){
        float soma=0;
        float valor_presunto=0;
        
        soma = (float) (borda_presunto * 4.50);
        valor_presunto = (35*6/100) * presunto;
        valor_total = soma + valor_presunto;
        
        return(soma+valor_presunto);
    }
    
    public float Comissao(){
        return(valor_total*10/100);
    }
    
}
