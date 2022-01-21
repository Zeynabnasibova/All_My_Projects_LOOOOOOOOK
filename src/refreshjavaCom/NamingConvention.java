package refreshjavaCom;

class NamingConvention {
    public static void main(String [] args) {
        byte $num1=20, _num2 = 10, num3$_ = 25;
        System.out.println("$num1 = "+ $num1 +", _num2 = "+ _num2 +", num3$_ = "+ num3$_);
        byte age=20, Age = 30, agE = 40;
        System.out.println("age = "+ age +", Age = "+ Age +", agE = "+ agE);
        int For = 15, If = 30, Byte = 50;
        System.out.println("For = "+ For +", If = "+ If +", Byte = "+ Byte);
        int bike_speed = 50;
        System.out.println("bike_speed = "+ bike_speed);
        int minSpeed = 10, maxSpeed = 80;
        System.out.println("minSpeed = "+ minSpeed +", maxSpeed = "+ maxSpeed);
    }
}