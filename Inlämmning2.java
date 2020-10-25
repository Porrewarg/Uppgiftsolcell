//@author Pontus Warg, ponwar-0

// Flödesschema
// 	Beräkning
	// 1. Ange datum
// 	2. Är angivet datum månad 06 el. 07? Ja: fortsätt, Nej: Ge felmeddelande
	// 3. Ange tider för sol ned och uppgång
	// 4. Är soluppgång mindre än solnedgång? Ja: fortsätt, Nej, systemet visar error
	// 5. Gör uträkning
	// 6. Printa resultat
// 	7. Klart.//



// import av Scanner funtion så användaren kan knappa in info.
import java.util.Scanner; 

public class Inlämmning2 {

	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in ) ; 
		
		//ange sepator
		userInput.useDelimiter(":|-|\\s+");
		
		// anger variablerna 
		int  datum, mån, dag;
		
		double uppgång, nedgång, soltimmar, area, strålning, verkgrad, produktion, pris;
		 
		
	
		// Användaren uppmanas fylla i datum
		  System.out.print( "Ange dagens datum [dd-mm]:"); 
		  dag = userInput.nextInt();

		  mån = userInput.nextInt() ; 

		  datum = (mån + - + dag);
		  
		
			  
			// Användaren uppmanas fylla i tid för sol upp och nedgång
		System.out.printf("Ange tid för soluppgång [hh:mm]:");
		 uppgång = userInput.nextInt();
		
		 userInput.nextLine(); 
		
		System.out.printf("Ange tid för solnedgång [hh:mm]:");
		 nedgång = userInput.nextInt();
		 
			System.out.print("=====================================================\n") ;
			
		 // begränsning för användaren dvs. se till att de fyller i rätt månad
		  if ((mån == (int) 06) | (mån == (int) 07)){ 

			  System.out.print ("") ; 

			  }

			  else {

			  System.out.printf ("Error! fel månad angivet" );

			  }
		
	 
		  // uträkning för antal soltimmar samt avrundning till två decimaler
		 soltimmar = nedgång - uppgång / 60 ;
		 soltimmar = Math.round(soltimmar * 100.0) / 100.0; 
		
		if (uppgång < nedgång) 

			  System.out.printf("Antal soltimmar: "+ soltimmar + "\n");
		
		//sammanställning och uträkning av alla variabler
		area = 1.7 ;
		strålning = 166;
		verkgrad = 0.2 ;
		produktion = strålning * soltimmar * area * verkgrad * 26 / 1000 ;
		//avrudna till 2 decimaler
		produktion = Math.round(produktion * 100.0) / 100.0; 
		
		pris = 0.9 * produktion ;
		
		//avrudna pris till 2 decimaler

		pris = Math.round(pris * 100.0) / 100.0; 
		
		System.out.printf("Produktionen " + "blir: " + produktion + " kWh till ett värde av: " + pris + " kr.");  
			  }
	}

