//$Id$
package studies;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class leastnumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		TreeMap<Integer, Integer> count=new TreeMap<Integer,Integer>();
//		HashMap<Integer, new ArrayList<Integer>()> rec=new HashMap<Integer,new ArrayList<>()>()
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
			if(!count.containsKey(arr[i])){
				count.put(arr[i], 1);
			}
			else{
				count.put(arr[i], count.get(arr[i])+1);
			}
		}
//		System.out.println(count);
		int small=32000;
		List<Integer> num=new ArrayList<Integer>();
		for(Integer itr:count.keySet()){
			if(count.get(itr)<=small){
				if(!num.contains(itr)&&small==count.get(itr)){
					num.add(itr);
				}else{
					num=new ArrayList<Integer>();
					num.add(itr);
				}
				small=count.get(itr);
			}
		}
		for(int i=0;i<num.size();i++){
			for(int j=0;j<size;j++){
				if(arr[j]==num.get(i)){
					System.out.println("Least number:"+arr[j]+","+"Location:"+j);
				}
			}
		}
		
	}

}
