package demo;
class threadEx extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+" : "+"id running with priority :"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriority {
	public static void main(String[]args) {
	threadEx t1= new threadEx();
	threadEx t2= new threadEx();
	threadEx t3= new threadEx();
	
	t1.setPriority(Thread.MIN_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.NORM_PRIORITY);
	
	t1.start();
	t2.start();
	t3.start();
	
	}

}
