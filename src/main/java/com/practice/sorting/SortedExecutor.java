package com.practice.sorting;

import java.util.Arrays;

public class SortedExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {24,12,0,4,1,25,3,4};
		System.out.println("...........Calling Bubble sort........");
		System.out.print(Arrays.toString(arr));
		System.out.println("\n\n");
		bubblesort(arr,arr.length);
		System.out.println("Time complexity : O(n^2)");
		System.out.println("Space complexity : O(1)");

		System.out.println("...........Calling Selection sort........");
		int arr1[]= {24,12,0,4,1,25,3,4};
		System.out.print(Arrays.toString(arr1));
		System.out.println("\n\n");
		selectionsort(arr1,arr1.length);
		System.out.println("Time complexity : O(n^2)");
		System.out.println("Space complexity : O(1)");

		System.out.println("\n");
		System.out.println("...........Calling Insertion sort with for/for loop........");
		int arr2[]= {13,46,24,52,19,9};
		System.out.print(Arrays.toString(arr2));
		System.out.println("\n\n");
		insertionsort(arr2,arr2.length);
		System.out.println("Time complexity : O(n^2)");
		System.out.println("Space complexity : O(1)");

		System.out.println("\n");
		System.out.println("...........Calling Insertion sort with for/while loop........");
		int arr3[]= {13,46,24,52,19,9};
		System.out.print(Arrays.toString(arr3));
		System.out.println("\n\n");
		insertionsortwithwhileloop(arr3,arr3.length);
		System.out.println("Time complexity : O(n^2)");
		System.out.println("Space complexity : O(1)");

		System.out.println("\n");
		System.out.println("...........Calling merge sort with for/while loop........");
		int arr4[]= {13,46,24,52,19,9,24,88};
		System.out.print(Arrays.toString(arr4));
		System.out.println("\n\n");
		mainmergesort(arr4,arr4.length);
		System.out.println("...........Printing Merge sort........");
		printsortarray(arr4);
		System.out.println("Time complexity : O(nlogn)");
		System.out.println("Space complexity : O(n)");


		System.out.println("\n");
		System.out.println("...........Calling Quick sort with for/while loop........");
		int arr5[]= {13,46,24,52,19,9,24,88};
		System.out.print(Arrays.toString(arr4));
		System.out.println("\n\n");
		mainquicksort(arr5,arr5.length);
	}	

	private static void mainquicksort(int[] arr5, int n) {

		quicksort(arr5,0,n-1);
		System.out.println("...........Printing Quick sort........");
		printsortarray(arr5);
		System.out.println("Time complexity Best Case: O(nlogn)");
		System.out.println("Space complexity : O(n)");
		System.out.println("Time complexity Worst Case: O(n^2)");
		System.out.println("Space complexity : O(n)");
	
	}

	private static void quicksort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high)
		{
			int pivot=partition(arr,low,high);
			quicksort(arr,low,pivot-1);
			quicksort(arr, pivot+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int piv=arr[low];
		int i=low;
		int j=high;
				
		while(i<j)
		{
			while(arr[i]<=piv && i<=high-1)
			{
				i++;
			}
			while(arr[j]>piv && j>=low)
			{
				j--;
			}

			if(i<j)
			{
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}

		int t=arr[j];
		arr[j]=arr[low];
		arr[low]=t;
		return j;
	}

	private static void mainmergesort(int[] arr, int n) {
		// TODO Auto-generated method stub
		mergesort(arr,0,n-1);
	}

	private static void mergesort(int[] arr, int l, int r) {

		if(l<r)
		{
			int mid=(l+r)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}

	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int i=l;
		int j=mid+1;
		int t=l;
		int sortedarr[]=new int[1000];

		//function for compare the two array and store the value
		while(i<=mid && j<=r)
		{
			if(arr[i]<arr[j])
			{
				sortedarr[t]=arr[i];
				i++;
			}
			else
			{
				sortedarr[t]=arr[j];
				j++;
			}
			t++;
		}

		//fill the left over Rightarray 
		if(i>mid)
		{
			while(j<=r)
			{
				sortedarr[t]=arr[j];
				j++;
				t++;
			}
		}
		else
		{
			//fill the left over leftarray
			while(i<=mid)
			{
				sortedarr[t]=arr[i];
				i++;
				t++;
			}
		}
		// transfering all elements from temporary to arr //
		System.out.println("check");
		for (t = l; t <= r; t++) {
			arr[t] = sortedarr[t];
		}
	}

	private static void insertionsortwithwhileloop(int[] arr, int n) {

		for(int i=1;i<n;i++)
		{
			int curr=arr[i];
			int j=i-1;
			while(j>=0 && curr<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
			System.out.println("...........Printing Insertion sort........");
			printsortarray(arr);
		}
	}

	private static void insertionsort(int[] arr, int n) {

		for(int i=1;i<n;i++)
		{
			int val=arr[i];
			for(int j=i-1;j>=0;j--)
			{
				if(val<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("...........Printing Insertion sort........");
			printsortarray(arr);
		}

	}

	private static void selectionsort(int[] arr, int n) {
		for(int i=0;i<n;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			System.out.println("...........Printing Selection sort........");
			printsortarray(arr);
		}
	}

	private static void bubblesort(int[] arr, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("...........Printing Bubble sort........");
		printsortarray(arr);
	}

	private static void printsortarray(int arr[])
	{
		System.out.print(Arrays.toString(arr));
		System.out.println();
	}

}
