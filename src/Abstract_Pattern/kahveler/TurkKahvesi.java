package Abstract_Pattern.kahveler;


import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;
import Abstract_Pattern.malzemeler.TurkKahveTozu;
import Abstract_Pattern.malzemeler.Vanilya;

public class TurkKahvesi extends KahveA {
	KahveMalzemeFactory malzemeFactory;
 
	public TurkKahvesi(KahveMalzemeFactory malzemeFactory) {
		this.malzemeFactory = malzemeFactory;
	}
 
        @Override
	public String hazirla() {
		ozel_malzeme = malzemeFactory.karisimEkle(new Vanilya());
                sut=malzemeFactory.sutEkle();
                kahve=malzemeFactory.kahveEkle(new TurkKahveTozu());
		seker = malzemeFactory.sekerEkle();	
                
                return "";
               
	}
}
