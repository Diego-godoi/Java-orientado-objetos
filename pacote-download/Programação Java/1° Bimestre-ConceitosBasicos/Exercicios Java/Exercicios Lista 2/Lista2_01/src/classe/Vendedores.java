package classe;

public class Vendedores {
    public String nome;
    public float salario[] = new float[3];
    
    public float Ferias(){
        float soma=0;
        int y;
        
        for(y=0;y<2;y++){
            soma = salario[y] + soma;
        }
        return(soma/3);
    }
    
    public float Previdencia(){
        if(Ferias()<= 1412){
            return(Ferias()/7.5f);
        }else if (Ferias()<= 2666.68){
            return(Ferias()/9);
        }else if (Ferias() <= 4000.03){
            return(Ferias()/12);
        }else if (Ferias()<= 7786.02){
            return(Ferias()/14);
        }else{
            return(1090.04f);
        }
    }
    
    public float Liquido(){
        return(Previdencia() + Ferias());
    }
}
