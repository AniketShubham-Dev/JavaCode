package JavaFundamentals;

public class DefaultValueOfInstanceVarable {
	//Creating Instance Variable without assigning values
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean bol;
	String str;
	
public static void main(String[] args) {
	DefaultValueOfInstanceVarable obj = new DefaultValueOfInstanceVarable();
	//Printing Instance Variables
	System.out.println("Default value of byte data type = "+obj.b);
	System.out.println("Default value of short data type = "+obj.s);
	System.out.println("Default value of int data type = "+obj.i);
	System.out.println("Default value of long data type = "+obj.l);
	System.out.println("Default value of float data type = "+obj.f);
	System.out.println("Default value of double data type = "+obj.d);
	System.out.println("Default value of char data type = "+obj.c);
	System.out.println("Default value of boolean data type = "+obj.bol);
	System.out.println("Default value of String data type = "+obj.str);
}
}
