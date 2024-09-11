package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn bruttoinntekt: ");
		int tall = parseInt(tallTxt);
		if (tall>1350000) {
			double trinn5 = ((tall-1350000)*0.176)+ 68408.6+ 36434.4 + 15086 + 1441.6;
					System.out.println(trinn5 + "kr skal betales i trinnskatt!");
		} else if (tall>937900) {
			double trinn4 = ((tall-937900)*0.166)+ 36434.4 + 15086 + 1441.6;
		System.out.println(trinn4 + "kr skal betales i trinnskatt!");
		} else if (tall>670000) {
			double trinn3 = ((tall-670000)*0.136)+ 15086 + 1441.6;
		System.out.println(trinn3 + "kr skal betales i trinnskatt!");
		}else if (tall>292850) {
			double trinn2 = ((tall-292850)*0.04)+ 1441.6;
		System.out.println(trinn2 + "kr skal betales i trinnskatt!");
		}else if (tall>208050) {
			double trinn1 = (tall-208050)*0.017;
		System.out.println(trinn1 + "kr skal betales i trinnskatt!");
		}else {
		System.out.println("Ingen trinnskatt!");}
		
	}
}
