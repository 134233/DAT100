import static javax.swing.JOptionPane.showInputDialog;

public class O3_fakultet {

	public static void main(String[] args) {

		long n = Long.parseLong(showInputDialog("Angi 20 > n > 0: "));
		long fakultet = 1;
		boolean gyldigInput = n < 20 && n > 0;

		if (gyldigInput) {

			for (int i = 2; i <= n; i++) {
				fakultet = fakultet * i;
			}
			System.out.println(n + "! = " + fakultet);
		} else {
			System.out.println("Ugyldig input! Datatypen Long støtter bare n < 20, i tillegg til at n > 0.");
		}
	}

}
