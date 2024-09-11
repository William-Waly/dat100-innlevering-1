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