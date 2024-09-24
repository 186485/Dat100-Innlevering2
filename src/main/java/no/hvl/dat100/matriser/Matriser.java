package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int x = 0; x < matrise.length; x++) {

			for (int y = 0; y < matrise[x].length; y++) {
				System.out.print(matrise[x][y] + " ");
			}
			System.out.println("");
		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String streng = "";
		for (int x = 0; x < matrise.length; x++) {

			for (int y = 0; y < matrise[x].length; y++) {
				streng += matrise[x][y] + " ";
			}
			streng += "\n";
		}
		return streng;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] skalert = new int[matrise.length][matrise[0].length];
		
		for(int i = 0; matrise.length>i; i++) {
			for(int y = 0; y <matrise[i].length; y++) {
				skalert[i][y] = matrise[i][y] * tall;
			}
		}
		
		return skalert;
		
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			for(int z = 0; z < a[i].length; z++) {
				if(a[i][z]!=b[i][z]) {
					return false;
				}
			}
		}
		return true;	
	}

	

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

	}
}
