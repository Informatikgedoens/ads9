public class QuickSort {
	
	public int counter = 0;

	public void quicksort(int f[], int u, int o) {
		if (o > u) {
			int p = (u + o) / 2;
			int pn = zerlege(f, u, o, p);
			quicksort(f, u, pn - 1);
			quicksort(f, pn + 1, o);
		}
	}

	public int zerlege(int f[], int u, int o, int p) {
		int pn = u;
		int pv = f[p];
		f[p] = f[o];
		f[o] = pv;
		for (int i = u; i < o; i++) {
			if (f[i] <= pv) {
				int help = f[pn];
				f[pn] = f[i];
				f[i] = help;
				pn++;
				counter++;
			}
		}
		int help = f[o];
		f[o] = f[pn];
		f[pn] = help;
		return pn;
	}
	
	public void quicksort(String f[], int u, int o) {
		if (o > u) {
			int p = (u + o) / 2;
			int pn = zerlege(f, u, o, p);
			quicksort(f, u, pn - 1);
			quicksort(f, pn + 1, o);
		}
	}

	public int zerlege(String f[], int u, int o, int p) {
		int pn = u;
		String pv = f[p];
		f[p] = f[o];
		f[o] = pv;
		for (int i = u; i < o; i++) {
			if (f[i].compareTo(pv) <= 0) {
				String help = f[pn];
				f[pn] = f[i];
				f[i] = help;
				pn++;
				counter++;
			}
		}
		String help = f[o];
		f[o] = f[pn];
		f[pn] = help;
		return pn;
	}
	
	public void quicksort(double f[], int u, int o) {
		if (o > u) {
			int p = (u + o) / 2;
			int pn = zerlege(f, u, o, p);
			quicksort(f, u, pn - 1);
			quicksort(f, pn + 1, o);
		}
	}

	public int zerlege(double f[], int u, int o, int p) {
		int pn = u;
		double pv = f[p];
		f[p] = f[o];
		f[o] = pv;
		for (int i = u; i < o; i++) {
			if (f[i] <= pv) {
				double help = f[pn];
				f[pn] = f[i];
				f[i] = help;
				pn++;
				counter++;
			}
		}
		double help = f[o];
		f[o] = f[pn];
		f[pn] = help;
		return pn;
	}
}