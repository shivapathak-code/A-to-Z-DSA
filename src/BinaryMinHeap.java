public class BinaryMinHeap {
    int capacity;
    int size;
    int arr[];
    BinaryMinHeap(int cap)
    {
        capacity = cap;
        size = 0;
        arr = new int[cap];
    }
    int parent(int i)
    {
        return (i-1)/2;
    }
    int left(int i)
    {
        return (2*i+1);
    }
    int right(int i)
    {
        return (2*i+2);
    }
    public void insert(int x)
    {
        if(size == capacity)
        {
            System.out.println("Binary heap is overflow");
            return;
        }
        arr[size] = x;
        int k = size;
        size++;

        while(k!=0 && arr[parent(k)] > arr[k])
        {
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;
            k = parent(k);
        }
    }
    public void heapify(int index)
    {
        int smallest = index;
        if((left(index) < size) && ((arr[left(index)]) < arr[smallest]))
        {
            smallest = (left(index));
        }
        if((right(index) < size) && ((arr[right(index)]) < arr[smallest]))
        {
            smallest = (right(index));
        }
        if(smallest!=index)
        {
            int temp = arr[smallest];
            arr[smallest] = arr[index];
            arr[index] = temp;
            heapify(smallest);
        }

    }
    public void buildHeap()
    {
        for(int i = size/2-1;i>=0;i--)
        {
            heapify(i);
        }
    }
    public void printHeap() {

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        BinaryMinHeap h = new BinaryMinHeap(20);
        h.insert(12);
        h.insert(10);
        h.insert(18);
        h.insert(5);
        h.insert(8);
        h.insert(6);
        h.insert(3);

        h.size = 7;

        // Before buildHeap
        System.out.println("Before Heapify:");
        h.printHeap();

        // Convert array into Min Heap
        h.buildHeap();

        // After buildHeap
        System.out.println("After Heapify:");
        h.printHeap();

    }
}
