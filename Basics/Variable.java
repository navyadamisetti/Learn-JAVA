public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=15;
		int c=a+b;
		System.out.println(c);  //add 2 numbers
		
		float f=c;
		System.out.println(f);  //widening
		
		int tointeger= (int)f;
		System.out.println(tointeger);  //Typecasting		
	}

}
