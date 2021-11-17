package saimDayByDay.day45_Constructors;

public class Carpet {


    /*
    info:
        width, length, unit price, if its persian, total price
    */


    double width;
    double length;
    double unitPrice;
    double totalPrice;
    boolean isPersian;

    /*
    constructor:
        initialize the variables - 4
        calculate the total price:
            w * l * unit price
           if its persian add 200$
    */


    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){

        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputIsPersian;

        totalPrice = width * length * unitPrice;

        if(isPersian){
            totalPrice += 200;
        }

    }

    /*
    toString to print all the information
     */

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
