
public class BubbleSort {
	// Komplexität O(n²).
	public static int[] bubble(int[] f) {
		boolean unsorted = true;
		int temp;
		do { // Vertausche
			for(int i = 1; i < f.length - 1;i++) {
				if(f[i] > f[i+1]) {
					temp = f[i];
					f[i] = f[i+1];
					f[i+1] = temp;
				}
			}
			unsorted = false;
		} while (unsorted);
		return f;
	}
	
	public static void ausgeben(int [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}	
}
