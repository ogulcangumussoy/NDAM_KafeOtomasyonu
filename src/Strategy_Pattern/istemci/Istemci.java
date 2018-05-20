/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern.istemci;

import Strategy_Pattern.listelemedavranisi.ListelemeDavranisi;
import java.util.ArrayList;
import veritabaniislemleri.Siparis;



public abstract class Istemci {
    
    ListelemeDavranisi listeleme;

    
    public Istemci(){
        
    }
    
    public void listelemeBaslat(ListelemeDavranisi listeleme){
        this.listeleme=listeleme;
    }
    
    public ArrayList<Siparis> listeYazdir(){
        return listeleme.listeYazdir();
    }
    
    
    abstract void tipYazdir();
    
    

}
