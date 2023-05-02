package automation_30Aprl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//holds unique elements
//no final size
//no index
//no order set
public class Set_In_JAva {

    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        System.out.println(s.size());
        s.add("ABC");
        s.add("DEf");
        s.add("GHI");
        s.add("ABC");

        System.out.println(s.size());

       // Iterator<String>
    }
}
