
public class LinearProbingHashTable {
	private static final int MAXSIZE = 10;
	private int currentSize;
	private HashContent [] map;
	
	public LinearProbingHashTable() {
		currentSize = 0;
		map = new HashContent[MAXSIZE];
	}

	public void clearHash() {
		currentSize = 0;
		map = new HashContent[MAXSIZE];
	}

	public int getCurrentSize() {
		return currentSize;
	}

	public boolean isFull() {
		return currentSize == MAXSIZE;
	}

	public boolean isEmpty() {
		return getCurrentSize() == 0;
	}

	//Hashfunktion mit dem Muster h(i)= i % N; N = groeße der Tabelle.
	//returnt den Hashwert/key;
	private int hashFunction (int value) {
		int hash = (value % MAXSIZE);
		return hash;
	}
	
	public void insert (int[] input) {
		for (int a=0; a < input.length; a++) {
			if (currentSize == MAXSIZE) {
				System.out.println("Liste ist voll!");
			} else {
			int value = input[a];
			int hash = hashFunction(value);
		while (map[hash] != null) {
            hash++;
            if(hash > MAXSIZE-1) {
				hash = 0;
			}
		}
      map[hash] = new HashContent(hash, value);
      currentSize++;
      ausgeben();
			}
		}
	}
	
	public void modify (int key, int value) {
		int hash = hashFunction(key);
		if(map[hash] != null) {
			map[hash].setValue(value);
		} else {
			System.out.println("Keinen Eintrag gefunden!");
		}
		ausgeben();
	}
	
	public void remove (int key) {
		int hash = hashFunction(key);
		if (map[hash] == null) {
			System.out.println("Zu diesem Key gibt es keinen Eintrag.");
		} else {
			map[hash] = null;
			System.out.println("Der Eintrag wurde erfolgreich entfernt.");
			System.out.println();
			ausgeben();
		}
	}
	
	public int get (int key) {
		int hash = hashFunction(key);
		if(key >= MAXSIZE) {
			System.out.println("Keinen Eintrag gefunden !");
			return -1;
		} else if (map[hash] != null) {
			System.out.println("Key: " + key);
			System.out.println("Value: " + map[hash].getValue());
			return map[hash].getValue();
		} else {
			return -1;
		}
	}
	
	public void ausgeben () {
		System.out.println("Hashtabelle: ");
		for (int i=0; i < map.length; i++) {
			if(map[i] != null) {
			System.out.print(" [" + map[i].getKey() + "," + map[i].getValue() +"]");
		} else {
			System.out.print(" [null]");
		}
	}
		System.out.println();
		System.out.println();
	}
}