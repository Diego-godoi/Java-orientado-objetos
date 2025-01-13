
package classes;


public class Vinho {
    private int tipo[] = {1,2,3,4};
    private String tipoNome[] = {"tento seco","tinto meio-seco","branco","rosado espumante"};

    public int getTipo(int y) {
        return tipo[y];
    }

    public String getTipoNome(int y){
        return tipoNome[y];
    }
    
}
