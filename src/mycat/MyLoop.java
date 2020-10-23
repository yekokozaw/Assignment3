package mycat;
public class MyLoop {
	public static void  firstLoop(int x) {
		for(int i=0;i<x;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int number=6;
		firstLoop(number);
	}
}
