
public class Main {

	public static void main(String[] args) {
		
		int[] unsortiert = {3,16,-1,2,2,50};
		int[] sortiert = InsertionSort.insert(unsortiert);
		
		System.out.println("InsertionSort: ");
		InsertionSort.ausgeben(sortiert);
		
		sortiert = SelectionSort.select(unsortiert);
		
		System.out.println("\n" + "SelectionSort: ");
		SelectionSort.ausgeben(sortiert);
		
		sortiert= BubbleSort.bubble(unsortiert);
		
		System.out.println("\n" + "BubbleSort: ");
		BubbleSort.ausgeben(sortiert);
	
	}
}
