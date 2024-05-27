package chapter02;

public class 하고싶은거 {
	public static void main(String[] args) {
		int x=100;
		int y=2;
		int a=x+y*y;
		System.out.println(a);
		
		int b = a;
		int c = x*y-y;
		a = c;
//		int b = c;
		System.out.println(a);
//		System.out.println(a+y);
//		System.out.println(a+y);
		for (int i=100; i<=50; i--)
			y = 100 + i;
		System.out.println(y);
		
	}

}
