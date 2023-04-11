package TestingPrograms;

abstract class A {
    {
        System.out.println("This is first abstract Class");
    }
}
abstract class B extends A {
    {
        System.out.println("This is second abstract Class");
    }
}
class C extends B {
    {
        System.out.println("This is third abstract Class");
        System.out.println(456);
    }
}
class perform{
    public static void main(String[] args) {
        C c = new C();
    }
}
