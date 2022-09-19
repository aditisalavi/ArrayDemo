import java.util.Scanner;

public class Assending_Dessending {
	
     public static void main (String args []) {
    	 Scanner sc = new Scanner(System.in);
    	 int temporary, i,j;
    	 int[] num = {10,30,50,40,60};
    	// int num2;
    	 for(i=0;i<num.length;i++)
    	 {
    		 System.out.println(num[i]);
    	 }
		for(i=0;i<num.length;i++)
		{
			for(j=i;j<num.length;j++)
			{
				if(num[i]>num[j])
				{   temporary=num[i];
					num[i]=num[j];
					num[j]= temporary;
				}
			}
		}
    	 for(int n:num) {
    		 System.out.println(n);
    	 }
    	 }
}
