public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Karan";
        s1.rollno = 234;
        s1.password = "abcd";
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;

        Student s2 = new Student(s1);
        s2.password = "xyz";

        for (int i = 0 ; i < 3 ; i++)
        {
            System.out.println(s1.marks[i]);
        }

        System.out.println("Marks changed..........");

        s1.marks[0] = 100;
        s1.marks[1] = 200;
        s1.marks[2] = 20;

        for (int i = 0 ; i < 3 ; i++)
        {
            System.out.println(s2.marks[i]);
        }


    }

    static class Student{
        String name;
        int rollno;
        String password;
        int marks[];


        // Shallow copy constructor 
        // Student(Student s1){
        //     this.name = s1.name;
        //     this.rollno = s1.rollno;
        //     System.out.println("Copy constructor called");
        //     this.marks = s1.marks;
        // }



        // Deep Copy constructor 
        Student (Student s1)
        {
            marks = new int[3];
            this.name = s1.name;
            this.rollno = s1.rollno;
            for (int i = 0 ; i < marks.length  ;i++)
            {
                this.marks[i] = s1.marks[i];
            }
        }














        Student(){
            System.out.println("Constructor Called......");
            marks = new int[3];
        }


    }
}
