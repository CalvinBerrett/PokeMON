package poke.model;

public class PickaCHUUU extends Pokemon implements Lightning
{

	public PickaCHUUU()
	{
		super(444, "PickaCHUUU");
		setup();
	}
	
	public PickCHUUU(String name)
	{
		super(444, name);
		setup();
	}
	
	public PickaCHUUU(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(666);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(666);
	}
}
