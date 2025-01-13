
package classes;


public class Alunos {
    public String nome;
    public float nota[] = new float[4];

    public float Media(){
        float soma=0;
        int y;
        for (y=0;y<4;y++){
                soma = soma + nota[y];
        }
        return (soma/4);
    }
    
    public String Situacao(){
        if (Media()<6){
            return ("REPROVADO");
        }else{
            return ("APROVADO");
        }
    }
}
