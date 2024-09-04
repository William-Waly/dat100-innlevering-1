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
