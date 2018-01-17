package poke.controller;

import poke.model.*;
import poke.view.PokeFrame;
import poke.view.PokedexPanel;
import java.util.List;
import java.util.ArrayList;
import poke.controller.FileController;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PokemonController
{
	
	private List<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	public void start()
	{
		
	}
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
		return pokedex;
	}
	public boolean isValidInteger(String input)
	{
		return true;
	}
	public boolean isValidDouble(String input)
	{
		return true;
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
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifier(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}
}
