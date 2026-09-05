package Coding02Array1D;

public class Multiply_By_10 {
	
	static int[] MultiplyByTen(int[] arr)
	{
		int n=arr.length;
		int newarr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			int ele=arr[i];
			int newele=ele*10;
			newarr[i]=newele;
		}
		return newarr;
	}
	

	public static void main(String[] args) {
		int arr[]= {4,5,7,8};
		int ans[]=MultiplyByTen(arr);
		for(int i:ans)
		{
			System.out.print(i+" ");
		}
	}
}
