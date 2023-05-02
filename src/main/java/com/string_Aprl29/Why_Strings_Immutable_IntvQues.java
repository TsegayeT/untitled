package com.string_Aprl29;

//Strings are immutable meaning they cant change once the object is created
//Immutability only for String object not other objects
//So if you try to change a String Object it will not change it but will create another Object
public class Why_Strings_Immutable_IntvQues {

    public static void main(String[] args) {
        String A0 =new String("Apple");
        A0.concat("Macbook"); //The method is to concat Macbook to Apple to show AppleMAcbook but since you cant
                                 //change a String it wont change to that but will create another object named AppleMacbook
                                // and  will be in HeapMemory but not SLP/SCP

        A0 = A0.concat("iPhone"); //changing the reference to a new Object and modifying so it change to "AppleiPhone"

        //The reason Strings are immutable is because if you have a bunch of different references that point to ab 1 object and
        //you decide to change one of the references and the object it points to

        //Ex: if someone wants to change email or password in registration you dont want to change the object for everyone
        // just for the person you change the object

    }
}
