//$Id$
package studies;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import java.util.Stack;

public class stackqueue {
	public static void main(String[] args){
		Stack<Character> tr=new Stack<Character>();
		Queue<Character> qt=new LinkedList<Character>();
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.nextLine();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				tr.push(str.charAt(i));
			}else{
				if(tr.isEmpty()){
					System.out.println("FALSE");
					break;
				}
				tr.pop();
			}
		}
		if(tr.isEmpty()){
			System.out.println("TRUE");
		}
	}
}
