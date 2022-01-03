package muhtar.gitJavaFundamentals.Exceptions;

import java.util.HashSet;
import java.util.Set;

interface C{
    int anumber=9;
}

public class practices implements C {

    public static void main(String[] args) {

        Set<Integer> st=new HashSet<>();
        st.add(3);
        st.add(4);
        st.add(5);
        st.add(6);
        //st.forEach(each -> { System.out.println(each);});

//			for(int i=0; i< st.size(); i++) {
//				System.out.println();
//			}




    }

}