package Abstract_Pattern.kahveler;

import Abstract_Pattern.kahvefactory.AmerikanKahveFactory;
import Abstract_Pattern.kahvefactory.TurkKahveFactory;
import Abstract_Pattern.kahvefactory.AbstractKahveFactory;

public class KahveciTest {

    public static void main(String[] args) {
        AbstractKahveFactory turkKahvesi = new TurkKahveFactory();
        AbstractKahveFactory amerikanKahvesi = new AmerikanKahveFactory();

        KahveA kahve = turkKahvesi.siparisVer("turk_kahvesi");
        System.out.println(kahve + "\n");

        kahve = turkKahvesi.siparisVer("damla_sakizli");
        System.out.println(kahve + "\n");

        kahve = amerikanKahvesi.siparisVer("americano");
        System.out.println(kahve + "\n");

        kahve = amerikanKahvesi.siparisVer("mocha");
        System.out.println(kahve + "\n");
        
        kahve = amerikanKahvesi.siparisVer("espresso");
        System.out.println(kahve + "\n");



    }
}
