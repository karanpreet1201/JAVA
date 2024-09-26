public class Inheritance {
    public static void main(String[] args) {








        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);



        
        // Fish shark = new Fish();
        // shark.eat();


        
    }


    // BASE CLASS
    static class Animal{
        String color;

        void eat(){
            System.out.println("Eats");
        }

        void breathe(){
            System.out.println("Breaths");
        }
    }


    // DERIVED CLASS 
    static class Mammals extends Animal{
        void walk(){
            System.out.println("Walk");
        }
    }

    static class Fish extends Animal{
        void swim(){
            System.out.println("Swim");
        }
    }

    
    static class Bird extends Animal{
        void fly(){
            System.out.println("FLy");
        }
    }




    // static class Dog extends Mammals{
    //     String breed;
    // }

    


    // // DERIVED CLASS
    // static class Fish extends Animal{
    //     int fins;

    //     void swim(){
    //         System.out.println("Swims in water..");
    //     }



    // }
}
