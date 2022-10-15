package JavaNumbersFundamentals;

public class ArmstrongDemo {
	
	public static boolean isArmstrong(String s) {
		
		int n=s.length();
		int a=Integer.valueOf(s);
		int a1=a;
		int n1=0;
		while(a1!=0) {
			int temp=a1%10;
			n1+=Math.pow(temp, n);
			a1/=10;
		}
		if(n1==a) {
			return true;
		}else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=153;
			if(isArmstrong(String.valueOf(a))) {
				System.out.println(a+" is "+"Armstrong Number");
			}else {
				System.out.println(a+" is not "+"Armstrong Number");
			}
	}

}
