public class methodOverloading {
    public static void main(String[] args) {
        
        Greet g1 = new Greet();
        g1.greetings();
        g1.greetings("Karanpreet Singh  ");
    }
}


class Greet{

    void greetings(){
        System.out.println("Hello, Good Morning .......");
    }
    void greetings(String name){
        System.out.println("Hello " + name +" Good Morning......");
    }
}
