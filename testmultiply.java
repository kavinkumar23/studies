package studies;
import java.time.Period;
import java.util.*;
public class test  extends Thread{
	public static  synchronized void main(String[] arg) throws InterruptedException 
	{
//	Locale l=new Locale("en","US");
		Period p=Period.of(3, 12,2018);
		System.out.println(p.getDays()+" "+p.getMonths());
	// print value 
	
	System.out.print("asfdas");

	
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int nt=0;nt<t;nt++){
			int size=sc.nextInt();
			int[] arr=new int[size];
			for(int j=0;j<size;j++){
				arr[j]=sc.nextInt();
			}
			int[] f=new int[3];
			f[0]=0;f[1]=0;f[2]=0;
			int res=0;
			 for (int i = 0; i <size; i++) {
		        f[arr[i] % 3]++; 
		    }
			res=f[1]+f[2];
			if(size/2<=res&&!(f[1]==f[2]&&res==size)){
				 System.out.print("Yes\n");
			}else{
				 System.out.print("No\n");
			}
			 System.out.println();
		}
	}
//	public void run(){
//		System.out.println("tss");
//	}
}
