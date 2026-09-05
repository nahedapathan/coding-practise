package Coding02Array1D;

public class Zero_One_Count {
	
	static int[] getZeroOneCount(int arr[])
	{
		int zeroCount=0;
		int oneCount=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				zeroCount++;
			}
			else if(arr[i]==1)
			{
				oneCount++;				
			}
		}
		int ans[]= {zeroCount,oneCount};
		return ans;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,0,5,1,0,2,7,0};
		int ans[]=getZeroOneCount(arr);
		System.out.println("zero count :"+ans[0]);
		System.out.println("One Count :"+ans[1]);
	}

}
