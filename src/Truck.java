import java.util.ArrayList;

public class Truck extends Auto
{
	private ArrayList<String> haul;

	public Truck(int p, int s, int f)
	{
		super(p,s,f);
		haul = new ArrayList<String>();
	}
	
	public void move()
	{
		super.move();
		super.move();
		super.move();
	}
	
	public void load(String item)
	{
		haul.add(item);
	}
	//print a string 
	public String toString()
	{
		return super.toString()+haul.toString();
		
		
	}
}