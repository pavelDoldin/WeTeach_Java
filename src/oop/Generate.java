package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;



public class Generate {




    public static Generate generateDecoding(){

        Random random = new Random();


        Abstraction abstraction = new Abstraction();
        Encapsulation encapsulation = new Encapsulation();
        Inheritance inheritance = new Inheritance();
        Oop oop = new Oop();
        Polymorphis polymorphis = new Polymorphis();



        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(abstraction.decodingAbstraction);
        arrayList.add(encapsulation.decodingEncapsulation);
        arrayList.add(inheritance.decodingInheritance);
        arrayList.add(oop.decodingOop);
        arrayList.add(polymorphis.decodingPolymorphis);




        if (random.nextInt(arrayList.size()) == 0){
            System.out.println(new Abstraction().decodingAbstraction);
        }
        else if (random.nextInt(arrayList.size()) == 1){
            System.out.println(new Encapsulation().decodingEncapsulation);
        }
        else if (random.nextInt(arrayList.size()) == 2){
            System.out.println(new Inheritance().decodingInheritance);
        }
        else if (random.nextInt(arrayList.size()) == 3){
            System.out.println(new Oop().decodingOop);
        }
        else {
            System.out.println(new Polymorphis().decodingPolymorphis);
        }

        return null;
    }
}
