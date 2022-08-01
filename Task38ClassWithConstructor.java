import java.util.*;
class A
{
    private String name;
    private byte age;
    private String mob_no;
    Scanner sc = new Scanner(System.in);
    public A(String n, byte a, String m)
    {
        System.out.println("Parent Class Constructor Called");
        name = n;
        age = a;
        mob_no = m;
    }
    public String getName()
    {
        return name;
    }
    public byte getAge()
    {
        return age;
    }
    public String getMob_no()
    {
        return mob_no;
    }
}
class B extends A
{

    private String address;
    private int rollno;
    Scanner sc = new Scanner(System.in);
    public B(String n,byte m,String a,String add,int r)
    {
        super(n,m,a);
        System.out.println("Child Class Constructor called");
        address = add;
        rollno = r;
    }
    public String getAddress()
    {
        return address;
    }
    public int getRollno()
    {
        return rollno;
    }
}
class C extends B
{
    public C(String q,byte w,String e,String u,int i)
    {
        super(q,w,e,u,i);
        System.out.println("Demonstration of the Constructor Calling");
    }
}
public class Task38ClassWithConstructor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name \nEnter Your Age \nEnter your Mobile Number \nEnter Your Address \nRollno.");
        C s1 = new C(sc.next(), sc.nextByte(), sc.next(), sc.next(), sc.nextInt());
        System.out.println("Following are the details: ");
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
        System.out.println("Mobile no.: "+s1.getMob_no());
        System.out.println("Address: "+s1.getAddress());
        System.out.println("Rollno. "+s1.getRollno());
    }
}