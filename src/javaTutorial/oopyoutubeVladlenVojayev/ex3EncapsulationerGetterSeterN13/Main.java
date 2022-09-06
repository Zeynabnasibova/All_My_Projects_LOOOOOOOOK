package javaTutorial.oopyoutubeVladlenVojayev.ex3EncapsulationerGetterSeterN13;

public class Main {
    public static void main(String[] args) {

        Hotel preston = new Hotel(20);
        System.out.println(preston.getRooms());
        preston.setRooms(6);
        System.out.println(preston.getRooms());
        preston.setRooms(30);

//        preston.rooms -= 60;
//        System.out.println(preston.rooms);
//
//
    }
}
