public class oops {
    public static void main(String[] args) {
        // Dog d1 = new Dog();
        // d1.name = "Tommy";
        // d1.bark();

        // Dog d2 = new Dog();
        // d2.name = "Leo";
        // d2.walk();
        
        Complex c = new Complex();
        c.a = 3;
        c.b = 5;
        c.ComplexInfo();

    }
}


class Complex{
    int a ;
    int b;

    void ComplexInfo(){
        System.out.println(a + " + " + b + "i");
    }
}


class Dog {
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name + " is walking...");
    }
    void bark(){
        System.out.println(name + " is barking on Someone.....");
    }

}


