/**
 * 
 */
package ood.creational.builder;

/**
 * @author braj.kishore
 *
 */
public class Meal implements IMeal{

	private String burger;
	private boolean hasCoke;
	private boolean hasChips;
	private boolean hasToy;
	/**
	 * @return the burger
	 */
	public String getBurger() {
		return burger;
	}
	/**
	 * @param burger the burger to set
	 */
	public void setBurger(String burger) {
		this.burger = burger;
	}
	/**
	 * @return the hasCoke
	 */
	public boolean isHasCoke() {
		return hasCoke;
	}
	/**
	 * @param hasCoke the hasCoke to set
	 */
	public void setHasCoke(boolean hasCoke) {
		this.hasCoke = hasCoke;
	}
	/**
	 * @return the hasChips
	 */
	public boolean isHasChips() {
		return hasChips;
	}
	/**
	 * @param hasChips the hasChips to set
	 */
	public void setHasChips(boolean hasChips) {
		this.hasChips = hasChips;
	}
	/**
	 * @return the hasToy
	 */
	public boolean isHasToy() {
		return hasToy;
	}
	/**
	 * @param hasToy the hasToy to set
	 */
	public void setHasToy(boolean hasToy) {
		this.hasToy = hasToy;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Meal [burger=" + burger + ", hasCoke=" + hasCoke + ", hasChips=" + hasChips + ", hasToy=" + hasToy
				+ "]";
	}
	
	
	
	
}
