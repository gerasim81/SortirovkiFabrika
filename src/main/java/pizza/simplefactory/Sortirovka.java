package pizza.simplefactory;

public abstract class Sortirovka {
	String name;
	
	public String getName(){return name;}
	
	abstract public int[] sortirovka(int[] arrayToSort);
}