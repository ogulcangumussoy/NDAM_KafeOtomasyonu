package Abstract_Pattern.malzemefactory;

import Abstract_Pattern.malzemelerinterface.Sut;
import Abstract_Pattern.malzemelerinterface.Seker;
import Abstract_Pattern.malzemelerinterface.Kahve;
import Abstract_Pattern.malzemelerinterface.Special;

public interface KahveMalzemeFactory {
 
	public Special karisimEkle(Special ozelmalzeme);
	public Kahve kahveEkle(Kahve kahveTuru);
        public Sut sutEkle();
	public Seker sekerEkle();
	
 
}
