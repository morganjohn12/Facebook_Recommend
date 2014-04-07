package calculate;

public class myObject 
{
	public myObject()
	{
		count = 0;
		key = "";
	}
	
	public myObject(String item, int num)
	{
		count = num;
		key = item;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public String getKey()
	{
		return key;
	}
	
	private int count;
	private String key;
}
