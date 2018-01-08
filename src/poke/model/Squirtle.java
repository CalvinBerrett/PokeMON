package poke.model;

public class Squirtle extends Pokemon implements Water
{

	public Squirtle()
	{
		super(777, "Squirtle");
		setup();
	}
	
	public Squirtle(String name)
	{
		super(7, name);
		setup();
	}
	
	public Squirtle(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(900);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.95);
		this.setHealthPoints(400);
	}
	
}
