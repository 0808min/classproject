package chapter13;

public class SumThread extends Thread {

	Sum s;

	long num1;
	long num2;

	public SumThread(Sum s, long num1, long num2) {
		this.s = s;
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {

		for (long i = num1; i < num2; i++) {
			s.sum(i);

		}

	}
	
	public static void main(String[] args) {
		
//		합의 데이터를 저장하고, 합 연산을 하는 메소드가 정의된 객체
		Sum sum = new Sum();
		
		SumThread t1 = new SumThread(sum, 1, 500000);
		SumThread t2 = new SumThread(sum, 500001, 1000000);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("합 : " + sum.sum);
		
	}

}

class Sum {
	long sum;
	void sum(long num) {
		sum += num;
	}
}