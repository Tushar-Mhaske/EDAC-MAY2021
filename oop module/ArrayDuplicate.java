
public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 1, 2, 3, 3, 5,7,9,10,88,17,99,99 };
		System.out.println("Search the duplicate");
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i] == arr[j])

					System.out.println(arr[j]);

			}
		}
	}
}
