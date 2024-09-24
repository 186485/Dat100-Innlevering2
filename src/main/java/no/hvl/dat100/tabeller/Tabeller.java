package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.println(tabell);

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";
		if (tabell.length != 0) {
			for (int i = 0; i < tabell.length; i++) {
				if (i == tabell.length - 1) {
					streng += tabell[i] + "]";
				} else {
					streng += tabell[i] + ",";
				}
			}
		} else {
			streng = "[]";
		}
		System.out.println(streng);
		return streng;
	}

	// c)
	public static int summer(int[] tabell) {
		int i = 0;
		int sum = 0;
		while (i < tabell.length) {
			sum += tabell[i];
			i++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;

		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return true;
			}
			i++;
		}

		return false;

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;

		while (i < tabell.length) {
			if (tabell[i] == tall) {
				return i;
			}
			i++;
		}

		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] reversert = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length - i - 1];
		}

		return reversert;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		if (tabell.length > 0) {
			int forrige = tabell[0];
			for (int i = 0; i < tabell.length; i++) {
				if (tabell[i] < forrige) {
					return false;
				}
				forrige = tabell[i];
			}
		}
		return true;

	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nytabell= new int [tabell1.length+tabell2.length];
		for(int i = 0; i < tabell1.length; i++)	{
			nytabell[i] = tabell1[i];
		}
		for(int i = 0; i < tabell2.length; i++)	{
			nytabell[tabell1.length+i] = tabell2[i];
		}
		
		return nytabell;
	
	}
}