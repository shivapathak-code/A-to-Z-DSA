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
    public int[] heapSort()
    {
        buildheap();
        int size = heapsize;
        for(int i = 0 ; i< size;i++)
        {
            extractMaxAndStore();
        }
        return heap;
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
     public void extractMaxAndStore()
    {
        if(heapsize == 0)
        {
            System.out.println("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[heapsize-1];
        heap[heapsize-1] = max;
        heapsize--;
        heapify(0);
        return;
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
        while(index>0 && heap[index]>heap[(index-1)/2])
        {
            swap(index ,(index-1)/2 );
            index = (index-1)/2;
        }
    }
    public void decreseKey(int index , int value)
    {
        if(index<0 || index>=heapsize || heap[index]<= value)
        {
            System.out.print("wrong answer");
        }
        heap[index] = value;
        heapify(index);
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
        int ans[] = heap.heapSort();
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        for(int i = ans.length-1;i>=0;i--){
            System.out.print(ans[i] + " ");
        }

//        System.out.println();
//      System.out.println(heap.extractMax());
//        heap.printTree();
//        System.out.println();
//        heap.increseKey(4,15);
//        heap.printTree();
//        System.out.println();
//        heap.decreseKey(0 ,4);
//        heap.printTree();
//
//
        }
}


