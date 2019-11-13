package lv.jak.volkovinskis.reg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IerakstisanaFaila {

	
	public void writeToFile(String fileName, String text) {
		File file = new File(fileName) ;
		
		
		
			file = new File (fileName) ;
		
		
		FileWriter fw ;
		
			try {
				if(!file.exists()) {
				file.createNewFile() ;
				}	
				fw = new FileWriter(file, true) ;
 				
 				fw.write(text + "\n\n" );
 				fw.flush() ;
 				
 				fw.close();
			} catch (IOException e) {
			System.out.println("Fails nav izveidots");
			System.out.println("Skaitīt kļūdu paziņojumu");
			
				e.printStackTrace();
			}
	}
}
