class A
{
    void print()
    {
        System.out.println("We are in the superclass");
    }
}
class B extends A
{
    void prints()
    {
         System.out.println("We are in the subclass of A");
    }
}
class C extends B
{
    void printc()
    {
        System.out.println("We are in the subclass of B");
    }
}
class Inheri
{
    public static void main(String args[])
    {
            B obj = new B();
            C obj1 = new C(); //creating objects  of class C
            obj.print();
            obj.prints();
            // obj1.print();  We can simply access the grand-parent content if it is public or protected 
    }
}


// In this code we simply learn about the concept of inheritance.here A is the parent class and B is the child class
/*This is a pure example of single inheritance and we will learn more this than this*/

