package Coding02Array1D;

public class Positive_Negtive_Sum_In_Array {

	public static void main(String[] args) {
		int arr[]= {5,-7,9,3,-2};
		int ans[]=posNegSum(arr);
		System.out.println("Positive Sum "+ans[0]);
		System.out.println("Negative Sum "+ans[1]);
	}

	private static int[] posNegSum(int[] arr) {
		int posSum=0;
		int negSum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				posSum+=arr[i];
			}
			else
			{
				negSum+=arr[i];
			}
		}
		int ans[]={posSum,negSum};
		return ans;
	}
}
