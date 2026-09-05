package Coding02Array1D;

public class Average_Of_Array {
	
	static double getAverageOfArray(int[] arr)
	{
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int ele=arr[i];

			sum=sum+ele;		
		}
		double avg=sum/n;
			
			
		return avg;
	}
	
	
	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5};
		 double ans=getAverageOfArray(arr);
		 System.out.println(ans);
	}

}
