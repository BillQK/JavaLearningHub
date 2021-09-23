package src.com.company;

public class MergeSortApp {
    public static void main(String[] args) {
        int maxSize = 100;
// array size
        DArray arr;
// reference to array
        arr = new DArray(maxSize);
// create the array
        arr.insert(64);
        arr.insert(21);
        arr.insert(33);
        arr.insert(70);
        arr.insert(12);
        arr.insert(85);
        arr.insert(44);
        arr.insert(3);
        arr.insert(99);
        arr.insert(0);
        arr.insert(108);
        arr.insert(36); // insert items
        arr.display(); // display items
        arr.mergeSort(); // merge sort the array
        arr.display();
    }
}

class DArray {
    private long[] theArray;
    private int Elemns;

    public DArray(int max) {
        theArray = new long[max];
        Elemns = 0;
    }

    public void insert(long value) {
        theArray[Elemns] = value;
        Elemns++;
    }

    public void display() {
        for (int i = 0; i < Elemns; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println();
    }

    public void mergeSort() {
        long[] workSpace = new long[Elemns];
        recMergeSort(workSpace, 0, Elemns - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;

            recMergeSort(workSpace, lowerBound, mid);

            recMergeSort(workSpace, mid + 1, upperBound);

            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(long[] workspace, int lowerPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowerPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;


        while (lowerPtr <= mid && highPtr <= upperBound) {
            if (theArray[lowerPtr] < theArray[highPtr]) {
                workspace[j++] = theArray[lowerPtr++];
            } else {
                workspace[j++] = theArray[highPtr++];
            }
        }
        while (lowerPtr <= mid) {
            workspace[j++] = theArray[lowerPtr++];
        }
        while (highPtr <= upperBound) {
            workspace[j++] = theArray[highPtr++];
        }

        for (j = 0; j < n; j++) {
            theArray[lowerBound + j] = workspace[j];
        }
    }
}