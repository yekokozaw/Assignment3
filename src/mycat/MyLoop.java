package mycat;
public class MyLoop {
	public  void  firstLoop(int x) {
		for(int i=0;i<x;i++) {
			int k=x-i;
			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		MyLoop obj=new MyLoop();
		obj.firstLoop(6);
	}
}
