package replit.ooptask.carpetclass;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian = true;

    public Carpet(){

        totalPrice = 200;

    }

    public Carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputIsPersian){

        this.width = inputWidth;
        this.length = inputLength;
        this.unitPrice = inputUnitPrice;
        this.isPersian = inputIsPersian;

        totalPrice = (width + length) * unitPrice;

        if(isPersian){

            totalPrice += 200;
        }
    }

}
/*
The Carpet class has following public double instance variables: width, length, unitPrice, totalPrice and a public boolean variable isPersian that is true if carpet object is Persian and false if it is not.

Add following constructors:

1) No-Args constructor

sets default values for the Carpet object
Size is 300 x 300 and totalPrice for that is 200. And also it is not a Persian carpet. unitPrice is set as 0.
2) 4-Args Constructor:

accepts width, length, unitPrice, isPersian parameters and assigns values to public instance variables.
try to use this keyword
Set totalPrice as the width + length multiplied by the unitPrice.
if its a Persian carpet add 200 to totalPrice.
Example:

Carpet c = new Carpet();
System.out.println(c.totalPrice); // 200.0

Carpet c2 = new Carpet(20.0, 20.0 , 2.0 ,false);
System.out.println(c2.totalPrice); // 80.0
(  the calculation:(20+20)*2  )

Carpet c3 = new Carpet(20.0, 20.0 , 2.0 ,true);
System.out.println(c3.totalPrice); // 280.0
 */