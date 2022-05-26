package project5;

public class Main4 {

	public static void main(String[] args) {
		int[][] f = new int[3][10];
		for (int i = 0; i < 2; i++) {
		    for (int j = 0; j < 10; j++) {
		        f[i][j] = (int) (Math.random()* 10);
		        System.out.print(f[i][j] + " ");
		        f[2][j] = f[0][j] + f[1][j];
		    }
		    System.out.println();
		}
		for (int k = 0; k < 10 ; k++) {
		    System.out.print(f[2][k] + " ");
		}
	}

}	
