package lv.jak.volkovinskis.klases;

public class MainClass {

	public static void main (String []args) {
		
		//1.Autors
		
		Autors autors = new Autors () ;
		
		autors.vards = "Niks" ;
		autors.uzvards = "Volkovinskis" ;
		autors.dzimsanasgads = 2003 ;
		autors.tautiba = "Latvietis" ;
		
		Zanrs zanrs = new Zanrs () ;
		zanrs.nosaukums = "Fantāzija" ;
		
		Izdevnieicba izdevnieciba = new Izdevnieicba () ;
		izdevnieciba.nosaukums = "Zvaigzne ABC" ;
		
		
		//2.Gramata
		
		Gramata gramata = new Gramata ();
		gramata.autors = autors ;
		gramata.gads = 2015 ;
		gramata.izdevnieciba = izdevnieciba ;
		gramata.nosaukums = "Pasaules iniciatīva" ;
		gramata.zanrs = zanrs ;
		
		
		System.out.println("Grāmatas dati:") ;
		System.out.println("Nosaukums:" + gramata.nosaukums) ;
		System.out.println("Autors:" + gramata.autors.vards + " " + gramata.autors.uzvards) ;
		System.out.println("Žanrs:" + gramata.zanrs) ;
		System.out.println("Izdevniecība:" + gramata.izdevnieciba.nosaukums) ; ;
		System.out.println("Izdošanas gads:" + gramata.gads) ;
		
		
	}
}
