package praktiskie;

public class MainClass {

	public static void main (String[]args) {
		//1.Skolotāja ojekta izveide
		Skolotajs skolotajs = new Skolotajs();
		skolotajs.vards = "Aigars" ;
		skolotajs.uzvards = "Ašaks" ;
		skolotajs.dzimums = "vīrietis" ;
		skolotajs.vecums = 28 ;
		skolotajs.prieksmeti = "Matemātika," + "Sistēmprogrammēšana" + "Programmēšanas valodas " + "Vienkāršo algoritmu izstrāde";
		
		//2.Kursa objekta izveide
		Kurss kurss = new Kurss() ;
		kurss.audzeknuskaits = 20 ;
		kurss.audzinatajs = skolotajs ;
		kurss.nosaukums = "2.P" ;
		kurss.programma = "Programmētāji" ;
		kurss.vdejaisvertejums = 6 ;
		
		//3.Audzekna objekta izveide
		
		Audzeknis audzeknis = new Audzeknis () ;
		audzeknis.vards = "Niks" ;
		audzeknis.uzvards = "Volkovinskis" ;
		audzeknis.dzimums = "Vīrietis" ;
		audzeknis.vecums = 16 ;
		audzeknis.kurss = kurss ;
		audzeknis.videjaisvertejums = 6.06 ;
		audzeknis.dzivokojas = true ;
		
		System.out.println("1.Audzēkņa dati:") ;
		System.out.println("Vārds:" + audzeknis.vards) ;
		System.out.println("Uzvārds:" + audzeknis.uzvards) ;
		System.out.println("Vecums:" + audzeknis.vecums) ;
		System.out.println("Kurss:" + audzeknis.kurss.nosaukums) ;
		System.out.println("Vidējais vērtējums:" + audzeknis.videjaisvertejums) ;
		System.out.println("Audzinātājs:" + audzeknis.kurss.audzinatajs.vards + " " + audzeknis.kurss.audzinatajs.uzvards) ;
		
	}
}
