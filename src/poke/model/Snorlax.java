package poke.model;

public class Snorlax extends Pokemon implements Fairy
{

	public Snorlax()
	{
		super(555, "Snorlax");
		setup();
	}
	
	public Snorlax(String name)
	{
		super(555, name);
		setup();
	}
	
	public Snorlax(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(75);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.70);
		this.setHealthPoints(100000);
	}
}
