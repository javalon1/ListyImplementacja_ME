package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

/*
        */
/*Box<Integer> box1 = new Box(new Integer(12));
        Box<Float> box2 = new Box(new Float(12.32));*//*


        List<Integer> integerList = new ArrayList<>();

        integerList.add(12);
        integerList.add(132);
        integerList.add(12232);
        integerList.add(13213122);
        integerList.add(12312);
        integerList.add(1223312);
        integerList.add(12555);
        integerList.add(12121);
        integerList.add(12121);
        integerList.add(126);
        integerList.add(172);
        integerList.add(182);
        integerList.add(192);
        integerList.add(1202);

        for(Integer element: integerList){
            System.out.println(element);
        }
        for(int i = 0; i < integerList.size(); i++)
            System.out.println(integerList.get(i));

        integerList.remove(3);
        integerList.clear();

        List<String> stringList = new ArrayList<>();
        stringList.add("Zosia");
        stringList.add("Przemek");

        for(String el: stringList){
            System.out.println(el);
        }
*/


        Zadanie.zad1();
    }
}
