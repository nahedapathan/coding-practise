package Coding02Array1D;

public class Search_Element_In_Array {
	
	static boolean findTarget(int[] arr,int tar)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==tar)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {7,9,5,6,2};
		boolean ans=findTarget(arr,6);
		System.out.println(ans);
	}
}
