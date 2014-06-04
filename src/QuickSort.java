
public class QuickSort {
	
	public static int[] quick(int[] f, int untereGrenze, int obereGrenze) {
		if(obereGrenze > untereGrenze) {
		
		}
		return f;
	}
	
	public int zerlege (int[] f, int untereGrenze, int obereGrenze, int posPivot) {
		int posNeu = untereGrenze;
		int pv = f[posPivot];
		int temp1, temp2, temp3;
		//Tausche Pivot nach rechts.
		temp1 = f[obereGrenze];
		f[obereGrenze] = f[posPivot];
		f[posPivot] = temp1;
		for(int i = untereGrenze; i < obereGrenze -1; i++) {
			if(f[i] <= pv) {
				//tausche f[posNeu] und f[i].
				temp2 = f[posNeu];
				f[posNeu] = f[i];
				f[i] = temp2;
				posNeu++; 
			}
		} 
		// tausche f[obereGrenze] und f[posneu] zurück.
		temp3 = f[obereGrenze];
		f[obereGrenze] = f[posNeu];
		f[posNeu] = temp3;
		return posNeu;
	}
	
	public static void ausgeben(int [] f) {
		for(int a=0; a < f.length; a++) {
			System.out.print(f[a] + ",");
		}
	}	
}
