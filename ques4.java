package in.ineuron.main;

public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=17;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==n-1 || i-j>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 )  
					  
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}

}
