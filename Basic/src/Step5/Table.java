package Step5;

public class Table {
	public static void main(String[] args) {
		int[][] mtx = new int[30][30];
		for (int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				mtx[j][i] = (j)*(i);
			}
		}
		for (int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.print(j+"x"+i+"="+mtx[i][j] + "\t");
			}
			System.out.println();
		}
		/*for (int i=1;i<10;i++) {
			for(int j=6;j<10;j++) {
				System.out.print(j+"x"+i+"="+mtx[i][j] + "\t");
			}
			System.out.println();
		}*/
	}
}
