package recursion;

public class Digit {
	static int c = 0;
	public static int digit(int n) {
		if (n > 0) {
			c++;
			return digit(n / 10);
		}
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter the number ");
		n=sc.nextInt();
		System.out.println(digit(n));

	}

}
