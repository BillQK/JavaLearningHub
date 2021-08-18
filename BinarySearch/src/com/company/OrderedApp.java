package com.company;

public class OrderedApp {

    public static void main(String[] args) {
	// write your code here

        int maxSize = 100;
        OrdArray arr;

        arr = new OrdArray(maxSize);

        arr.insert(Long.valueOf(12));
        arr.insert(Long.valueOf(65));
        arr.insert(Long.valueOf(76));
        arr.insert(Long.valueOf(45));
        arr.insert(Long.valueOf(73));
        arr.insert(Long.valueOf(43));
        arr.insert(Long.valueOf(61));
        arr.insert(Long.valueOf(87));
        arr.insert(Long.valueOf(98));
        arr.insert(Long.valueOf(66));

        Long searchKey1 = Long.valueOf(54);
        Long searchKey2 = Long.valueOf(87);

        if (arr.find(searchKey1) != arr.size())
        {
            System.out.println("Found " + searchKey1);
        }
        else
        {
            System.out.println("Can't find " + searchKey1);
        }
        if (arr.find(searchKey2) != arr.size())
        {
            System.out.println("Found " + searchKey2);
        }
        else
        {
            System.out.println("Can't find " + searchKey2);
        }

        arr.display();


        arr.delete(Long.valueOf(54));
        arr.delete(Long.valueOf(99));
        arr.delete(Long.valueOf(87));

        arr.display();


    }
}
