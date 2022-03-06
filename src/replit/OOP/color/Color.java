package replit.OOP.color;

import java.util.Arrays;

/**
 * represents basic Color class example
 */
public class Color {
    //rgb array with 3 ints is used to hold r,g,b values
    private int[] rgb = new int[3];

    /**
     * Available colors - ready with rgb code
     */

    public final static int[] WHITE     = new int[]{255, 255, 255};
    public final static int[] LIGHT_GRAY = new int[]{192, 192, 192};
    public final static int[] GRAY      = new int[]{128, 128, 128};
    public final static int[] DARK_GRAY  = new int[]{64, 64, 64};
    public final static int[] BLACK     = new int[]{0, 0, 0};
    public final static int[] RED       = new int[]{255, 0, 0};
    public final static int[] PINK      = new int[]{255, 175, 175};
    public final static int[] ORANGE    = new int[]{255, 200, 0};
    public final static int[] YELLOW    = new int[]{255, 255, 0};
    public final static int[] GREEN     = new int[]{0, 255, 0};
    public final static int[] MAGENTA   = new int[]{255, 0, 255};
    public final static int[] CYAN      = new int[]{0, 255, 255};
    public final static int[] BLUE      = new int[]{0, 0, 255};


    /**
     * Public constructor accepts 3 ints that represent color code.
     * assign 3 int parameters to rgb array indexes(0,1,2)
     * @param r
     * @param g
     * @param b
     */
    public Color(int r, int g, int b){
        rgb[0]=0;
        rgb[1]=1;
        rgb[2]=2;
        //TODO
    }

    /**
     * Public no- args constructor: sets default color as "white" (255,255,255)
     * try to use this() keyword to call above constructor to set white color
     */
    public Color() {
        this(255,255,255);
        //TODO
    }

    /**
     * Override toString(from Object class).
     * Provides string description of the color like "red" ,"blue" based on
     * rgb value.
     * Compare value of rgb array with static color code arrays
     * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
     * to compare 2 int arrays
     *
     * @returns a String color name like
     * "white" or "blue"
     * If rgb values does not match any available combinations, return "n/a"
     * <p>
     * Ex:
     * Color color = new Color();
     * System.out.println(color.toString() ) ; // prints "white"
     * <p>
     * Color color = new Color(255, 0, 0);
     * System.out.println(color.toString() ) ; // prints "red"
     * <p>
     * Color color4 = new Color(192, 192, 192);
     * System.out.println(color4 ) ; // prints "light gray"
     */
    @Override
    public String toString() {
        return "Color{" +
                "rgb=" + Arrays.toString(rgb) +
                '}';
    }

}



