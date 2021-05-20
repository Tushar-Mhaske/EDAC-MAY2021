
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] { 1, 78, 98, 9, 44 };
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
			
		}
		System.out.println("This is min array" + min);
	}
	
}
		