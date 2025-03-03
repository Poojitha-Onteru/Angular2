
class TestSyncroniz{
	synchronized void sum(int a,int b) {
		
			System.out.println("The thread  sum="+(a+b));
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
	}
}

class Thread3 extends Thread{
	TestSyncroniz t1;
	public Thread3(TestSyncroniz t) {
		this.t1=t;
	}
	public void run() {
		t1.sum(5,6);
	}
}

class Thread4 extends Thread{
	TestSyncroniz t2;
	public Thread4(TestSyncroniz t) {
		this.t2=t;
	}
	public void run() {
		t2.sum(10,5);
	}
}


public class Syncroni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSyncroniz obj=new TestSyncroniz();
		Thread3 t1=new Thread3(obj);
		Thread4 t2=new Thread4(obj);
		t1.start();
		t2.start();

	}

}
