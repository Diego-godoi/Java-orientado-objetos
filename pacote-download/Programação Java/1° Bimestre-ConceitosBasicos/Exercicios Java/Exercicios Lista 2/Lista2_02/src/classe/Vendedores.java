
package classe;


public class Vendedores {
   public String nome;
   public float vendas[]=new float[4];
   
   public float TotalVendido(){
       int y;
       float soma=0;
       
       for(y=0;y<5;y++){
           soma = soma+vendas[y];
       }
       return(soma);
   }
   
   public float ComissaoSemanal(){
       if(TotalVendido()<5500){
           return(float) (TotalVendido()*2.5/100);
       }else if(TotalVendido()<8000){
            return(float) (TotalVendido()*5.5/100);
        }else{
            return(TotalVendido()*8/100);
        }
    }
}

