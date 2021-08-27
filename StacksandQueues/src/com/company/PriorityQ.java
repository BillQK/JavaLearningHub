package com.company;

public class PriorityQ {
    // array in sorted order, from max at 0 to min at size-1
    private int maxSize;
    private Long[] queArray;
    private int nItems;

    public PriorityQ(int s)
    {
        maxSize = s;
        queArray = new Long[maxSize];
        nItems = 0;
    }
    public void insert(Long item)
    {
        int j;

        if (nItems==0)
        {
            queArray[nItems++] = item;
        }
        else {
            for (j = nItems-1; j >=0; j--)
            {
                if (item > queArray[j])
                {
                    queArray[j+1] = queArray[j];
                }
                else {
                    break;
                }
                queArray[j+1] = item;
                nItems++;
            }
        }
    }
    public Long remove()
    {
        return queArray[nItems-1];
    }
    public Long peekMin()
    {
        return queArray[nItems-1];
    }

    public boolean isEmpty()
    {
        return (nItems == 0);
    }
    public boolean isFull()
    {
        return (nItems == maxSize);
    }
}
