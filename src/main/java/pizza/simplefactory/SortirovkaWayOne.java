package pizza.simplefactory;

public class SortirovkaWayOne extends SortirovkaWays{
	Sortirovka createSortirovka(String name){
		if (name.equals("sort1Type")){
			return new SortirovkaBubble();
		}
		if (name.equals("sort2Type")){
			return new SortirovkaBrush();
		}
		else return null;
		
	}
}
