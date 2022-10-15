package JavaFundamentals;

public class FirstRepeatedOccuranceOfChar {
	
	public static String repeated(String s) {
		s=s.toUpperCase();
		int[] a=new int[26];
		for(int i=0;i<s.length();i++) {
			if(a[s.charAt(i)-'A']==1) {
				return "First repeated Character is "+String.valueOf(s.charAt(i));
			}else {
				a[s.charAt(i)-'A']++;
			}
		}
		return "No Repeated Character";
	}
public static void main(String[] args) {
	String s="AniketShubham";
	System.out.println(repeated(s));
	
}
 }
