package JavaFundamentals;
import java.util.*;
public class LCM {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of elements in an array");
     int n=sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter "+n+" Elements");
     int lcm=Integer.MIN_VALUE;
     for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++){
         if(arr[i]<=0){
             System.out.println("Not Applicable");
             return;
         }
         if(arr[i]>lcm){
             lcm=arr[i];
         }
     }
     int a=lcm;
    // System.out.println(lcm);
    
     while(true){
    	 boolean flag = true;
         for(int i=0;i<n;i++){
             if(lcm%arr[i]!=0){
                 flag=false;
             }
         }
         if(flag){
           break;
         }
            lcm+=a;
     }
     System.out.println(lcm);
}
}