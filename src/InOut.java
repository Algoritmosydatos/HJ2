import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class InOut {
	
	public static final String filename = "datos.txt";

	public static void writeText(String message, String filename){
		 try {
		        BufferedWriter out = new BufferedWriter(new FileWriter(filename));
		            out.write(message);
		            out.close();
		        } catch (IOException e) {}
	}
	
	public static String readText(String filename){
		String line = null;
		try{
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			line = reader.readLine();
			/*while ((line = reader.readLine()) != null) {
			}*/
		}catch(IOException e){}
		return line;
	}
	
}
