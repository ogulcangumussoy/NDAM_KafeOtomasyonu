package Abstract_Pattern.malzemefactory;

import Abstract_Pattern.malzemeler.SutM;
import Abstract_Pattern.malzemeler.SekerM;
import Abstract_Pattern.malzemelerinterface.Sut;
import Abstract_Pattern.malzemelerinterface.Seker;
import Abstract_Pattern.malzemelerinterface.Kahve;
import Abstract_Pattern.malzemelerinterface.Special;

public class AmerikanKahveMalzemeFactory implements KahveMalzemeFactory {
 
        @Override
	public Special karisimEkle(Special ozelmalzeme) {
		return ozelmalzeme;
	}
        
        @Override
	public Kahve kahveEkle(Kahve kahveTuru) {
		return kahveTuru;
	}
    
        @Override
	public Sut sutEkle() {
		return new SutM();
	}
        
        @Override
	public Seker sekerEkle() {
		return new SekerM();
	}
        
        
 
 
        
 
        

}
