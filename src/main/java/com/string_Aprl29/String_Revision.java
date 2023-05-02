package com.string_Aprl29;

    //String is a Class
    //STring Objects can be directly created
    //String Constant/Literal Pool
    //String, String Buffer, StringBuilder have a lot of methods
    //Immutability Concept of String Objects
    //Final concept of String Classes
    //Difference b/w == operator and .equals() method
    //Why saving passwordsis better in Char Array rather than STrings
    //String Operations

    //Learn Strings and Array in depth
    //Interview Question:
            // How to reverse a string?
            //Max occurring character in  a String

    //Memory Locations
            //Heap Memory   - String Constant/Literal Pool (SCP/SLP)
            //Stack Memory
            //PC Register
            //Method Area
            //Native Method Area
public class String_Revision {
        public static void main(String[] args) {
            String S0 = new String(); //1 Object created: 1 in Heap
            String S1 = new String("Selenium"); // 2 Objects created: 1 in  Heap Memory and 1 in SCP/SLP
            String S2 = "Java"; //1 object created in SCP/SLP but not Heap
            String S3 = "Java"; //0 objects created because already creates in S2
        }
}
