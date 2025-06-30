package weekTwo;

public class AlgebraicExpression {

	public static void main(String[] args) {

		
		final int x = 2;
		final int a = 3;
		
		System.out.println("Evaluating \"y = ax3 + 7\" where x == 2 and a ==3");
		System.out.println("y = a * x * x * x + 7 sets y to\t\t:" +  a * x * x * x + 7);
		System.out.println("y = a * x * x * (x + 7) sets y to\t:" +  a * x * x * (x + 7));
		System.out.println("y = (a * x) * x * (x + 7) sets y to\t:" +  (a * x) * x * (x + 7));
		System.out.println("y = (a * x) * x * x + 7 sets y to\t:" +  (a * x) * x * x + 7);
		System.out.println("y = a *( x * x * x) + 7 sets y to\t:" +  a * (x * x * x) + 7);
		System.out.println("y = a * x *( x * x + 7) sets y to\t:" +  a * x * (x * x + 7));
		System.out.println("y = a * x^3 + 7 sets y to\t\t:" +  a * Math.pow(x,3) + 7);		
	}

}
