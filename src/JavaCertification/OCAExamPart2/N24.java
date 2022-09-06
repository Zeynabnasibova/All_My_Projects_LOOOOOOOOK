package JavaCertification.OCAExamPart2;

import java.util.ArrayList;
import java.util.List;

public class N24 {
    public static void main(String[] args) {
        ArrayList <String> colors = new ArrayList<>();

        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3,"cyan");

        System.out.println(colors);

        List<String> color = new ArrayList<>();

        color.add("green");
        color.add("red");
        color.add("blue");
        color.add("yellow");
        color.add(3,"cyan");

        System.out.println(color);
    }
}
