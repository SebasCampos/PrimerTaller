
package primertaller;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author h
 */
public class logicName {
    
    
    String [][] nombres;
    JLabel eti = new JLabel();
    
    JLabel [][] inter;

    public logicName() {
    }

    public String[][] getNombres() {
        return nombres;
    }

    public void setNombres(String[][] nombres) {
        this.nombres = nombres;
    }
    
    public JLabel[][] getInter() {
        return inter;
    }

    public void setInter(JLabel[][] inter) {
        this.inter = inter;
    }

    public void addnombres(String[] nombre){
        String [][] names = new String [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                names[i][j] = nombre[j]; 
                
            }
        }
        setNombres(names);

    }
    
    
    public void addLabel(){
        JLabel eti = new JLabel();
        JLabel [][] g = new JLabel[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g[i][j] = eti;
            }
            
        }
        setInter(g);
    }
    
    
    
}
