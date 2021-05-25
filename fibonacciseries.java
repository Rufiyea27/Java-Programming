import java.util.*;
public class fibonacciseries
{
	int c,i,j=1,next;
	void fib(int n)
	{
	if(n>0)
	{
	    if(c<=1)
	      next=c;
	    else
	    {
		next=i+j;
		i=j;
		j=next;
	    }
	    System.out.print(next+" ");
	    c++;
	    fib(--n);
	}
	
}
	public static void main(String[] args)
	{
	Scanner a=new Scanner(System.in);
	System.out.println("Enter number of terms");
	int num=a.nextInt();

	fibonacciseries f=new fibonacciseries();
	System.out.println("Fibonacci series is ");
	f.fib(num);
	}
}