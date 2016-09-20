/**
 * 
 */
package ood.creational.builder;

/**
 * @author braj.kishore
 *
 */
public class McDMealBuilder implements IMealBuilder {

	IMeal meal;
	
	McDMealBuilder(){
		meal=new Meal();
	}
	
	@Override
	public IMealBuilder burger(String burger) {
		// TODO Auto-generated method stub
		meal.setBurger(burger);
		return this;
	}

	@Override
	public IMealBuilder hasCoke(boolean hasCoke) {
		// TODO Auto-generated method stub
		meal.setHasCoke(hasCoke);
		return this;
	}

	@Override
	public IMealBuilder hasChips(boolean hasChips) {
		// TODO Auto-generated method stub
		meal.setHasChips(hasChips);
		return this;
	}

	@Override
	public IMealBuilder hasToy(boolean hasToy) {
		// TODO Auto-generated method stub
		meal.setHasToy(hasToy);
		return this;
	}

	@Override
	public IMeal buildMeal() {
		// TODO Auto-generated method stub
		return meal;
	}

}
