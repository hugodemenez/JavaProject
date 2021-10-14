/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package westernrandomgenerator;

/**
 *
 * @author hugodemenez
 */
public class Brigand extends Humain{
    Integer nbDameEnlevees;
    Integer recompense;
    String look;
    Boolean estEnPrison;
    
    public Brigand(String nom){
        super(nom);
    }
    
    public void echapper(){
        this.estEnPrison=false;
    }
    
    public String quelEstTonNom(){
        return super.quelEstTonNom();
    }
    
    @Override
    public void sePresenter(){
        super.parle("Ahahahh je suis un brigand, je m'appelle "+quelEstTonNom());
    }
}
