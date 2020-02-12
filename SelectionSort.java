public class SelectionSort implements Practice03Sort
{
	public void sort(int[] a)
	{
		int n = a.length; 

		for(int i = 0; i < n-1; i++)
		{
			int minIndex = i; 

			for(int j = i+1; j < n; j++)
			{
				if(a[j] < a[minIndex])
				{
					minIndex = j; 
				}
			}

			int temp = a[minIndex]; 
			a[minIndex] = a[i]; 
			a[i] = temp; 
		}
	}
}