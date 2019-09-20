package lv.jak.volkovinskis.simboli;

public class SimboluVirknes {

	public static void main(String[]args) {
		
		String text = "Datorsistēmu tehniķis strādā organizācijās vai pie individuāliem datorlietotājiem,"
				+ " kur sniedz konsultācijas darbā ar datortehniku,"
				+ " programmatūru un biroja tehniku, uzstāda,"
				+ " konfigurē un modernizē datortehniku, vienkāršus datortīklus un programmatūru,"
				+ " novērš kļūmes to darbībā. Brīvi pārvalda biroja lietojumprogrammas dokumentu,"
				+ " aprēķinu tabulu, prezentāciju sagatavošanai, un datorlietotāja darba procesu"
				+ " automatizēšanai, sagatavo un uztur vienkāršas datu bāzes un interneta mājas"
				+ " lapas. Var strādāt patstāvīgi vai darba grupā.";
		
		//1.uzdevums teksta garums
		System.out.println("1.uzdevums: teksta garums");
		System.out.println("Dotā teksta garums ir: " + text.length()+ " simboli. ");
		
		//2.uzdevums: Noteikt, vai teksts satur vārdu (programmatūru) – ignorēt lielos burtus. 
		System.out.println("2.uzdevums: Noteikt, vai teksts satur vārdu (programmatūru) – ignorēt lielos burtus.");
		String text2 = text.toLowerCase() ;
		System.out.println("Teksts satur vārdu \"programmatūra\"; " + text2.contains("programmatūra"));
		System.out.println();
		
		System.out.println("AR IF-ELSE");
		if(text2.contains("programmatūra")) {
			System.out.println("Teksts satur vārdu \"programmatūra\"");
		}
		else {
			System.out.println("Teksts nesatur vārdu \"programmatūra\"");
		}
		System.out.println();
		
		//3. Pārveidot tekstu uz maziem burtiem. 
		System.out.println("3. Pārveidot tekstu uz maziem burtiem. ");
		System.out.println("teksts ar maziem burtiem");
		System.out.println(text.toLowerCase());
		
		//4.Noteikt, kurš pēc kārtas simbols ir burts „z”.
		

		System.out.println("Noteikt, kurš pēc kārtas simbols ir burts „z”.");
		System.out.println("Burts z ir: " + text.indexOf("z") + 1 + ".simbol");
		System.out.println();
		
		//5.Noteikt, burta „t” pēdējo indeksu. 
		
		System.out.println("Noteikt, burta „t” pēdējo indeksu. " + text.lastIndexOf("t"));
		System.out.println();
		
		//6.Noteikt , kurš ir 26. simbols tekstā
		
		System.out.println("Noteikt , kurš ir 26. simbols tekstā: " + text.charAt(27));
		System.out.println();
	
		//7.Visus burtus „a” aizstāt ar burtu „o”. 
		
		System.out.println("Visus burtus „a” aizstāt ar burtu „o”. " + text.replace( "a" , "o" ));
		System.out.println();
		
		//8.Noņemt komatus un punktus. 
		
		System.out.println("Noņemt komatus un punktus. " );
		String text3 = text.replace( ".", " ");
		System.out.println(text.replace("," , " " ));
		System.out.println();
		
		//9.Noteikt apakšvirknes tekstu, ja apakšvirknes 1. simbola indekss ir 13, bet pēdējais apakšvirknes simbols ir teksta 42. simbols tekstā. 
		
		System.out.println(text.substring(13, 42));
		System.out.println();
		
		//10.Sadalīt simbolu virkni pa vārdiem. 
		
		String text4 = text3.replace(",", "");
		String text5 = text4.replace("." , "" );
		System.out.println("" + text5.split(":"));
		System.out.println();
		
		//11. Atrast garāko vārdu. Ja vairākiem vārdiem vienāds garums, izvadīt tos visus. 
		
		String text6 = text.replace(".", "");
		text6 = text.replace(",", "");
		
		String[] vardi = text.split("  ");
		String garakais= "" ;
		String visiGarakie = "" ;
		
		for(String vards : vardi) { 
			if(vards.length() > garakais.length()) {
				garakais = vards ;
				visiGarakie = vards ;
			}
			else if (vards.length() == garakais.length()) {
				visiGarakie += ("," + vards) ;
			}
		}
		
		System.out.println("Visi garākie vārdi ir: " + visiGarakie);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		

		
	}
}
