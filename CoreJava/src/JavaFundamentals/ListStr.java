//Create One array with these input integer values in that array [ 1, 5, 8, 6, -1, 4, 11, 9 ] and 
    // Then find two sets of numbers that will equal 10; 
   //output [ 1, 9 ]    [  6,  4 ]

package JavaFundamentals;
import java.util.*;
public class ListStr {
	
	public static void listString() {
		List<String> li = new ArrayList<>();
		li.add("English");
		li.add("Hindi");
		li.add("Telgu");
		li.add("punjabi");
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<li.size();i++) {
			sb.append(li.get(i)).append(',');
		}
	
		System.out.println(sb);
	}
	
	public static void ArraySet() {
		int[] arr = new int [] {1,5,8,6,-1,4,11,9};
		List<List<Integer>> li = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				List<Integer> l = new ArrayList<>();
				if(arr[i]+arr[j]==10) {
					l.add(arr[i]);
					l.add(arr[j]);
				}
				li.add(l);
			}
		}
		for(int i=0;i<li.size();i++) {
			for(int j=0;j<li.get(i).size();j++) {
				System.out.print(li.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		ListStr.ArraySet();
	}

}
