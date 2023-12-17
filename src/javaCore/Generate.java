package javaCore;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Generate implements GenerateDecoding {


    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);



    @Override
    public Generate generateDecodingJavaCore() {

        Abstraction abstraction = new Abstraction();
        CollectionList collectionList = new CollectionList();
        CollectionMap collectionMap = new CollectionMap();
        CollectionSet collectionSet = new CollectionSet();
        Encapsulation encapsulation = new Encapsulation();
        Inheritance inheritance = new Inheritance();
        Oop oop = new Oop();
        Polymorphis polymorphis = new Polymorphis();
        WhatCollection whatCollection = new WhatCollection();
        WhotException whotException = new WhotException();
        SOLID solid = new SOLID();

        List<String> list = new ArrayList<>();
        list.add(abstraction.decodingAbstraction);
        list.add(collectionList.decodingList);
        list.add(collectionMap.decodingMap);
        list.add(collectionSet.decodingSet);
        list.add(encapsulation.decodingEncapsulation);
        list.add(inheritance.decodingInheritance);
        list.add(oop.decodingOop);
        list.add(polymorphis.decodingPolymorphis);
        list.add(whatCollection.decodingCollection);
        list.add(whotException.decodingException);
        list.add(solid.decodingSOLID);



        if ( random.nextInt(list.size()) == 0 ) {
            System.out.println(abstraction.decodingAbstraction);
        }
        else if ( random.nextInt(list.size()) == 1 ) {
            System.out.println(collectionList.decodingList);
        }
        else if ( random.nextInt(list.size()) == 2 ) {
            System.out.println(collectionMap.decodingMap);
        }
        else if ( random.nextInt(list.size()) == 3 ) {
            System.out.println(collectionSet.decodingSet);
        }
        else if ( random.nextInt(list.size()) == 4 ) {
            System.out.println(encapsulation.decodingEncapsulation);
        }
        else if ( random.nextInt(list.size()) == 5 ) {
            System.out.println(inheritance.decodingInheritance);
        }
        else if ( random.nextInt(list.size()) == 6 ) {
            System.out.println(oop.decodingOop);
        }
        else if ( random.nextInt(list.size()) == 7 ) {
            System.out.println(polymorphis.decodingPolymorphis);
        }
        else if ( random.nextInt(list.size()) == 8 ) {
            System.out.println(whatCollection.decodingCollection);
        } else if (random.nextInt(list.size()) == 9) {
            System.out.println(solid.decodingSOLID);
        } else {
            System.out.println(whotException.decodingException);
        }
        return null;
    }

    public void gamesJavaCore() {
        boolean flag = true;
        while (flag) {
            System.out.println("Хотите поигать ?");
            System.out.println("Нажмите 1 - играть\n" +
                    "Нажмите 2 - выход");
            int x = scanner.nextInt();

            if (x == 1) {
                Generate generate = new Generate();
                generate.generateDecodingJavaCore();
            } else {
                flag = false;
            }
        }
    }
}
