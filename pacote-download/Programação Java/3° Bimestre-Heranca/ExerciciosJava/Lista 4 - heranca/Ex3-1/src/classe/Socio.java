
package classe;

import javax.swing.JOptionPane;


public class Socio extends Pessoa {
    private char cat;
    private float mens;

    public char getCat() {
        return cat;
    }

    public boolean setCat(char c) {
        if((c=='A')||(c=='B')||(c=='C')){
            this.cat = c;
            return(true);
        }else{
            JOptionPane.showMessageDialog(null, "Categoria invalida");
            return(false);
        }
    }

    public float getMens() {
        return mens;
    }

    public void setMens(float mens) {
        this.mens = mens;
    }

    
    
    public float mensalidade(){
        switch (cat) {
            case 'A':
                return(float) (mens+(mens*3.5/100));
            case 'B':
                return(float) (mens+(mens*4.6/100));
            default:
                return(float) (mens+(mens*5.7/100));
        }
    }
}
