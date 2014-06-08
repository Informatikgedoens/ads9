public class QuickSort {

	public static void quicksort(int f[], int u, int o) {
		if (o > u) {
			int p = (u + o) / 2;
			int pn = zerlege(f, u, o, p);
			quicksort(f, u, pn - 1);
			quicksort(f, pn + 1, o);
		}
	}

	public static int zerlege(int f[], int u, int o, int p) {
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
			}
		}
		int help = f[o];
		f[o] = f[pn];
		f[pn] = help;
		return pn;
	}
}