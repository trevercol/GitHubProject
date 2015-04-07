import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



public class Encoder
{
	private File file;
	private String plaintext;
	
	public static String rot13(String value) {

		char[] values = value.toCharArray();
		for (int i = 0; i < values.length; i++) {
			   char letter = values[i];

			    
			    if (letter >= 'a' && letter <= 'z') {
				// Rotate lowercase letters.

			    	if (letter > 'm') {
			    		letter -= 13;
			    			} 	
			    	else {
				    	letter += 13;
						 }
			    } 	else if (letter >= 'A' && letter <= 'Z') {
				// Rotate uppercase letters.

			    	if (letter > 'M') {
			    		letter -= 13;
				} 	else 
					{
				    	letter += 13;
					}
			    }
			    		values[i] = letter;
			}
			return new String(values);
		}
	public Encoder(String filename) 
	{
		
	
		
		
		
	}
	public void write(String plaintext)
	{
		
		
		
		
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
