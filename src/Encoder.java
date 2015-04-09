import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



public class Encoder
{
	private File file;
	private String plaintext;
	
	public static String rot13(String value) {
		String alpha = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
		char[] values = value.toCharArray();
		String toret = "";
		for (char i:values) {
			   if (alpha.contains(""+i))
		}
			return new String(toret);
		}
	public Encoder(String filename) 
	{
		
	
		
		
		
	}
	public void write(String plaintext)
	{
		PrintWriter p;
		try {
			p = new PrintWriter(plaintext);
			p.println(plaintext);
			p.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static String encode(String plainText) {
		  // deal with the case that method is called with null argument
		  String encodedMessage = "";
		  if (plainText == null) return plainText;
		  for (int i = 0; i < plainText.length(); i++) {
		    char c = plainText.charAt(i);
		    
		    encodedMessage += c;
		  }
		  return encodedMessage;
		}
	public List<String> read()
	{
		return  null;
		
	}
	
	
	
}
