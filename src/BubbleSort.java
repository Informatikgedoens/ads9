
public class BubbleSort {
	// Komplexität O(n²).
	public static int[] bubble(int[] f) {
		boolean unsorted = true;
		int temp;
		do { // Vertausche
			unsorted = false;
			for(int i = 0; i < f.length - 1;i++) {
				if(f[i] > f[i+1]) {
					temp = f[i];
					f[i] = f[i+1];
					f[i+1] = temp;
					unsorted=true;
				}
			}
		} while (unsorted);
		return f;
	}
	
	public static void ausgeben(int [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}	
	
	public static void ausgeben(double[] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
	
	public static void ausgeben(String[] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
	//Ueberladen fuer double.
	public static double[] bubble(double[] f) {
		boolean unsorted = true;
		double temp;
		do { // Vertausche
			unsorted = false;
			for(int i = 0; i < f.length - 1;i++) {
				if(f[i] > f[i+1]) {
					temp = f[i];
					f[i] = f[i+1];
					f[i+1] = temp;
					unsorted=true;
				}
			}
		} while (unsorted);
		return f;
	}
	
	public static String[] bubble (String[] f) {
		boolean unsorted = true;
		String temp;
		do { // Vertausche
			unsorted = false;
			for(int i = 0; i < f.length - 1;i++) {
				if(f[i].compareToIgnoreCase(f[i+1]) > 0) {//compareTo fuer Strings.
					temp = f[i];
					f[i] = f[i+1];
					f[i+1] = temp;
					unsorted=true;
				}
			}
		} while (unsorted);
		return f;
	}
}
