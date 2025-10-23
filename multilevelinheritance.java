import java.util.*;
class A
{
	static Scanner sc = new Scanner(System.in);
	static int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m2(String s)
	{
		System.out.println(s);
		return sc.nextFloat();
	}
}
class B extends A
{
	
	String m3(int n)
	{
		System.out.println(n);
		return sc.next();
	}
}
class C extends A
{
	long m4(double d)
	{
		System.out.println(d);
		return sc.nextLong();
	}
}
class D
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(A.m1(sc.nextFloat()));
		A obj = new A();
		System.out.println(obj.m2(sc.next()));
		B obj1 = new B();
		System.out.println(obj1.m3(sc.nextInt()));
		C obj2 = new C();
		System.out.println(obj2.m4(sc.nextDouble()));
	}
}
		
	