/**
 * 
 */
package ood.creational.prototype;

/**
 * @author braj.kishore
 *
 */
public class SessionBean implements IPrototype {
	
	SessionBean(){
		System.out.println("SessionBean is created");
	}

	@Override
	public IPrototype copy() {
		// TODO Auto-generated method stub
		
		SessionBean sessionBean=null;
		try {
			sessionBean=(SessionBean)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sessionBean;
	}

}
