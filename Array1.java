
import java.util.*;

class Araay1 {


	static int shortsub(int arr[], int a) {

		int minlength = Integer.MAX_VALUE;

		int left = 0;
		int right = a - 1;

		while (left < right && arr[left + 1] >= arr[left]) {
			left++;
		}

		if (left == a - 1)
			return 0;


		while (right > left && arr[right - 1] <= arr[right]) {
			right--;
		}


		minlength = Math.min(a - left - 1, right);


		int j = right;

		for (int i = 0; i < left + 1; i++) {
			if (arr[i] <= arr[j]) {
				
				minlength = Math.min(minlength, j - i - 1);
			} else if (j < a - 1) {
				j++;
			} else {
				break;
			}
		}


		return minlength;
	}


	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store in array: ");  
	  
		n=sc.nextInt();  
		 
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{  
		  
		array[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: ");  
		
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]);  
		}  
		 
		System.out.print(("This is the length of shortest subarray "+shortsub(array, n)));
	}
}
