/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Pattern.kahveler;

import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;
import Abstract_Pattern.malzemeler.DamlaSakizi;
import Abstract_Pattern.malzemeler.TurkKahveTozu;
import Abstract_Pattern.malzemeler.Vanilya;

/**
 *
 * @author asimyuksel
 */
public class DamlaSakızlıKahve extends KahveA{

  KahveMalzemeFactory malzemeFactory;
 
	public DamlaSakızlıKahve(KahveMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
  @Override
	public String hazirla() {
		ozel_malzeme = malzemeFactory.karisimEkle(new DamlaSakizi());
                sut=malzemeFactory.sutEkle();
                kahve=malzemeFactory.kahveEkle(new TurkKahveTozu());
		seker = malzemeFactory.sekerEkle();
                
                return "";
		
	}
    
}
