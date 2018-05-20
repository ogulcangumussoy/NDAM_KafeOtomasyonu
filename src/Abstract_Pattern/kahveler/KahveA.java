package Abstract_Pattern.kahveler;

import Abstract_Pattern.malzemelerinterface.Sut;
import Abstract_Pattern.malzemelerinterface.Seker;
import Abstract_Pattern.malzemelerinterface.Kahve;
import Abstract_Pattern.malzemelerinterface.Special;

public abstract class KahveA {
	String isim;

	Special ozel_malzeme;
	Seker seker;
	Kahve kahve;
        Sut sut;
	
	

	public abstract String hazirla();

	public String pisir() {
                return "Ocakta 10 Dakika Pişiriliyor";	
	}

	public String kutula() {

                return "Kahve kutuya konuluyor \nKahve gönderilmeye hazır\n";
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

        @Override
	public String toString() {
            int malzemeSayisi=1;
		StringBuilder sonuc = new StringBuilder();
		sonuc.append("---- Sipariş Edilen ").append(isim).append(" Özellikleri----\n");
		if (ozel_malzeme != null) {
			sonuc.append(malzemeSayisi++).append("- ").append(ozel_malzeme);
			sonuc.append("\n");
		}
		
		if (seker != null) {
			sonuc.append(malzemeSayisi++).append("- ").append(seker);
			sonuc.append("\n");
		}
                if (kahve != null) {
                        sonuc.append(malzemeSayisi++).append("- ").append(kahve);
			sonuc.append("\n");
		}
		if (sut != null) {
                        sonuc.append(malzemeSayisi++).append("- ").append(sut);
			sonuc.append("\n");
		}
				
		return sonuc.toString();
	}
}
