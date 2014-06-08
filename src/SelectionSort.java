
public class SelectionSort {
	public static int[] select (int[] f) {
		int p = f.length;
		int index, max, temp; //index für den Index, max für den maximalenWert und temp zum zwischenspeichern.
		while(p > 0){
			//Maximalen Wert in dem Array herausbekommen.
			max=0;
			for (index=1; index < p; index++) {
				if(f[max] < f[index]) {
					max=index;
				}
			}
			//Werte im Array vertauschen.
			temp = f[max];
			f[max] = f[p-1];
			f[p -1] = temp;
			p--;
		}
		return f;
	}
	
	public static String[] select (String[] f) {
		int p = f.length;
		int index, max;	//index für den Index, max für den maximalenWert und temp zum zwischenspeichern.
		String temp;
		while(p > 0){
			//Maximalen Wert in dem Array herausbekommen.
			max=0;
			for (index=1; index < p; index++) {
				if(f[max].compareToIgnoreCase(f[index]) < 0) {
					max=index;
				}
			}
			//Werte im Array vertauschen.
			temp = f[max];
			f[max] = f[p-1];
			f[p -1] = temp;
			p--;
		}
		return f;
	}
	
	public static double[] select (double[] f) {
		int p = f.length;
		int index, max;	//index für den Index, max für den maximalenWert und temp zum zwischenspeichern.
		double temp;
		while(p > 0){
			//Maximalen Wert in dem Array herausbekommen.
			max=0;
			for (index=1; index < p; index++) {
				if(f[max] < f[index]) {
					max=index;
				}
			}
			//Werte im Array vertauschen.
			temp = f[max];
			f[max] = f[p-1];
			f[p -1] = temp;
			p--;
		}
		return f;
	}
	
	//Algorithmus mit 2 For-Schleifen.
	public static int[] selection(int[] sortieren) {
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
			}
		}

		return sortieren;
	}
	
	public static void ausgeben(int [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
	
	public static void ausgeben(String [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}	
}
