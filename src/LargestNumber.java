
public class LargestNumber {
	public static void main(String[] args) {
		int ar[] = {3,90,45,43,67};
		int i;
		int max= ar[0];
		
		for(i=0;i<ar.length-1;i++)
		{
			if(ar[i]>max) 
			{
				max= ar[i];
			
			System.out.println("Largest number is : "  + max);	
			}
		}
	
	}
}
