/**
 * 
 */
package ood.creational.prototype;

/**
 * @author braj.kishore
 *
 */
public class PrototypeFactory  {

	
	public IPrototype makeCopy(IPrototype iPrototype){
		return iPrototype.copy();
	}

	
}
