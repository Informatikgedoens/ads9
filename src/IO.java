import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class IO {
	private static FileReader fr;
	private static BufferedReader br;
	private static FileWriter fw;
	private static BufferedWriter bw;
	
	public static String[] rwString (String pathname) throws IOException {
		
		fr = new FileReader(pathname);
		br = new BufferedReader(fr);
		
		String [] splitResult = null;
		String line = br.readLine();
		String temp = "";

		while(line != null) { //bei leerer Zeile stoppt der Reader.
			temp += line + ";";
			line = br.readLine();
		}
		//close file and create Array.
		br.close();
		splitResult = temp.split(";");

		return splitResult;
		
	}
	
	public static void write(String[] result, String destination) throws IOException {
		
		fw = new FileWriter(destination);
		bw = new BufferedWriter(fw);
		//write the array to file.
		for (int i=0; i < result.length; i++) {
			bw.write(result[i] + ";");
		}
		bw.close();
	}
	
	public static void write(int[] result, String destination) throws IOException {
		
		fw = new FileWriter(destination);
		bw = new BufferedWriter(fw);
		
		for (int i=0; i < result.length; i++) {
			bw.write(result[i] + ";");
		}
		bw.close();
	}
	
	public static void write(Double[] result, String destination) throws IOException {
		
		fw = new FileWriter(destination);
		bw = new BufferedWriter(fw);
		
		for (int i=0; i < result.length; i++) {
			bw.write(result[i] + ";");
		}
		bw.close();
	}


	public static int[] rwInt (String pathname) throws IOException {
		
		fr = new FileReader(pathname);
		br = new BufferedReader(fr);
		
		String[] splitResult = null;
		String line = br.readLine();
		String temp = "";
		
		while (line != null) {
			temp += line +";";
			line = br.readLine();
		}
		splitResult = temp.split(";");
		int[] ints = new int[splitResult.length];
	    for (int i=0; i < splitResult.length; i++) {
	        ints[i] = Integer.parseInt(splitResult[i]);
	    }
		
		
		return ints;
	}
	
public static Double[] rwDouble (String pathname) throws IOException {
		
		fr = new FileReader(pathname);
		br = new BufferedReader(fr);
		
		String line = br.readLine();
		String temp = "";
		
		while (line != null) {
			temp += line +";";
			line = br.readLine();
		}
		String[] splitResult = temp.split(";");
		Double[] doubles = new Double[splitResult.length];
	    for (int i=0; i < splitResult.length; i++) {
	        doubles[i] = Double.parseDouble(splitResult[i].replaceAll(",","."));
	    }

		return doubles;
	}
}
