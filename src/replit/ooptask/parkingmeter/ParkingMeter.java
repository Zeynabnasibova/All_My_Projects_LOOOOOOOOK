package replit.ooptask.parkingmeter;

public class ParkingMeter {

    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int intMaxTime){

        this.maxTime = intMaxTime;

    }
public boolean add(int par){

        if(par == 25){

            timeLeft += 30;
            return true;
        }else{

            timeLeft = timeLeft;
            return false;
        }

}
public void tick(){

        if (timeLeft > 1){

            timeLeft += 1;
        }
}

public boolean isExpired(){

        if(timeLeft == 0){

            return true;
        }else{

            return false;
        }
}


}
/*
The ParkingMeter class has the following:

Two instance variables named timeLeft and maxTime of type int. The value of timeLeft should be initialized to 0.

A constructor accepting a single integer parameter whose value is used to initialize the maxTime instance variable.

A method named add() that accepts an integer parameter.

If the value of the parameter is equal to 25, the value of timeLeft is increased by 30; otherwise no increase is performed. Furthermore, the increase occurs only if the value of timeLeft will not exceed the value of maxTime. add returns a boolean value: true if timeLeft was increase, false otherwise.
A method named tick() that accepts no parameters and returns no value. tick() decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.

A method named isExpired() that accepts no parameters. isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
 */