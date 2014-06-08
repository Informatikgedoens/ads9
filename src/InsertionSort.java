
public class InsertionSort {
	
	public static int[] insert(int [] f) {
		for(int i=2; i<f.length; i++){ //start bei [2].
			int m = f[i];	//zu merkendes Element / einzusortierender Wert.
			int j = i;
			boolean fertig = false;
			while(!fertig){
				if(f[j-1] >= m) {
					//Verschiebe f[j-1] nach rechts.
					f[j] = f[j-1];
					j--;
					if(j < 1) { fertig = true; } //Fehler in Vorlesung anstatt "<=" muss es "<" sein, sonst bleibt das erste Element unverändert.
					} else { fertig = true; }
			} f[j] = m; //Einfuegposition.
		}
		return f;
	}
	
	public static String[] insert(String [] f) {
		for(int i=2; i<f.length; i++){ //start bei [2].
			String m = f[i];	//zu merkendes Element / einzusortierender Wert.
			int j = i;
			boolean fertig = false;
			while(!fertig){
				if(m.compareToIgnoreCase(f[j-1]) < 0) {
					//Verschiebe f[j-1] nach rechts.
					f[j] = f[j-1];
					j--;
					if(j < 1) { fertig = true; } //Fehler in Vorlesung anstatt "<=" muss es "<" sein, sonst bleibt das erste Element unverändert.
					} else { fertig = true; }
			} f[j] = m; //Einfuegposition.
		}
		return f;
	}
	
	public static double[] insert(double [] f) {
		for(int i=2; i<f.length; i++){ //start bei [2].
			double m = f[i];	//zu merkendes Element / einzusortierender Wert.
			int j = i;
			boolean fertig = false;
			while(!fertig){
				if(f[j-1] >= m) {
					//Verschiebe f[j-1] nach rechts.
					f[j] = f[j-1];
					j--;
					if(j < 1) { fertig = true; } //Fehler in Vorlesung anstatt "<=" muss es "<" sein, sonst bleibt das erste Element unverändert.
					} else { fertig = true; }
			} f[j] = m; //Einfuegposition.
		}
		return f;
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
	
	public static void ausgeben(double [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}
}