/*
 * RES Labo00
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Ciani Antony
 */
public class Trumpet implements IInstrument {
    
    public String play(){
        return "pouet";
    }
    
    public int getSoundVolume(){
        return 20;
    }
    
    public String getColor(){
        return "golden";
    }
    
}
