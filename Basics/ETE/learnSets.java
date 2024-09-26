import java.util.*;
public class learnSets {
    public static void main(String[] args) {
        
        Set<Student> set = new HashSet<>();

        set.add(new Student(1,"Karan"));
        set.add(new Student(1,"Karan"));
        set.add(new Student(1,"Karan"));

        System.out.println(set);




        // Set<Integer> set = new HashSet<>();

        // set.add(10);
        // set.add(20);
        // set.add(300);
        // set.add(40);
        // set.add(50);
        // set.add(160);

        // System.err.println(set);

    }

    static class Student {
        int rollno;
        String name;

        public Student(int rollno , String name){
            this.rollno = rollno;
            this.name = name;
        }
        

        public String toString(){
            return "Student{" + 
                    "rollno=" + rollno+
                    ",name='" + name +'\''+
                    '}';
        }
    }

}
