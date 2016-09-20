/**
 * 
 */
package ood.creational.builder;

/**
 * @author braj.kishore
 *
 */
public interface IMealBuilder {

	IMealBuilder burger(String burger);
	IMealBuilder hasCoke(boolean hasCoke);
	IMealBuilder hasChips(boolean hasChips);
	IMealBuilder hasToy(boolean hasToy);	
	IMeal buildMeal();
	
}
