/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy_Pattern.istemci;


public class VarsayilanIstemci extends Istemci{

    public VarsayilanIstemci(){
        
    }    

    @Override
    void tipYazdir() {
        System.out.println("Varsayılan istemci");
    }
    
}
