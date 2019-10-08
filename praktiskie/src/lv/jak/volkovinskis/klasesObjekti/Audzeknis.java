package lv.jak.volkovinskis.klasesObjekti;

public class Audzeknis {

	public String vards ;
	public String uzvards ;
	public String kurss ;
	Audzeknis(String vards, String uzvards, String kurss) {
		setVards(vards);
		setUzvards(uzvards);
		setKurss(kurss);
		
	}
	
	public String getVards() {
		return vards;
	}
	public void setVards(String vards) {
		this.vards = vards;
	}
	public String getUzvards() {
		return uzvards;
	}
	public void setUzvards(String uzvards) {
		this.uzvards = uzvards;
	}
	public String getKurss() {
		return kurss;
	}
	public void setKurss(String kurss) {
		this.kurss = kurss;
	}
	
	
}
