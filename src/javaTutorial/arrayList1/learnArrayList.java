package javaTutorial.arrayList1;

import java.util.ArrayList;
import java.util.Arrays;

public class learnArrayList {

    public static void main(String[] args) {
        /* Array Declaration and initialization*/
        String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

        /*Array to ArrayList conversion*/
        ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));


            System.out.println(citylist);

        }
    }

