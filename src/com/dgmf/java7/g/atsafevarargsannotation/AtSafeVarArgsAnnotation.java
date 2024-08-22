package com.dgmf.java7.g.atsafevarargsannotation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AtSafeVarArgsAnnotation {
    public static void main(String[] args) {
        sum(1);
        sum(1, 2);
        sum(1, 2, 3);

        AtSafeVarArgsAnnotation obj = new AtSafeVarArgsAnnotation();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("Eazy");
        list2.add("Bytes");
        list3.add("Java 7");

        obj.print(list1, list2, list3);

        /*
         * List<Integer> nums = new ArrayList<>(); nums.add(2); nums.add(3);
         * obj.print(messages, nums);
         */
    }

    // Step 1
    /*public final void print(List<String>... messages) {
        // Heap Pollution ==> Mixing Integer and String in the Same List
        // Calling "sum()" Function With 3 Different Number of Parameters
        // ==> ClassCastException: Integer cannot be cast to String
        Object[] arr = messages;
        List<Integer> intList = new ArrayList<>();
        intList.add(1606);
        arr[0] = intList;
        String firstElement = messages[0].get(0);
        System.out.println(firstElement);
    }*/

    // Step 2
    @SafeVarargs
    public final void print(List<String>... messages) {
        String firstElement = messages[0].get(0);
        System.out.println(firstElement);
    }

    // Varargs (Variable Number of Arguments)
    // 3 Extra Dots After "int" Type ==> Makes "nums" Variable as a
    // Variable Args Which Means this Method Can Accept Any Number of
    // Parameters as Input as Longer They Are Type "int"
    private static void sum(int... nums) {
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        System.out.println("The total sum for the given input is : " + sum);
    }
}
