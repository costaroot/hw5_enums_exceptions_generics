package com.costaroot;

import com.costaroot.generic.HighestLowestElement;
import com.costaroot.generic.MyList;

public class Main {

    public static void main(String[] args) {
        MyList<String> stringMyList = new MyList<>();
        stringMyList.add("A");
        stringMyList.add("AA");
        stringMyList.add("AB");
        stringMyList.add("AbXza");
        stringMyList.add("aBc");
        System.out.println("Largest string element= " + stringMyList.largestVar() + " Smallest string element= " +
                stringMyList.smallestVar());

        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(-1);
        integerMyList.add(-24);
        integerMyList.add(7);
        integerMyList.add(77);
        integerMyList.add(0);
        System.out.println("Largest integer element= " + integerMyList.largestVar() + " Smallest integer element= " +
                integerMyList.smallestVar());

        Integer[] integerArr = {-1, 2, 0, 24, -1, -11, 12};
        HighestLowestElement<Integer> intList = new HighestLowestElement<>(integerArr);
        System.out.println("Max = " + intList.getHigh() + " Min= " + intList.getLow());

        String[] stringsArr = {"This", "is", "some", "message"};
        HighestLowestElement<String> strList = new HighestLowestElement<>(stringsArr);
        System.out.println("Largest string = " + strList.getHigh() + " Smallest string = " + strList.getLow());
    }
}
