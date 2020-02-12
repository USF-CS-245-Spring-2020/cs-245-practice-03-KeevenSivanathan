public class BinaryRecursiveSearch implements Practice03Search
{

	public int search(int[] arr, int target)
	{
		return binSearch(arr,0, arr.length - 1,target); 
	}

	public int binSearch(int[] arr, int min,int max, int target)
	{
		
		if (max >= min)
		{
			int mid = min + (max - min) / 2; 
			
			if (arr[mid] == target)
			{
				return mid;
			}

			if (arr[mid] > target)
			{
				return binSearch(arr,min,mid-1,target);
			}

			return binSearch(arr,mid+1,max,target); 
		}

		return -1;
	}
}