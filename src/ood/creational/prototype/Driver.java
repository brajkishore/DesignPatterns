/**
 * 
 */
package ood.creational.prototype;

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
		 * Get factory producing prototype 
		 */
		
		PrototypeFactory factory=new PrototypeFactory();
		
		/*
		 * Create copy an instance of SessionBean
		 */
		SessionBean session=new SessionBean();
		SessionBean copiedSession=(SessionBean)factory.makeCopy(session);
		
		System.out.println("session:"+System.identityHashCode(session));
		System.out.println("copiedSession:"+System.identityHashCode(copiedSession));
		
		/*
		 * Create copy an instance of LoggerBean
		 */
		LoggerBean logger=new LoggerBean();
		LoggerBean copiedLogger=(LoggerBean)factory.makeCopy(logger);
		
		System.out.println("logger:"+System.identityHashCode(logger));
		System.out.println("copiedLogger:"+System.identityHashCode(copiedLogger));
		

	}

}
