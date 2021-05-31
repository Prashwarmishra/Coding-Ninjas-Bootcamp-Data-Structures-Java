package hashMap;

import java.util.*;

//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; 
//An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other 
//words, when there is a common value that exists in both the arrays/lists.

public class PrintIntersection {
	public static void intersection(int[] arr1, int[] arr2) {
	    HashMap<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<arr1.length; i++) {
	    	int key = arr1[i];
	    	if(map.containsKey(key)) {
	    		int val = map.get(key);
	    		map.put(key, val+1);
	    		continue;
	    	}
	    	map.put(key, 1);
	    }
	    quickSort(arr2, 0, arr2.length-1);
	    
	    for(int i=0; i<arr2.length; i++) {
	    	int key = arr2[i];
	    	if(map.containsKey(key)) {
	    		int value = map.get(key);
	    		if(value > 0) {
	    			System.out.print(key+" ");
	    			map.put(key, value-1);
	    		}else {
	    			map.remove(key);
	    		}
	    	}
	    }    
	}
	public static void quickSort(int[] arr, int s, int e) {
		if(s >= e) {
			return;
		}
		int pivot = arr[s];
		int count = 0;
		for(int i=s+1; i<=e; i++) {
			if(arr[i] < pivot) {
				count++;
			}
		}
		arr[s] = arr[s+count];
		arr[s+count] = pivot;
		int i=s, j=e;
		while(i<j) {
			if(arr[i] < pivot) {
				i++;
			}else if(arr[j] >= pivot) {
				j--;
			}else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;j--;
			}
		}
		quickSort(arr, s, s+count-1);
		quickSort(arr, s+count+1, e);
	}
}
