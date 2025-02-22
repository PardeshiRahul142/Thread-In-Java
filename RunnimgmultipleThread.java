package simple;

class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		try {
			Thread.sleep(2000);
		}
     
		catch(Exception e) {
			e.printStackTrace();
		}
		}
	}
}
public class RunningMultipleThread {
	public static void main(String[] args) {
		MyThread t1=new MyThread();
//		MyThread t2=new MyThread();
//        MyThread t3=new MyThread();
        
        t1.start();
//        t2.start();
//        t3.start();

	}

}
