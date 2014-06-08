import java.util.ArrayList;


public class MergeSort {
	
	public static ArrayList<Integer> mergesort(ArrayList<Integer> liste) {
		if(liste.size() <= 1) {
			return liste;
		} else {
			ArrayList<Integer> half1 = new ArrayList<>();
			ArrayList<Integer> half2 = new ArrayList<>();
			mergesort(half1);
			mergesort(half2);
			return merge(half1, half2);
		}
	}

	public static ArrayList<Integer> merge(ArrayList<Integer> f1, ArrayList<Integer> f2) {
		ArrayList<Integer> f =  new ArrayList<Integer>();
		while( !(f1.isEmpty()) && !(f2.isEmpty())) {
			if(f1.get(0) <= f2.get(0)) {
				int help = f1.get(0);
				f.add(help);
				f1.remove(0);
				f1.trimToSize();
			} else {
				int help = f2.get(0);
				f.add(help);
				f2.remove(0);
				f2.trimToSize();
			}
		while(!(f1.isEmpty())) {
			int help = f1.get(0);
			f.add(help);
			f1.remove(0);
			f1.trimToSize();
		}
		while(!(f2.isEmpty())) {
			int help = f2.get(0);
			f.add(help);
			f2.remove(0);
			f2.trimToSize();
		}
		}
		return f;
	}
	
	public static void ausgeben (ArrayList<Integer> list) {
		for(Integer s : list) {
			System.out.print(s + ",");
		}
	}
}
