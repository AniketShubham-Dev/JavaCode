package JavaNumbersFundamentals;
import java.util.Scanner;
public class LcmOfTwoNumber {
public static void main(String[] args) {
	System.out.println("Enter Two numbers");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int lcm=(a>b)?a:b;
	while(true) {
		if(lcm%a==0 && lcm%b==0) {
			System.out.println("LCM Using while loop and if condition - "+lcm);
			break;
		}
		++lcm;
	}
	int a1=a,b1=b;
	while(a1!=b1) {
		if(a1>b1) {
			a1=a1-b1;
		}else {
			b1=b1-a1;
		}
	}
	System.out.println("HCF of "+a+" and "+b+" is "+ b1);
	System.out.println("LCM Using HCF "+(a*b)/a1);
	
	
}
}
