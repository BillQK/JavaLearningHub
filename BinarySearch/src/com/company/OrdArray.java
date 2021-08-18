package com.company;

public class OrdArray {
    private Long[] a;           // ref to array a
    private int nElems;         // number of data items

    public OrdArray(int max)    // constructor
    {
        a = new Long[max];      // create array
        nElems = 0;
    }

    public int size() {
        return this.nElems;
    }

    public int find(Long searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return this.nElems;                 // can't find it
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;     //it's in upper half
                } else {
                    upperBound = curIn - 1;      //it's in lower half
                }
            }

        }
    }

    public void insert(Long value) {
       int j;
       for (j = 0; j < nElems; j++)
       {
           if (a[j] > value) break;
       }
       for (int k = nElems; k > j; k--)
       {
           a[k] = a[k-1];

       }
        a[j] = value;
       nElems++;
    }

    public boolean delete(Long value)              //delete element
    {
        int j;
        for (j = 0; j < nElems; j++) {
            if (a[j] == value) break;            // if the first element is
        }
        if (j == nElems) {
            return false;
        } else {
            for (int k = j; k < nElems; k++) {
                a[k] = a[k + 1];
            }
            nElems--;
            return true;
        }


    }

    public void display ()
    {
        for (int i = 0; i < nElems; i++) {
            System.out.println(a[i] + " ");
        }
    }
}

