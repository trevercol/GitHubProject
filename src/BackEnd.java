import java.util.*;


public class BackEnd
{
	private TreeMap<String, List<String>> messages;
	
	public BackEnd()
	{
		messages = new TreeMap<String, List<String>>();
	}
	
	public List<String> getMessages(String username)
	{
		return messages.get(username);
	}
	public String addMessage(String username, String msg)
	{
		if (messages.containsKey(username))
		{
			messages.get(username).add(msg);
		}
		else
		{
			List<String> msgList = new ArrayList<String>();
			msgList.add(msg);
			messages.put(username, msgList);
		}
		
		return username + "\t" + msg;
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
