public class MojaKlasa{
	public static String nazwa;
	public static int numer1;
	public static int numer2;

	public static void main(String[] args){
		numer1 = 68;
		numer2 = numer1 / 34 * 3;
		numer1 = foo(4, "String");
		System.out.println(bar());
		fun();
	}

	public static int foo(int i, String s){
		numer1 = 12 + (34 * 90) / i;
		nazwa = s;
		System.out.println(nazwa);
		System.out.println("Hello World");
		if(4 > 5){
			System.out.println("iftest");
			if(6 < 7){
			System.out.println("tak");
		}

		}else{
			numer2 = numer1 + (12 - 6);
			System.out.println(4);
		}

		return numer2 + numer1;
	}

	public static String bar(){
		if(4 > 5){
			System.out.println(4);
		}else if(5 > 4){
			System.out.println(5);
		}

		return "test 123";
	}

	public static void fun(){
		for(int i = 0; i < 5; ++i){
			System.out.println("Fun()");
		}

	}
}
