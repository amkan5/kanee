package Step4;

public class Snail {
	public static void main(String[] args) {
	 int[][] mtx = new int[5][5];
	 int k=0, cnt=5,x=0,y=-1,num=1;
	 for(int i=0;i<5;i++) {
		 for(int j=0;j<cnt;j++) {
			 y += num;
			 mtx[x][y] = ++k;
		 }
		 cnt--; //4
		 for(int j=0;j<cnt;j++) {
			 x += num;
			 mtx[x][y] = ++k;
		 }
		 num *= -1;
	 }
	 for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.print(mtx[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
