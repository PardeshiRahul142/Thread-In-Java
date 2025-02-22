package simple;
class RunnableThread implements Runnable{
	public void run() {
	System.out.println("This are thread using the runnable interface");
}
}
public class RunnableInterface {
	public static void main(String[]ar) {
		RunnableThread rt= new RunnableThread();
		Thread thread =new Thread(rt);
		thread.start();
	}

}
