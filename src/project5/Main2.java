package project5;

public class Main2 {

	public static void main(String[] args) {
		int array[] = new int[20];
		for (int i = 0; i < 20; i++) {
		array[i] = (int) Math.round(Math.random() * 9);
		System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				array[i]=0;
			}
			System.out.print(array[i] + " ");
		}
	}

}
