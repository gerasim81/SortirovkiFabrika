package pizza.simplefactory;

public abstract class SortirovkaWays {
	public Sortirovka prepareSort(String type){
		Sortirovka sort;
		
		sort = createSortirovka(type);
		
		System.out.println(sort.getName());
				
		return sort;
		
	}
	
	
	abstract Sortirovka createSortirovka(String name);
}
