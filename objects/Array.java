
package com.course.objects;
/**
 *
 * @author avoidcloud
 */
public class Array {

    private int size;
    private int length;
    private int[] data;
    private String Order;

    public Array(int size) {
        this.size = size;
        data = new int[size];
        length = 0;
    }
    public Array(){
        size = 10;
        data = new int[size];
        length = 0;
    }
    
    /* Insert Methods*/
    public void push_back(int element){
        if(length<size){
            data[length] = element;
            length++;
        }
    }
    public void push_front(int element){
        if(length<size){
            for(int i=0; i<length; i++){
                data[i+1] = data[i];
            }
            data[0] = element;
            length++;
        }
    }
    public void insertAt(int index, int element){
        if(index<length && length<size){
            for(int i=index; i<length; i++){
                data[i+1] = data[i];
            }
            data[index] = element;
            length++;
        }
    }
    
    /* delete methods*/
    public int pop_back(){
        if(length > 0){
            length--;
            return data[length];
        }
        return 0;
    }
    public int pop_front(){
        if(length > 0){
            int element = data[0];
            for(int i=1; i<length; i++){
                data[i-1] = data[i];
            }
            length--;
            return element;
        }
        return 0;
    }
    
    /*  Array's status methods*/
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        if(length > 0)
            return false;
        return true;
    }
    public void show(){
        for(int i=0; i<length; i++)
            System.out.print(data[i]+" ");
        System.out.println();
    }
    /* set a full array */
    public void setArray(int[] array){
        if(array.length <= size){
            size = array.length;
            data = array;
            length = size;
        }
        else{
            for(int i=0; i<size; i++){
                data[i] = array[i];
            }
            length = size;
        }
    }
    
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    ::::::::::::::::::::::::::   Sorting Algorithms  ::::::::::::::::::::::::::::::::
    ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    
    /*-------------------Bubble Sort-------------------------*/
    public void BubbleSort(String Order){
        Order = Order.toLowerCase();
        this.Order = Order;
        
        if(Order.equals("asc")){
            for(int i=0; i<length-1; i++){
                for(int j=i+1; j<length; j++){
                    if(data[i] > data[j]){
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }
        else if(Order.equals("des")){
            for(int i=0; i<length-1; i++){
                for(int j=i+1; j<length; j++){
                    if(data[i] < data[j]){
                        int temp = data[i];
                        data[i] = data[j];
                        data[j] = temp;
                    }
                }
            }
        }

    }
    /* Bubble Sort Overloading*/
    public void BubbleSort(){
        Order = "asc";
        for(int i=0; i<length-1; i++){
            for(int j=i+1; j<length; j++){
                if(data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
    
    /*-------------------  Merge Sort -------------------------*/ 
    public void MergeSort(String Order){
        Order = Order.toLowerCase();
        this.Order = Order;
        
        MergeSort(0, length-1);
    }
    /* Merge Sort OverLoading*/
    public void MergeSort(){
        Order = "asc";
        
        MergeSort(0, length-1);
    }
    /* Merge sort functionality*/
    private void MergeSort(int start, int stop){
        if(start<stop){
            int mid = start + (stop-start)/2;
            
            MergeSort(start, mid);
            MergeSort(mid+1, stop);
            
            MergeArray(start, mid, stop);
        }
    }
    private void MergeArray(int start, int mid, int stop){
        int leftLength = mid - start + 1;
        int rightLength = stop - mid ;
        
        int[] leftData = new int[leftLength]; 
        int[] rightData = new int[rightLength];
        
        for(int i=0; i<leftLength; i++){
            leftData[i] = data[start+i];
        }
        for(int i=0; i<rightLength; i++){
            rightData[i] = data[mid+1+i];
        }
        
        int index = start, leftIndex = 0, rightIndex = 0;
        
        if(Order.equals("asc")){
            while(leftIndex<leftLength && rightIndex<rightLength){
                if(leftData[leftIndex] < rightData[rightIndex]){
                    data[index] = leftData[leftIndex];
                    index++;
                    leftIndex++;
                }
                else{
                    data[index] = rightData[rightIndex];
                    index++;
                    rightIndex++;
                }
            }
            while(leftIndex<leftLength){
                data[index] = leftData[leftIndex];
                index++;
                leftIndex++;
            }
            while(rightIndex<rightLength){
                data[index] = rightData[rightIndex];
                index++; 
                rightIndex++;
            }
            
        }
        else {
            while(leftIndex<leftLength && rightIndex<rightLength){
                if(leftData[leftIndex] > rightData[rightIndex]){
                    data[index] = leftData[leftIndex];
                    index++;
                    leftIndex++;
                }
                else{
                    data[index] = rightData[rightIndex];
                    index++;
                    rightIndex++;
                }
            }
            while(leftIndex<leftLength){
                data[index] = leftData[leftIndex];
                index++;
                leftIndex++;
            }
            while(rightIndex<rightLength){
                data[index] = rightData[rightIndex];
                index++; 
                rightIndex++;
            }
        }
        
    }
    /*---------------------------Quick Sort---------------------*/
    public void QuickSort(String Order){
        Order = Order.toLowerCase();
        this.Order = Order;
        QuickSort(0, length-1);
    }
    public void QuickSort(){
        Order = "asc";
        QuickSort(0, length-1);
    }
    /* Quick Sort Functionality */
    private void QuickSort(int start, int stop){
        if(start < stop){
            int pivot = fixedIndex(start, stop);
            
            QuickSort(start, pivot-1);
            QuickSort(pivot+1, stop);
        }
    }
    private int fixedIndex(int start, int stop){
        int index = start;
        int value = data[stop];
        
        if(Order.equals("asc")){
            for(int i=start; i<stop; i++){
                if(data[i] < value){
                    int temp = data[i];
                    data[i] = data[index];
                    data[index] = temp;
                    index++;
                }
            }
            int temp = data[stop];
            data[stop] = data[index];
            data[index] = temp;
            
            return index;
        }
        else if(Order.equals("des")){
            for(int i=start; i<stop; i++){
                if(data[i] > value){
                    int temp = data[i];
                    data[i] = data[index];
                    data[index] = temp;
                    index++;
                }
            }
            int temp = data[stop];
            data[stop] = data[index];
            data[index] = temp;
            
            return index;
        }
        else
            return stop;
    }
    public void InsertionSort(){
        Order = "asc";
        for(int i=1; i<length; i++){
                int index = i;
                int value = data[i];
                while(index > 0 && data[index-1] > value){
                    data[index] = data[index-1];
                    index--;
                }
                data[index] = value;
            }
    }
    public void InsertionSort(String Order){
        Order = Order.toLowerCase();
        this.Order = Order;
        if(Order.equals("asc")){
            for(int i=1; i<length; i++){
                int index = i;
                int value = data[i];
                while(index > 0 && data[index-1] > value){
                    data[index] = data[index-1];
                    index--;
                }
                data[index] = value;
            }
        }
        else if(Order.equals("des")){
            for(int i=1; i<length; i++){
                int index = i;
                int value = data[i];
                while(index > 0 && data[index-1] < value){
                    data[index] = data[index-1];
                    index--;
                }
                data[index] = value;
            }
        }
    }
    
    
    /*::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
    ------------------------ Binary Search --------------------------
    ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    public int Search(int item){
        return BinarySearch(0, length, item);
    }
    /* Binary Search functionality */
    private int BinarySearch(int start, int stop, int item){
        if(Order.equals("asc")){
            while(start<=stop){
                int mid = start + (stop-start)/2;
                if(data[mid] == item)
                    return mid;
                else if(data[mid] < item)
                    start = mid+1;
                else
                    stop = mid - 1;
            }
        }
        else if(Order.equals("des")){
            while(start<=stop){
                int mid = start + (stop-start)/2;
                if(data[mid] == item)
                    return mid;
                else if(data[mid] > item)
                    start = mid+1;
                else
                    stop = mid - 1;
            }
        }
        return -1;
    }
}
