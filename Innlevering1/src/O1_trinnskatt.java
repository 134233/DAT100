import static javax.swing.JOptionPane.showInputDialog;

public class O1_trinnskatt {

	public static void main(String[] args) {

		int inntekt = Integer.parseInt(showInputDialog("Inntekt: "));
		int restInntekt = inntekt;

		int trinn4 = 934051;
		int trinn3 = 580651;
		int trinn2 = 230951;
		int trinn1 = 164101;

		double trinn4Sats = 0.1452;
		double trinn3Sats = 0.1152;
		double trinn2Sats = 0.0241;
		double trinn1Sats = 0.0093;

		double trinnskatt = 0;

		if (inntekt > 934051) {
			trinnskatt = trinnskatt + (restInntekt - trinn4) * trinn4Sats;
			System.out.println("Trinn 4 = kr " + (restInntekt - trinn4) * trinn4Sats);
			restInntekt = restInntekt - (restInntekt - trinn4);
		}

		if (inntekt > 580651) {
			trinnskatt = trinnskatt + (restInntekt - trinn3) * trinn3Sats;
			System.out.println("Trinn 3 = kr " + (restInntekt - trinn3) * trinn3Sats);
			restInntekt = restInntekt - (restInntekt - trinn3);
		}

		if (inntekt > 230951) {
			trinnskatt = trinnskatt + (restInntekt - trinn2) * trinn2Sats;
			System.out.println("Trinn 2 = kr " + (restInntekt - trinn2) * trinn2Sats);
			restInntekt = restInntekt - (restInntekt - trinn2);

		}

		if (inntekt > 164101) {
			trinnskatt = trinnskatt + (restInntekt - trinn1) * trinn1Sats;
			System.out.println("Trinn 1 = kr " + (restInntekt - trinn1) * trinn1Sats);
			restInntekt = restInntekt - (restInntekt - trinn1);
		}

		System.out.println("Den totale trinnskatten er kr " + trinnskatt);
	}
}
