import java.util.Scanner;
public class sstf {
	public  static void main(String args[])
	{
	int a[]=new int[100];
	int b[]=new int[100];
	int d,n,i,j;
	int temp,s,k=0,x=0,t=0;
	Scanner in=new Scanner(System.in);
	 System.out.println("Initial head movement");

	  a[0]=in.nextInt();
	 System.out.println("\nEnter number of processes:");
	 n=in.nextInt();
	 System.out.println("\nEnter processes in request order");
	 for(i=1;i<=n;i++)
	 {
	  a[i]=in.nextInt();
	  
	 }
	 b[k++]=a[0];
	 for(i=0;i<n;i++)
	 {
	  s=1000;
	  for(j=i+1;j<=n;j++)
	  {
	   if(a[i]>a[j])
	   d=a[i]-a[j];
	   else
	   d=a[j]-a[i];
	   if(d<s)
	   {
	    s=d;
	    x=j;
	   }
	  }
	  t+=s;
	  temp=a[i+1];
	  a[i+1]=a[x];
	  a[x]=temp;
	  b[k++]=a[i+1];
	 }
	 System.out.println("\nProcessing order:");
	 for(i=0;i<=n;i++)
	 System.out.println(b[i]);
	 System.out.println(t);
	}
}
