import java.util.*;


public class BackEnd
{
	private TreeMap<String, List<String>> messages;
	
	public BackEnd()
	{
		
	}
	
	public List<String> getMessages(String username)
	{
		return messages.get(username);
	}
	public void addMessage(String username, String msg)
	{
		
	}
	
	public List<String> getUsers()
	{
		Set<String> keys = messages.keySet();
		List<String> keyList = new ArrayList<String>();
		for (String x: keys)
		{
			keyList.add(x);
		}
		return keyList;
	}
}
