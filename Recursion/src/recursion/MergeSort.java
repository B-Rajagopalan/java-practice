package recursion;
import java.util.Arrays;
//Pending ///wrong
public class MergeSort 
{
	public static void main(String[] args) 
	{
		int arr[] = {7,9,5,8,3,1,2};
		merge(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static void merge(int[] arr, int s, int e) 
	{
		if(e-s==1)
			return;
		
		int mid=s+(e-s)/2;
		
		//need to write in paper pen
		merge(arr,s,mid);
		merge(arr,mid,e);
		
		mergeBackend(arr,s,mid,e);
	}

	private static void mergeBackend(int[] arr, int s, int mid, int e) 
	{
		int mix[] = new int[e-s];
		
		int i=s;
		int j=mid;
		
		int k=0;
		
		while(i<mid && j<e)
		{
			if(arr[i]<arr[j]) 
			{
				mix[k]=arr[i];
				i++;
			}
			else
			{
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<mid)
		{
			mix[k]=arr[i];
			i++;
			k++;
		}
		
		while(j<e)
		{
			mix[k]=arr[j];
			j++;
			k++;
		}
		
		for(int l=0;l<mix.length;l++)
		{
			arr[s+l]=mix[l];
		}
	}
}


//if(r==0)
//return;
//
//if(c<r)
//{
//if(arr[c]>arr[c+1])
//{
//	int temp=arr[c];
//	arr[c]=arr[c+1];
//	arr[c+1]=temp;
//}
//
//merge(arr,r,c+1);
//
//if(arr[c+arr.length/2]>arr[c+arr.length/2+1])
//{
//	int temp=arr[c+arr.length/2];
//	arr[c+arr.length/2]=arr[c+arr.length/2+1];
//	arr[c+arr.length/2+1]=temp;
//}
//}
//else
//{
//merge(arr,r-1,0);
//}