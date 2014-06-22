import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	
	private static boolean inProgress = true;
	
	private static final String MAIN_ERROR = "Error! No such command.";
	
	private static boolean file = false;
	
	String[] string = null;
	double[] double1 = null;
	int[] integer = null;
	
	private static final String OUTPUTSTR = "C:\\Users\\Niklas\\Desktop\\ADSS8\\ADS8\\stringOut.txt";
	private static final String OUTPUTINT = "C:\\Users\\Niklas\\Desktop\\ADSS8\\ADS8\\intOut.txt";
	private static final String OUTPUTDOUBLE = "C:\\Users\\Niklas\\Desktop\\ADSS8\\ADS8\\doubleOut.txt";
	private static final String OUTPUTHASH = "/home/niklas/workspace/ADSBLATT8/integerHashOut.txt";

	public static void main(String[] args) {
		String[] string = null;
		double[] double1 = null;
		int[] integer = null;
		while (inProgress) {
			if (!file) {
				mainMenu();
			} else {
				sortMenu();
			}
			String prompt = Terminal.askString("> ");
			String[] input = prompt.split(" ");
			if (!file) {
				if (input.length == 1) {
					switch (input[0]) {
					case "1":
						System.out.println("Gebe einen Dateipfad an und eine Zahl (1 = String, 2 = Double, 3 = Integer)");
						prompt = Terminal.askString("> ");
						String[] help = prompt.split(" ");
						if (help.length == 2) {
							switch (help[1]) {
							case "1":
								try {
									string =  IO.rwString(help[0]);
								} catch (Exception e) {
									System.err.println(MAIN_ERROR);
								}
								if (string != null) {
									file = true;
								}
								break;
							case "2":
								try {
									double1 = IO.rwDouble(help[0]);
								} catch (Exception e) {
									System.err.println(MAIN_ERROR);
								}
								if (double1 != null) {
									file = true;
								}
								break;
							case "3":
								try {
									integer = IO.rwInt(help[0]);
								} catch (Exception e) {
									System.err.println(MAIN_ERROR);
								}
								if (integer != null) {
									file = true;
								}
								break;
							}
						} else {
							System.err.println(MAIN_ERROR);
						}
						break;
					case "2":
						System.exit(0);
					}
				} else {
					System.err.println(MAIN_ERROR);
				}
			} else {
				if (input.length == 1) {
					switch (input[0]) {
					case "0":
						System.out.println("Wählen Sie eine Aktion: ");
						System.out.println("1 - insert");
						System.out.println("2 - remove");
						System.out.println("3 - modify");
						System.out.println("4 - beenden");
						prompt = Terminal.askString("> ");
						String[] help = prompt.split(" ");
						LinearProbingHashTable ht = new LinearProbingHashTable();
						switch (help[0]) {
						case "1":
							ht.insert(integer);
						case "2":
							System.out.println("Geben Sie den Key ein, welcher gelöscht werden soll.");
							prompt = Terminal.askString("> ");
							help = prompt.split(" ");
							int[] ints = new int[help.length];
						    for (int i=0; i < help.length; i++) {
						        ints[i] = Integer.parseInt(help[i]);
						    }
							ht.remove(ints[0]);
						}
						break;
					case "1":
						InsertionSort is = new InsertionSort();
						System.out.println("Insertionsort");
						if (string != null) {
							string = is.insert(string);
							try {
								IO.write(string, OUTPUTSTR);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = is.insert(double1);
							try {
								IO.write(double1, OUTPUTDOUBLE);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = is.insert(integer);
							try {
								IO.write(integer, OUTPUTINT);
							} catch (Exception e) {
								
							}
							System.out.println(integer.length);
						}
						System.out.println(is.counter);
						break;
					case "2":
						BubbleSort bs = new BubbleSort();
						System.out.println("Bubblesort");
						if (string != null) {
							string = bs.bubble(string);
							try {
								IO.write(string, OUTPUTSTR);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = bs.bubble(double1);
							try {
								IO.write(double1, OUTPUTDOUBLE);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = bs.bubble(integer);
							try {
								IO.write(integer, OUTPUTINT);
							} catch (Exception e) {
								
							}
							System.out.println(integer.length);
						}
						System.out.println(bs.counter);
						break;
					case "3":
						SelectionSort ss = new SelectionSort();
						System.out.println("Selectionsort");
						if (string != null) {
							string = ss.select(string);
							try {
								IO.write(string, OUTPUTSTR);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = ss.select(double1);
							try {
								IO.write(double1, OUTPUTDOUBLE);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = ss.select(integer);
							try {
								IO.write(integer, OUTPUTINT);
							} catch (Exception e) {
								
							}
							System.out.println(integer.length);
						}
						System.out.println(ss.counter);
						break;
					case "4":
						MergeSort ms = new MergeSort();
						System.out.println("Mergesort");
						if (string != null) {
							ms.mergeSort(string);
							try {
								IO.write(string, OUTPUTSTR);
								for(String s : string){
									System.out.print(s +",");
								}
								System.out.println();
							} catch (Exception e) {
								System.err.println("Fehler");
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							ms.mergeSort(double1);
							try {
								IO.write(double1, OUTPUTDOUBLE);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							ms.mergeSort(integer);
							try {
								IO.write(integer, OUTPUTINT);
							} catch (Exception e) {
								
							}
							System.out.println(integer.length);
						}
						System.out.println(ms.counter);
						break;
					case "6":
						file = false;
						string = null;
						double1 = null;
						integer = null;
						break;
					case "7":
						System.exit(0);
					}
				} else if (input.length == 3) {
					if (input[0].equals("5")) {
						int u = -1;
						int o = -1;
						try {
							u = Integer.parseInt(input[1]);
							o = Integer.parseInt(input[2]);
						} catch (Exception e) {
							
						}
						if (o != -1) {
							QuickSort qs = new QuickSort();
							System.out.println("Quicksort");
							if (string != null) {
								qs.quicksort(string, u, o);
								try {
									IO.write(string, OUTPUTSTR);
								} catch (Exception e) {
									
								}
								System.out.println(string.length);
							} else if (double1 != null) {
									qs.quicksort(double1, u, o);
								try {
									IO.write(double1, OUTPUTDOUBLE);
								} catch (Exception e) {
									
								}
								System.out.println(double1.length);
							} else if (integer != null) {
								qs.quicksort(integer, u, o);
								try {
									IO.write(integer, OUTPUTINT);
								} catch (Exception e) {
									
								}
								System.out.println(integer.length);
							}
							System.out.println(qs.counter);
						} else {
							System.err.println(MAIN_ERROR);
						}
					}
				}
			}
		}
	}

	private static void sortMenu() {
		System.out.println("Sortieralgorithmen");
		System.out.println("0 - Hashtabelle");
		System.out.println("1 - Insertionsort");
		System.out.println("2 - Bubblesort");
		System.out.println("3 - Selectionsort");
		System.out.println("4 - Mergesort");
		System.out.println("5 - Quicksort");
		System.out.println("6 - Neue Datei");
		System.out.println("7 - Beenden");
	}

	private static void mainMenu() {
		System.out.println("Sortieralgorithmen");
		System.out.println("1 - Datei auswählen");
		System.out.println("2 - Beenden");
	}
}