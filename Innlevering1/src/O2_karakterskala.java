import static javax.swing.JOptionPane.showInputDialog;

public class O2_karakterskala {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int poengsum = Integer.parseInt(showInputDialog("Poengsum: "));
			;
			char karakter = 0;
			boolean gyldigPoengsum = poengsum >= 0 && poengsum <= 100;

			if (gyldigPoengsum) {

				if (poengsum <= 100 && poengsum >= 90) {
					karakter = 'A';
				}

				else if (poengsum <= 89 && poengsum >= 80) {
					karakter = 'B';
				} else if (poengsum <= 79 && poengsum >= 60) {
					karakter = 'C';
				}

				else if (poengsum <= 59 && poengsum >= 50) {
					karakter = 'D';
				}

				else if (poengsum <= 49 && poengsum >= 40) {
					karakter = 'E';
				}

				else if (poengsum <= 39 && poengsum >= 0) {
					karakter = 'F';
				}

				System.out.println(karakter);

			} else {
				poengsum = Integer.parseInt(showInputDialog("Ugyldig. Prøv igjen: "));
				i--;
			}

		}

	}

}
