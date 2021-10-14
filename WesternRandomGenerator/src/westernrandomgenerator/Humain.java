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
public class Humain {
    private String nom;
    private String boissonFavorite;
    
    public Humain(String nom){
        this.nom = nom;
    }
    
    public Humain(String nom,String boissonFavorite){
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
    }
    
    public void parle(String discours){
        System.out.println(this.nom + " : "+discours);
    }
    
    public void sePresenter(){
        parle("Bonjour je suis un humain");
    }
    
    public String quelEstTonNom(){
        return this.nom;
    }
    
    public String getBoisson(){
        return this.boissonFavorite;
    }
}
