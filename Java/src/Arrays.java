import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Arrays {
	public static void main(String[] args) throws IOException {
		ArrayList<String> l = new ArrayList<String>();
	/*	l.add("srinivas");
		l.add("madhuri");
		l.add("kshitij");
		l.add("mydad");
		l.add("mymum");
		
		for (int i = 0;i<l.size();i++){
		System.out.println(l.get(i));
		System.out.println(l.size());
		System.out.println(l.indexOf("srinivas"));
		*/
	/*	HashMap <String ,String> hash = new HashMap<String, String>();
		hash.put("srinivas", "father");
		hash.put("kshitij", "son");
		hash.put("komaraiah", "dad");
		
		System.out.println(hash.get("kshitij"));
		*/
		String test = "D:\\temp.txt";
		File f =  new File(test);
		f.createNewFile();
		FileWriter fw = new FileWriter(test);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("this is first line");
		bw.newLine();
		bw.write("this is second line");
		bw.close();
		FileReader fr = new FileReader(test);
		BufferedReader b = new BufferedReader(fr);
		String content = "";
		//while((content = b.readLine())! = null){
			while((content = b.readLine())!= null){
			System.out.println(content);
		}
		
		
		
		
		
		
	//	}	

}
}