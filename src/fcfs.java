import java.util.Scanner;


public class fcfs {
	public  static void main(String args[])
	{
		System.out.println("Enter the number of Process");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,j,k=0,hm=0,sum=0;
		int input[]=new int[100];
		System.out.println("Give input values");
		input[0]=0;
		for(i=1;i<=n;i++)
		{
			input[i]=in.nextInt();
		}
		System.out.println("Initial head movement");
		int h=in.nextInt();
		/*for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				if(input[j]>input[j+1])
				{
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}*/
		for(i=1;i<=n;i++)
		{
			//System.out.println(input[i]);
			hm=h-input[i];
			h=input[i];
			sum=sum+Math.abs(hm);
		}
		/*for(i=0;i<=n;i++)
		{
			if(h>=input[i])
			{
				k=i+1;
			}
		}*/
		/*for(i=k-1;i>=1;i--)
		{
			System.out.println(input[i]);
		}
		for(i=k;i<=n;i++)
		{
			System.out.println(input[i]);
		}*/
		System.out.println(sum);

		
	}


}
