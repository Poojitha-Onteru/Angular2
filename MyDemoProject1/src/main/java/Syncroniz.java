class TestSyncronize{
	synchronized void printTable(int n) {
		int r=0;
		for(int i=1;i<=10;i++) {
			r=n*i;
			System.out.println(n+"*"+i+"="+r);
			try {
				Thread.sleep(400);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}
}

class Thread1 extends Thread{
	TestSyncronize t1;
	public Thread1(TestSyncronize t) {
		this.t1=t;
	}
	public void run() {
		t1.printTable(5);
	}
}

class Thread2 extends Thread{
	TestSyncronize t2;
	public Thread2(TestSyncronize t) {
		this.t2=t;
	}
	public void run() {
		t2.printTable(100);
	}
}

public class Syncroniz {
	public static void main(String arga[]) {
		TestSyncronize obj=new TestSyncronize();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();
	}

}
