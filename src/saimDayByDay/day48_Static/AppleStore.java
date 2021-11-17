package saimDayByDay.day48_Static;

public class AppleStore {

    public static void main(String[] args) {

        IPhone phone1 = new IPhone("10", 1000);

        IPhone phone2 = new IPhone("11", "Black", 1300, 128);

        System.out.println(phone1);
        System.out.println(phone2);

        System.out.println(IPhone.brand);
        System.out.println(IPhone.OS);


    }
}
