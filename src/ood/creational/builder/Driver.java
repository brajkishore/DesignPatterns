/**
 * 
 */
package ood.creational.builder;

/**
 * @author braj.kishore
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Take a meal builder first
		 */

		
		IMealBuilder builder=new McDMealBuilder();
		
		/*
		 * Make a meal having burger and coke only
		 */
		IMeal meal=builder.burger("checken smoked").hasCoke(true).buildMeal();
		
		System.out.println("Ready Meal:"+meal);
		
		
		/*
		 * Make a burger having burger,coke,chips,toys
		 */
		builder=new McDMealBuilder();
		meal=builder.burger("Veg fried").hasCoke(true).hasChips(true).hasToy(true).buildMeal();
		
		System.out.println("Ready Meal:"+meal);
		
	}

}
