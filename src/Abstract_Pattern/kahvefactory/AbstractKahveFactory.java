package Abstract_Pattern.kahvefactory;

import gui.Garson;
import Abstract_Pattern.kahveler.KahveA;
import gui.Log_Ekrani;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractKahveFactory {
        public String yazdir="";
	protected abstract KahveA kahveUret(String item);
        
 
	public KahveA siparisVer(String kahveTuru) {
		KahveA kahve = kahveUret(kahveTuru);
                
		yazdir="--- " + kahve.getIsim() + " Üretiliyor ---";
		yazdir+=kahve.hazirla()+"\n";
		yazdir+=kahve.pisir()+"\n";
		yazdir+=kahve.kutula()+"\n";
                
                Garson.abstract_gelenler=yazdir;
                System.out.println(yazdir);
                
		return kahve;
	}
        
        
        
}
