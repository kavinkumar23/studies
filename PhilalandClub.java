
package studies;



import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;


public class PhilalandClub{
	public static long  gcount=0;
	public static HashMap<Integer, String> rec=new HashMap<Integer, String>();
	public static String  one="";
	public static void main(String[] srgs){

		Scanner in=new Scanner(System.in);

		int t=in.nextInt();

		long[] a=new long[t];

		long[] b=new long[t];

		long[] c=new long[t];

		long[] r=new long[t];

		for(int j=0;j<t;j++){

			a[j]=in.nextLong();

			b[j]=in.nextLong();

			c[j]=in.nextLong();

		}
		

		for(int j=0;j<t;j++){
			BigInteger count=new BigInteger("0");
			int start=1;
			int another=1;
			if((a[j]-c[j])<=c[j]){
				start=(int)(c[j]);
				another=(int)(a[j]-c[j]);
			}
			else{
				start=(int)(a[j]-c[j]);
				another=(int)(c[j]);
			}
			count=factorial(start,a[j]).divide(factorial(1, another));;
			BigInteger o=new BigInteger("2");
			for(long i=1L;i<=b[j];i++){
				o=o.multiply(new BigInteger("2"));
			}
			System.out.print(count.multiply(new BigInteger(o+"")));

		}

		in.close();

	}
	public static BigInteger factorial(int t,long n){
		BigInteger result=new BigInteger("1");
		for(long i=t;i<=n;i++){
			result=result.multiply(new BigInteger(i+""));
		}
		return result;
	}
}
