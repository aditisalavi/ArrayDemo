import java.util.Arrays;

public class SortArray {
	
	public static void assendingorder()
	{
		int temporary,i,j;
		int[] num = {10,70,40,30,60};
		for(i=0;i<num.length;i++)
		{
			for(j=i;j<num.length;j++)
			{
				if(num[i] > num[j])
				{
					temporary=num[i];
					num[i]=num[j];
					num[j]=temporary;
				}
			}
		}
		System.out.println("assending order is an below");
		for(int n :num)
		{
			System.out.println("\t " +n);
		}
	}
		public static void dessendingorder()
		{
			int temporary,i,j;
			int[] num = {10,70,40,30,60};
			for(i=0;i<num.length;i++)
			{
				for(j=i;j<num.length;j++)
				{
					if(num[i] > num[j])
					{
						temporary=num[i];
						num[i]=num[j];
						num[j]=temporary;
					}
				}
			}
			System.out.println("dessending order is an below");
			for(i = num.length-1;i>=0;i--)
			{
				System.out.println("\t " +num[i]);
			}
		}	
   public static void main(String args[])
   {
	   assendingorder();
	   dessendingorder();
   }
	

}
