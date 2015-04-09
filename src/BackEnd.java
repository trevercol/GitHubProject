import java.util.*;


public class BackEnd
{
	private TreeMap<String, List<String>> messages;
	private String msgsForEncoder;
	private Encoder EEE;
	public BackEnd()
	{
		messages = new TreeMap<String, List<String>>();
	}
	
	/*public void idk()
	{
		String blah = "";
		for(int i = 0;i<messages.size();i++)
		{
			blah = blah + "" +messages.get(i)+""+ messages.get(i).toString();
		}
		EEE.write(blah);
	}
	*/
	public List<String> getMessages(String username)
	{
		return messages.get(username);
	}
	public void addMessage(String username, String msg)
	{
		if (messages.containsKey(username))
		{
			List<String> msgs = messages.get(username);
			msgs.add(msg);
			messages.put(username, msgs);
		}
		else
		{
			List<String> msgList = new ArrayList<String>();
			msgList.add(msg);
			messages.put(username, msgList);
		}
		
		msgsForEncoder += username + "\t" + msg +"\n";
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
	
	public String getAll()
	{
		return msgsForEncoder;
	}
}
