package JavaFundamentals;

public class ThreadDemo {
	static public  void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	for(int i=0;i<10;i++) {
		System.out.print("Main Thread  ");
	}
}
}
