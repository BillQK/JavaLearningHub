public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size){
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1); // delete item key as -1
    }

    public void displayItem() {
        System.out.println("Table: ");
        for(int j =0 ; j < arraySize; j++){
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            }
            else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }
    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(DataItem item) {
        if (arraySize == 0) {
            return;
        }
        int key = item.getKey();
        int hashVal = hashFunc(key);

        while(hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != -1){
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key) {
        if (arraySize == 0) {
            return null;
        }
        int hashValue = hashFunc(key);
        while (hashArray[hashValue] != null) {
            if(hashArray[hashValue].getKey() == key){
                DataItem item = hashArray[hashValue];
                hashArray[hashValue] = nonItem;
                return item;
            }
            ++hashValue;
            hashValue %= arraySize;
        }
        return null;
    }

    public DataItem find(int key) {
        int hashVal = hashFunc(key);

        while(hashArray[hashVal] != null) {
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }


}
