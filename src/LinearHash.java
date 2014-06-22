import java.util.ArrayList;
import java.util.Scanner;


public class LinearHash {
	private Integer[] table;
	private static final int MAXSIZE = 13;
	
	public LinearHash () {
		table = new Integer[MAXSIZE];
	}
	
	//Hashcode für int.
	private int hashCode (int value) {
		int hash = (value % MAXSIZE);
		return hash;
	}
	
	//gibt den Wert für den dazugehörigen key zurück
	public Integer getValue (int key) {
		if(table != null) {
			int value = table[key];
			return value;
		} else {
			System.out.println("Eintrag nicht gefunden!");
			return null;
		}
	}
	
	//prüft ob es der Wert enthalten ist.
	public boolean contains (int value) {
		if (table != null) {
			for(int i=0; i < table.length; i++) {
				if(table[i] != null && table[i] == value) {
					return true;
				}
			}
		}
		return false;
	}
	
	//gibt den Key für den dazugehörigen Value zurück.
	public Integer getKey (int value) {
		if (table != null) {
			for(int i=0; i < table.length; i++) {
				if(table[i] != null && table[i] == value) {
					return i;
				}
			}
		}
		System.out.println("Keinen Eintrag gefunden.");
		return null;
	}
	
	//einfügen.
	public void insert (int[] input) {
		for (int a=0; a < input.length; a++) {
			int value = input[a];
			int hash = hashCode(value);
		while(table[hash] != null)  {
			hash++;
			if(hash > MAXSIZE-1) {
				hash = 0;
			}
		}
		table[hash] = value;
		ausgeben();
		}
		
	}
	
	//entfernt den angegeben Wert.
	public void removeByValue (int value) {
		if(contains(value)) {
			int key = getKey(value);
			table[key] = null;
			System.out.println();
			System.out.println("Der Eintrag wurde erfolgreich entfernt!");
			ausgeben();
		} else {
			System.out.println("Eintrag nicht vorhanden.");
		}
		
	}
	
	//entfernt den Wert an dem angegeben Index.
	public void removeByKey (int key) {
		if (table[key] == null) {
			System.out.println("Zu diesem Key gibt es keinen Eintrag.");
		} else {
			table[key] = null;
			System.out.println("Der Eintrag wurde erfolgreich entfernt.");
			System.out.println();
			ausgeben();
		}
	}
	
	//modifiziert an der Stelle key.
	public void modifyByKey (int key, int value) {
		if (table[key] != null) {
			table[key] = value;
		} else {
			System.out.println("Kein Eintrag gefunden!");
		}
	}
	
	//sucht einen Wert und ändert ihn.
	public void modifyByValue (int value, int newValue) {
		if (table != null && contains(value)) {
			int key = getKey(value);
			table[key] = newValue;
		} else {
			System.out.println("Kein Eintrag gefunden!");
		}
		
	}
	
	public void ausgeben () {
		System.out.println("hashtabelle: ");
		for(int i=0; i < table.length; i++) {
			System.out.print(table[i] + ",");
		}
		System.out.println();
		System.out.println();
	}
}
