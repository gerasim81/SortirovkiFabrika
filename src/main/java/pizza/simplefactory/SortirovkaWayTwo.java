package pizza.simplefactory;

public class SortirovkaWayTwo extends SortirovkaWays{
	Sortirovka createSortirovka(String name){
		if (name.equals("sort1Type")){
			return new SortirovkaShaker();
		}
		if (name.equals("sort2Type")){
			return new SortirovkaEvenOdd();
		}
		else return null;
	}
}
