package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn bruttoinntekt: ");
		int tall = parseInt(tallTxt);
		if (tall>1350000) {
			double trinn5 = tall*0.176;
					System.out.println(trinn5 + "kr skal betales i trinnskatt!");
		} else if (tall>937900) {
			double trinn4 = tall*0.166;
		System.out.println(trinn4 + "kr skal betales i trinnskatt!");
		} else if (tall>670000) {
			double trinn3 = tall*0.136;
		System.out.println(trinn3 + "kr skal betales i trinnskatt!");
		}else if (tall>292850) {
			double trinn2 = tall*0.04;
		System.out.println(trinn2 + "kr skal betales i trinnskatt!");
		}else if (tall>208050) {
			double trinn1 = tall*0.017;
		System.out.println(trinn1 + "kr skal betales i trinnskatt!");
		}else {
		System.out.println("Ingen trinnskatt!");}
		
	}
}

// OPPGAVE 2:

package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O2 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		int tall;
		do {
			String tallTxt = showInputDialog("Skriv inn poengsum:");
			tall = parseInt(tallTxt);
			if (tall < 0 || tall > 100) {
				System.out.println("Ugyldig, prøv igjen!");}
		} while (tall < 0 || tall > 100);
		if (tall>89) {
			System.out.println("A");
		} else if (tall>79) {
			System.out.println("B");
		} else if (tall>59) {
			System.out.println("C");
		}else if (tall>49) {
			System.out.println("D");
		}else if (tall>39) {
			System.out.println("E");
		}else {
			System.out.println("F");}
		}
	}
}

//OPPGAVE 3:
package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {
	
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn et heltall: ");
		int n = parseInt(tallTxt);
		if (n <= 0) {
            System.out.println("n må være større enn 0.");
        } else {
            int fakultet = 1;
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            System.out.println(i + "! = " + fakultet);
            }
        }
	}
}