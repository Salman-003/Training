
public class LoopingFor {

	public static void main(String[] args) {
		int[] numbers = {5,10,15,20};
		//for each loop
		for(int i : numbers) {
			System.out.println(i);
		}
		
		//2D array with for loop
		int[][] arr = {{5,10,13}, {3,6,9}};
		arr[0][2] = 15;
		for(int i = 0;i < arr.length;i++) {
			for(int j = 0;j < arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
