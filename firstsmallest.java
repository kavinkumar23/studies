package studies;

import java.util.Arrays;
import java.util.Scanner;

public class firstsmallest {
   
	public static int result=0;
	public static int num1=0;
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur number\n");
		int num,k,i=0;
		Integer[] a=new Integer[20];
		num=sc.nextInt();
		
		 num1=num;
		while(num>0){
			k=num%10;
			a[i++]=k;
			num=num/10;
		}
		i--;
		function(a,i);
		System.out.println(result);
		
		
		
		
//		System.out.println(result+" This is the result:))");
		 
	 }
	public static void function(Integer[] a,int i){
		
		for(int first=0;first<=i;first++)
		{
			for(int second=0;second<=i;second++){
					int temp=a[first];
					a[first]=a[second];
					a[second]=temp;
					StringBuilder r=new StringBuilder();
					for(int h=0;h<=i;h++){
						r.append(String.valueOf(a[h]));
					}
					StringBuilder s=new StringBuilder(r.reverse());
					Integer o=Integer.parseInt(s.toString());
					if(result<o&&o<num1){
						result=Integer.parseInt(s.toString());
						function(a,i);
					}
					temp=a[first];
					a[first]=a[second];
					a[second]=temp;
			}
		}
		
	}
	
}
