package JavaFundamentals;

public class PalindromeStr {
	
	public static boolean isPalindrom(String s) {
		//First approach
		StringBuffer s1=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--){
			s1.append(s.charAt(i));
		}
		/////////////////////
		//Second approach
		//StringBuffer s1=new StringBuffer(s);
		//s1=s1.reverse();
		if(s.equals(s1.toString())) {
			return true;
		}else 
			return false;
	}
public static void main(String[] args) {
	String s="12321";
	if(isPalindrom(s)) {
		System.out.println("Palindrom");
	}else {
		System.out.println("Not Palindrom") ;
	}

}
}
