package Coding02Array1D;

public class Max_Num_In_Array {
	
	static int maxElement(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {45,69,78,32,12};
		int ans=maxElement(arr);
		System.out.println(ans);
	}
}
