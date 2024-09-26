public class oopsApnacollege {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());


        BankAccount myAcc = new BankAccount();
        myAcc.userName = "karanpreetsingh";
        myAcc.setPasword("karanhunny");
        System.out.println(myAcc.password);
        System.out.println(myAcc.userName);


    }


    static class Pen{
        private String color;
        private int tip;


        // GETTERS
        String getColor() {
            return this.color;
        }
        int getTip() {
            return this.tip;
        }

        // SETTERS

        void setColor(String color){
            this.color = color;
        }
        void setTip(int tip){
            this.tip = tip;
        }
    }


    


    static class BankAccount{
        public String userName;
        private String password;
        public void setPasword(String pass){
            this.password = pass;
        }
    }
}
