package simple;

class DemoThread extends Thread{
	int sum=0;
	@Override
	public void run() {
		synchronized(this){
			for(int i=0 ; i<=10 ; i++) {
				sum +=i;
			}
			this.notify();
		}
	}
}

public class package simple;

class DemoThread extends Thread{
	int sum=0;
	@Override
	public void run() {
		synchronized(this){
			for(int i=0 ; i<=10 ; i++) {
				sum +=i;
			}
			this.notify();
		}
	}
}

public class Synchronization {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
 
		DemoThread dt=new DemoThread();
		dt.start();
		 synchronized (dt){
			try {
				dt.wait();
				System.out.print("Sum is " +dt.sum);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}

 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
 
		DemoThread dt=new DemoThread();
		dt.start();
		 synchronized (dt){
			try {
				dt.wait();
				System.out.print("Sum is " +dt.sum);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}

