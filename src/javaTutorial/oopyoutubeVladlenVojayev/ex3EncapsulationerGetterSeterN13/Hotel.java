package javaTutorial.oopyoutubeVladlenVojayev.ex3EncapsulationerGetterSeterN13;

public class Hotel {


    private int rooms;//default, instance variable

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

            System.out.println("Not have rooms");
        }

    }
}