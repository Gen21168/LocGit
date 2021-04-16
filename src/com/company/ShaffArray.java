package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShaffArray {

        public static void main(String[] args) {

            Integer [] IntArr = new Integer[] {1,2,3,4,5,6,7,8};

            for (Integer Intlist_01 : IntArr) {
                System.out.print(Intlist_01+" ");
            }
            System.out.println(" ");
            System.out.println("Intlist");

            List<Integer> Intlist = Arrays.asList(IntArr);

            Collections.shuffle(Intlist);

            System.out.println("Integer List - not Array: ");
            for (Integer int_l : Intlist) {
                System.out.print(int_l+" ");
            }
            System.out.println("= 1 =");
            System.out.println("List to Array");

            Integer[] myArrayLengh = new Integer[Intlist.size()];

            for (int i = 0; i < Intlist.size(); i++) {
                myArrayLengh[i] = Intlist.get(i);
            }

            System.out.println(" ");
            for (Integer integer : myArrayLengh) {
                System.out.print(integer + " ");
            }
            System.out.println();
           // System.out.print("New massive");
           //System.out.print("Returning from a new array to old one ");

            for (int i=0; i<IntArr.length; i++ ) {
                IntArr[i] = myArrayLengh[i];
                System.out.print(IntArr[i]+" ");
            }

            Integer[] intArray = new Integer[]{11, 22, 33, 44, 55};

            List<Integer> list2 = Arrays.asList(intArray);

            Collections.shuffle(list2);

            System.out.println("Int Array: ");
            for (int num : list2) {
                System.out.println(num);
            }
        }
    }
// https://beginnersbook.com/2014/07/random-shuffling-of-an-array-in-java/
//Modification: Returning from new  to old array


