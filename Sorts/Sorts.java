package Sorts;
import java.util.*;
public class Sorts 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[] =new int[n];

	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Bubble Sort is:");
	int arr1[]=bubbleSort(arr);
	for(int i=0;i<arr1.length;i++)
	{
		System.out.print(arr1[i]+ " ");
	}
	System.out.println();
	System.out.println("Selection Sort is:");
	int arr2[] =selectionSort(arr);
	for(int i=0;i<arr2.length;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	System.out.println("Insertion Sort is:");
	int arr3[]=insertionSort(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr3[i]+" ");
	}
	System.out.println();
	System.out.println("Quick Sort is");
	int arr4[]=quickSort(arr);
	for(int i=0;i<arr4.length;i++)
	{
		System.out.print(arr4[i]+" ");
	}
}
	public static int[] bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] insertionSort(int[] arr)
	{
		for(int j=1;j<arr.length;j++)
		{
			int value=arr[j];
			int index=j;
			while(index>0 && arr[index-1]>value)
			{
				arr[index-1]=arr[index];
				index--;
			}
			arr[index]=value;
		}
		return arr;
	}
	public static int[] quickSort(int[] arr)
	{
		return quickSort(arr,0,arr.length-1);
	}
	public static int[] quickSort(int[] arr, int first,int last)
	{
		if(first<last)
		{
			int pindex=partition(arr,first,last);
			quickSort(arr,first,pindex-1);
			quickSort(arr,pindex+1,last);
		}	
		return arr;
	}
	public static int partition(int[] arr,int first,int last)
	{
		int index=first;
		int pivot=arr[last];
		for(int i=first;i<last;i++)
		{
			if(arr[i]<pivot)
			{
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		int value=arr[index];
		arr[index]=arr[last];
		arr[last]=value;
		return  index;
	}
}

