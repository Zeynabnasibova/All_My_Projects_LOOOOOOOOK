package replit.methodsWithReturn;

public class HamletLogic {

public static boolean hamletQuote(boolean bl1, boolean bl2){

    if(bl1 == true && bl2 == true){
        return true;
    }else if(bl1 == true || bl2 == true){
        return true;
    }else{
        return false;
    }
}

}

/*
The famous quote is "to be or not to be" is a classic example of boolean logic.

the hamletQuote method only returns true if one or both of the boolean parameters is true.

Examples:

hamletQuote(true, false)

returns true

hamletQuote(false,true)

returns true

hamletQuote(true,true)

returns true

hamletQuote(false,false)

returns false

hint: use the truth table for this one, this can be done with one if and a logical operator.
 */