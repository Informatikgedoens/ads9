import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) throws IOException {
		//Strings
		System.out.println("Strings: ");
		String [] unsortiert = IO.rwString("/home/niklas/workspace/ADSBLATT8/string");
		
		//MergeSort algorithmus.
		MergeSort2.mergeSort(unsortiert);
		MergeSort2.ausgeben(unsortiert);
		
		IO.write(unsortiert, "/home/niklas/workspace/ADSBLATT8/stringOutput");
		// ints
		System.out.println();
		System.out.println();
		System.out.println("Integer: ");
		int [] unsortiert1 = IO.rwInt("/home/niklas/workspace/ADSBLATT8/integer");
		
		MergeSort2.mergeSort(unsortiert1);
		MergeSort2.ausgeben(unsortiert1);
		
		IO.write(unsortiert1, "/home/niklas/workspace/ADSBLATT8/intOutput");
		//Double
		System.out.println();
		System.out.println();
		System.out.println("Double: ");
		Double [] unsortiert2 = IO.rwDouble("/home/niklas/workspace/ADSBLATT8/double");
		
		MergeSort2.mergeSort(unsortiert2);
		MergeSort2.ausgeben(unsortiert2);
		
		IO.write(unsortiert2, "/home/niklas/workspace/ADSBLATT8/doubleOutput");
	}
}
