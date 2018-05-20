package Abstract_Pattern.kahveler;


import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;
import Abstract_Pattern.malzemeler.AmerikanKahveTozu;
import Abstract_Pattern.malzemeler.Bal;

public class Mocha extends KahveA {
	KahveMalzemeFactory malzemeFactory;
 
	public Mocha(KahveMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
        @Override
	public String hazirla() {
		ozel_malzeme = malzemeFactory.karisimEkle(new Bal());
                sut=malzemeFactory.sutEkle();
                kahve=malzemeFactory.kahveEkle(new AmerikanKahveTozu());
		seker = malzemeFactory.sekerEkle();	
                
                return "";
               
	}
}
