package poke.controller;

import poke.model.*;
import poke.view.PokeFrame;

import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	
	private List<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokemonFrame(this);
	}
	
	public void buildPokedex()
	{
		pokedex.add(new Jigglypuff());
		pokedex.add(new Magicarp());
		pokedex.add(new Charizard());
		pokedex.add(new PickaCHUUU());
		pokedex.add(new Snorlax());
		pokedex.add(new Squirtle());
	}
	
	public List<Pokemon> getPodedex()
	{
		
	}
	public boolean isValidInteger(String input)
	{
		
	}
	public boolean isValidDouble(String input)
	{
		
	}
	public String [] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
}
