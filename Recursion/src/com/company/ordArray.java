package com.company;

public class ordArray {
    private int[] arr;
    private int nElements;

    public ordArray(int Size) {
        arr = new int[Size];
        nElements = 0;
    }

    public int size() {
        return nElements;
    }

    public int find(int searchKey) {
        return recFind(searchKey, 0, nElements - 1);
    }

    private int recFind(int searchKey, int lowerBound, int upperBound) {
        int curIn;

        curIn = (lowerBound + upperBound) / 2;

        if (arr[curIn] == searchKey) {
            return curIn;
        } else if (lowerBound > upperBound) {
            return nElements;
        } else {
            if (arr[curIn] < searchKey) {
                return recFind(searchKey, curIn + 1, upperBound);
            } else {
                return recFind(searchKey, lowerBound, curIn - 1);
            }
        }
    }

    public void insert(int value) {
        int j;
        for (j = 0; j < nElements; j++) {
            if (arr[j] > value) {
                break;
            }
        }
        for (int k = nElements; k > j; k--) {
            arr[k] = arr[k - 1];
        }
        arr[j] = value;
        nElements++;
    }

    public void display() {
        for (int j = 0; j < nElements; j++) {
            System.out.print(
                    arr[j] + " "
            );
            System.out.print("");
        }
    }
}
