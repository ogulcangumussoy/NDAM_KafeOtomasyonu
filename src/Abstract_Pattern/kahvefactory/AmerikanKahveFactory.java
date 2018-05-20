package Abstract_Pattern.kahvefactory;


import Abstract_Pattern.kahveler.Americano;
import Abstract_Pattern.kahveler.KahveA;
import Abstract_Pattern.kahveler.Espresso;
import Abstract_Pattern.kahveler.Mocha;
import Abstract_Pattern.malzemefactory.AmerikanKahveMalzemeFactory;
import Abstract_Pattern.malzemefactory.KahveMalzemeFactory;

public class AmerikanKahveFactory extends AbstractKahveFactory {

        @Override
	protected KahveA kahveUret(String item) {
		KahveA kahve = null;
		KahveMalzemeFactory malzemeFactory =
		new AmerikanKahveMalzemeFactory();

		if (item.equals("americano")) {

			kahve = new Americano(malzemeFactory);
			kahve.setIsim("Americano Kahvesi");

		}  else if (item.equals("espresso")) {

			kahve = new Espresso(malzemeFactory);
			kahve.setIsim("Amerikan Espresso Kahvesi");
		}else if (item.equals("mocha")){
                        kahve = new Mocha(malzemeFactory);
                        kahve.setIsim("Amerikan Mocha Kahvesi");
                }
		return kahve;
	}
}
