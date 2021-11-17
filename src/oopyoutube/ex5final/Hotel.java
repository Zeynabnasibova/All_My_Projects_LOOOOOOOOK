package oopyoutube.ex5final;

public class Hotel {

    private int rooms;//default, instance variable

    static int a = 5;

    final static int STAR = 3;

    Hotel(int inputrooms) {

        this.rooms = inputrooms;
    }

    int getRooms() {

        return rooms;

    }

    void setRooms(int inputrooms) {

        if (inputrooms < this.rooms) {

            this.rooms -= inputrooms;

        } else {

            System.out.println("Not inf rooms");
        }

    }
}
