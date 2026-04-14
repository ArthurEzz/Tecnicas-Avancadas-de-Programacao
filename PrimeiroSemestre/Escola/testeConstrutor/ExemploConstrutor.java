
package testeConstrutor;

import javax.swing.JOptionPane;

public class ExemploConstrutor {
    private int numero;
    public ExemploConstrutor(){
    numero = 0;
    JOptionPane.showMessageDialog(null, "Passou neste construtor");
    }
    public ExemploConstrutor(boolean n){
    
    JOptionPane.showMessageDialog(null, "Passou neste outro construtor");
    }
    
    public static void main(String[] args){
    ExemploConstrutor c = new ExemploConstrutor(true);
   
    }
}
