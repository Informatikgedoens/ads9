import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	
	private static boolean inProgress = true;
	
	private static final String MAIN_ERROR = "Error! No such command.";
	
	private static boolean file = false;
	
	private static String[] string = null;
	private static double[] double1 = null;
	private static int[] integer = null;
	
	private static final String OUTPUT = "C:/Users/Gsus Cryst/Desktop";

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
									string = new IO().rwString(help[0]);
								} catch (Exception e) {
									System.err.println(MAIN_ERROR);
								}
								if (string != null) {
									file = true;
								}
								break;
							case "2":
								try {
									double1 = new IO().rwDouble(help[0]);
								} catch (Exception e) {
									System.err.println(MAIN_ERROR);
								}
								if (double1 != null) {
									file = true;
								}
								break;
							case "3":
								try {
									integer = new IO().rwInt(help[0]);
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
					case "1":
						InsertionSort is = new InsertionSort();
						System.out.println("Insertionsort");
						if (string != null) {
							string = is.insert(string);
							try {
								new IO().write(string, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = is.insert(double1);
							try {
								new IO().write(double1, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = is.insert(integer);
							try {
								new IO().write(integer, OUTPUT);
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
								new IO().write(string, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = bs.bubble(double1);
							try {
								new IO().write(double1, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = bs.bubble(integer);
							try {
								new IO().write(integer, OUTPUT);
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
								new IO().write(string, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							double1 = ss.select(double1);
							try {
								new IO().write(double1, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							integer = ss.select(integer);
							try {
								new IO().write(integer, OUTPUT);
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
								new IO().write(string, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(string.length);
						} else if (double1 != null) {
							ms.mergeSort(double1);
							try {
								new IO().write(double1, OUTPUT);
							} catch (Exception e) {
								
							}
							System.out.println(double1.length);
						} else if (integer != null) {
							ms.mergeSort(integer);
							try {
								new IO().write(integer, OUTPUT);
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
									new IO().write(string, OUTPUT);
								} catch (Exception e) {
									
								}
								System.out.println(string.length);
							} else if (double1 != null) {
								qs.quicksort(double1, u, o);
								try {
									new IO().write(double1, OUTPUT);
								} catch (Exception e) {
									
								}
								System.out.println(double1.length);
							} else if (integer != null) {
								qs.quicksort(integer, u, o);
								try {
									new IO().write(integer, OUTPUT);
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
		System.out.println("1 - Insertionsort");
		System.out.println("2 - Bubblesort");
		System.out.println("3 - Selectionsort");
		System.out.println("4 - Mergesort");
		System.out.println("5 \"u\" \"o\" - Quicksort");
		System.out.println("6 - Neue Datei");
		System.out.println("7 - Beenden");
	}

	private static void mainMenu() {
		System.out.println("Sortieralgorithmen");
		System.out.println("1 - Datei auswählen");
		System.out.println("2 - Beenden");
	}
}
