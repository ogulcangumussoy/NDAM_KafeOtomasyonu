/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract_Pattern.kahveler;

import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;
import Abstract_Pattern.malzemeler.AmerikanKahveTozu;
import Abstract_Pattern.malzemeler.Kakao;
import Abstract_Pattern.malzemeler.Vanilya;

/**
 *
 * @author asimyuksel
 */
public class Espresso extends KahveA{
    KahveMalzemeFactory malzemeFactory;
 
	public  Espresso(KahveMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
    @Override
	public String hazirla() {
		ozel_malzeme = malzemeFactory.karisimEkle(new Kakao());
                sut=malzemeFactory.sutEkle();
                kahve=malzemeFactory.kahveEkle(new AmerikanKahveTozu());
		seker = malzemeFactory.sekerEkle();	
		
                return "";
	}
}
