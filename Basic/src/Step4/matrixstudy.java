package Step4;
 // 유형1
public class matrixstudy {
	public static void main(String[] args) {
		int[][] mtx = new int[5][5];
		int k=0;
		for (int i=0;i<5;i++) {
			for (int j=0;j<=i;j++) {
				k++;
				mtx[i][j] = k;
			}
		}
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				System.out.print(mtx[i][j] + " " );
			}
			System.out.println("");
		}
			}
	}

