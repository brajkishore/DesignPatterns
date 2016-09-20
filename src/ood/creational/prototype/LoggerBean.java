/**
 * 
 */
package ood.creational.prototype;

/**
 * @author braj.kishore
 *
 */
public class LoggerBean implements IPrototype {
	
	LoggerBean(){
		System.out.println("LoggerBean is created");
	}

	@Override
	public IPrototype copy() {
		// TODO Auto-generated method stub
		
		LoggerBean loggerBean=null;
		try {
			loggerBean=(LoggerBean)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return loggerBean;
	}

}
