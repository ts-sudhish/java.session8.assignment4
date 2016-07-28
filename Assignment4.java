/**
 * 
 */
package sdh.java.session8;

/**
 * @author Sudhish
 * 
 */
public class Assignment4 extends Thread {

	/**
	 * @param args
	 */
	public Assignment4(String name) {
		super(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 myThread = new Assignment4("myThread");
		myThread.start();
		while (myThread.isAlive()) {
			System.out
					.println("Main thread will be alive till the child thread is live");
		}
		System.out.println("Main thread's run is over");
	}

	public void run() {
		System.out.println("My thread created");
		for (int i = 1; i < 11; i++) {
			System.out.println("Printing the count " + i);
		}
		System.out.println("My thread's run is over");
	}
}
