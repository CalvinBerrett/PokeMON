package poke.model;

public class Magicarp extends Pokemon implements Water
{

	public Magicarp()
	{
		super(888, "Magicarp");
		setup();
	}
	
	public Magicarp(String name)
	{
		super(888, name);
		setup();
	}
	
	public Magicarp(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(Double.POSITIVE_INFINITY);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.99);
		this.setHealthPoints(Double.POSITIVE_INFINITY);
	}
}
