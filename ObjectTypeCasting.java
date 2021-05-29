class A{
  void m1(){ System.out.println("A");}
}
class B extends A{
  void m1(){ System.out.println("B");}
}
class C extends B{
  void m1(){System.out .println("c");}
}
public class Main
{
	public static void main(String[] args) {
	 C c = new C();
	 c.m1();
    B b = (B)c;
    b.m1();
    A a = (A) b;
    a.m1();
    
    
	// ((B)c).m1();
  //   ((A)(B)c).m1();
	 // This all print C because all having the object referance of C.
	}
}
