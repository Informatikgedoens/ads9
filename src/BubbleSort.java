
public class BubbleSort {
	
	public int counter = 0;
	// Komplexität O(n²).
	public int[] bubble(int[] f) {
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
					counter++;
				}
			}
		} while (unsorted);
		return f;
	}
	
	public void ausgeben(int [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}	
	
	public void ausgeben(double[] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
	
	public void ausgeben(String[] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
	//Ueberladen fuer double.
	public double[] bubble(double[] f) {
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
					counter++;
				}
			}
		} while (unsorted);
		return f;
	}
	
	public String[] bubble (String[] f) {
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
					counter++;
				}
			}
		} while (unsorted);
		return f;
	}
}
