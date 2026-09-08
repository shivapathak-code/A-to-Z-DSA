public class Myheap {
    int heapsize;
    int heap[];
    int capacity;

    Myheap(int arr[])
    {
        heap = arr;
        heapsize = arr.length;
        capacity = arr.length;
    }
    public void swap(int a ,int b)
    {
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;

    }
    public void heapify(int index)
    {
        int smallest = index;
        int leftChildIndex = 2*index+1;
        int rightChildIndex = 2*index+2;

        if(leftChildIndex<heapsize && heap[leftChildIndex]>heap[smallest])
        {
            smallest = leftChildIndex;
        }
        if(rightChildIndex<heapsize && heap[rightChildIndex]>heap[smallest])
        {
            smallest = rightChildIndex;
        }
        if(smallest!=index)
        {
            swap(index , smallest);
            heapify(smallest);
        }

    }
    public void buildheap()
    {
        // leaf node start from {n/2-1 to n-1}
        // non leaf node start from {0 to n/2-1}

        for(int i = heapsize/2-1;i>=0;i--)
        {
            heapify(i);
        }
    }
    public int extractMax()
    {
        if(heapsize == 0)
        {
            System.out.println("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[heapsize-1];
        heapsize--;
        heapify(0);
        return max;
    }
    public void increseKey(int index , int value)
    {
        if(index<0 || index>=heapsize || heap[index]>= value)
        {
            System.out.print("wrong answer");
        }
        heap[index] = value;
        while(index>0 && heap[index]>heap[(int)(Math.ceil(index/2.0)-1)])
        {
            swap(index ,(int)(Math.ceil(index/2.0)-1) );
            index = (int)(Math.ceil(index/2.0)-1);
        }
    }
    public void printTree()
    {
        for(int i = 0;i<heapsize;i++){
            System.out.print(heap[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{10 , 5 ,20,6,11};
        Myheap heap = new Myheap(arr);
        heap.buildheap();
        heap.printTree();
        System.out.println();
        System.out.println(heap.extractMax());
        heap.printTree();
//        System.out.println();
//        heap.increseKey(4,15);
//        heap.printTree();
        }
}


