import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Dictionary
{
	private Map<String, List<String>> myData;
	
	public Dictionary()
	{
		myData = new TreeMap<String, List<String>>();
	}
	
	public int addDefinition(String word, String definition)
	{
		if (!myData.containsKey(word))
		{
			myData.put(word, new ArrayList<String>());
		}
		
		
		myData.get(word).add(definition);
		return myData.get(word).size();
	}
	
	public String removeDefinition(String word, int index)
	{
		return myData.get(word).remove(index);
	}
	
	public List<String> removeWord(String word)
	{
		List<String> l = new ArrayList<String>();
		l.addAll(myData.get(word));
		//myData.remove(myData.get(word));
		myData.remove(word);
		return l;
	}
	
	public List<String> wordlist()
	{
		return new ArrayList<String>(myData.keySet());
	}
	
	public List<String> wordlist(String letter)
	{
		String l = letter.toLowerCase();
		List<String> a = new ArrayList<String>(myData.keySet());
		List<String> r = new ArrayList<String>();
		for (int i=0; i<a.size(); i++)
		{
			String x = a.get(i).toLowerCase();
			if (x.startsWith(l))
				r.add(a.get(i));
		}
		return r;
	}
	
	public List<String> lookup(String word)
	{
		List<String> l = new ArrayList<String>();
		if (!myData.containsKey(word))
			return l;
		return myData.get(word);
	}
	
	public boolean contains(String word)
	{
		if (!myData.containsKey(word))
			return false;
		if (myData.get(word).equals(null))
			return false;
		return true;
	}
	
	public int size()
	{
		return wordlist().size();
	}
	
	public int load(String filename) 
	{
		int n = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File(filename));
			while (sc.hasNextLine())
			{
				n++;
				String[] s = sc.nextLine().split("\\t");	
				for (int i=1; i<s.length; i++)
				{
	
					this.addDefinition(s[0], s[i]);
	
				}
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
	}
	
	public void save(String filename)
	{
		PrintWriter out;
		try {
			
			out = new PrintWriter(filename);
			for (int i=0; i<myData.size(); i++)
			{
				String s = this.wordlist().get(i)+"\t";				
				for (int k=0; k<myData.get(this.wordlist().get(i)).size(); k++)
				{
					s += myData.get(this.wordlist().get(i)).get(k)+"\t"; //not adding anything
				}
				
				out.println(s);
			}
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void printWord(String word)
	{
		String s = word+"\t";
		List<String> defs = lookup(word);
		for (String x: defs)
		{
			s+="\n"+"\t"+"- "+x;
		}
		System.out.println(s);
	}
	
	public String returnWord(String word)
	{
		String s = word+"\t";
		List<String> defs = lookup(word);
		for (String x: defs)
		{
			s+="\n"+"\t"+"- "+x;
		}
		return s;
	}
	
	public void printAlpha(String letter)
	{
		List<String> words = wordlist(letter);
		for (String x: words)
		{
			printWord(x);
		}
	}
	
	public String returnAlpha(String letter)
	{
		List<String> words = wordlist(letter);
		List<String> s = new ArrayList<String>();
		for (String x: words)
		{
			s.add(returnWord(x));
		}
		String y = "";
		for (String x: s)
		{
			y+=x+"\n"+"\n\n";
		}
		return y;
	}
	
	public void printAll()
	{
		List<String> words = wordlist();
		for (String x: words)
			printWord(x);
	}
}
