package Abstract_Pattern.kahvefactory;


import Abstract_Pattern.kahveler.DamlaSakızlıKahve;
import Abstract_Pattern.kahveler.KahveA;
import Abstract_Pattern.kahveler.TurkKahvesi;
import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;
import Abstract_Pattern.malzemefactory.TurkKahveMalzemeFactory;

public class TurkKahveFactory extends AbstractKahveFactory {
 
        @Override
	protected KahveA kahveUret(String item) {
		KahveA kahve = null;
		KahveMalzemeFactory malzemeFactory = 
			new TurkKahveMalzemeFactory();
 
		if (item.equals("turk_kahvesi")) {
  
			kahve = new TurkKahvesi(malzemeFactory);
			kahve.setIsim("Türk Kahvesi");
  
		}  else if (item.equals("damla_sakizli")) {

			kahve = new DamlaSakızlıKahve(malzemeFactory);
			kahve.setIsim("Türk Damla Sakızlı Kahvesi");
		} 
		return kahve;
	}
}
