import java.util.Arrays;

public class DessendingArray {

	public static void main(String[] args) {
		int temporary, i, j;
		int[] num = { 10, 70, 40, 50, 39 };
		// int num2;

		for (i = 0; i < num.length; i++) {
			for (j = i; j < num.length; j++) {
				if (num[i] > num[j]) {
					temporary = num[i];
					num[i] = num[j];
					num[j] = temporary;

				}
			}

		}
		System.out.println("Dessending order is below");
		for (i = num.length - 1; i >= 0; i--) {
			System.out.println("\t " + num[i]);
		}

	}
}
