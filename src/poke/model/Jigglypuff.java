package poke.model;

public class Jigglypuff extends Pokemon implements Fairy
{

	public Jigglypuff()
	{
		super(666, "Jigglypuff");
		setup();
	}
	
	public Jigglypuff(String name)
	{
		super(666, name);
		setup();
	}
	
	public Jigglypuff(int number, String name)
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
