// Given an array of integers. Find the pair in an array that has a minimum XOR value. 
// Input : arr[] =  {9, 5, 3}
// Output : 6
//         All pair with xor value (9 ^ 5) => 12, 
//         (5 ^ 3) => 6, (9 ^ 3) => 10.
//         Minimum XOR value is 6


class MinimumXorValue {

	static int minXOR(int arr[], int n) {
		int min_xor = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				min_xor = Math.min(min_xor, arr[i] ^ arr[j]);

		return min_xor;
	}

	public static void main(String args[]) {
		int arr[] = { 9, 5, 3 };
		int n = arr.length;
		System.out.println(minXOR(arr, n));
	}
}
