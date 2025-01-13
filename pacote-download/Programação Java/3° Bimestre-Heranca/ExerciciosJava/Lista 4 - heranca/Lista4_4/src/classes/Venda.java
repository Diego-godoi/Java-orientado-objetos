
package classes;


public class Venda extends Vinho{
    private int quantidadeCaixa[]=new int[4];
    private float valorGarrafa[] = new float[4];

    public int getQuantidadeCaixa(int y) {
        return quantidadeCaixa[y];
    }

    public void setQuantidadeCaixa(int quantidadeCaixa, int y) {
        this.quantidadeCaixa[y] = quantidadeCaixa;
    }

    public float getValorGarrafa(int y) {
        return valorGarrafa[y];
    }

    public void setValorGarrafa(float valorGarrafa, int y) {
        this.valorGarrafa[y] = valorGarrafa;
    }
    
    public boolean TemDesconto(){
        //verifica se dentro do vetor tem zero (nao comprpu todas as caixas)
        boolean teste = true;
        for(int x=0;x<4;x++)
            if (quantidadeCaixa[x] ==0)
                teste = false;
        return(teste);
    }
    
    public int Garrafas(int y){
        return(quantidadeCaixa[y]*12);
    }
    
    public float ValorNormal(int y){
        return(Garrafas(y)*valorGarrafa[y]);
    }
    
    public float Desconto(int y){
        switch(y){
            case 0:return(ValorNormal(y)*20/100);
            case 1:return(float) (ValorNormal(y)*21.5/100);
            case 2:return(float) (ValorNormal(y)*24.5/100);
            default:return(float) (ValorNormal(y)*22.2/100);
        }
    }
    
    public float ValorPagar(int y){
        return(ValorNormal(y)-Desconto(y));
    }
}
