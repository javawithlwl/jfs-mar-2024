package com.careerit.jfs.cj.basics.interfaceexamples;
interface Search{
    int search(int[] arr,int ele);
}
class BinarySearch implements Search{
    @Override
    public int search(int[] arr,int ele){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == ele){
                return mid;
            }else if(arr[mid] < ele){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}
class JumpSearch implements Search{
    @Override
    public int search(int[] arr,int ele){
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while(arr[Math.min(step,n)-1] < ele){
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev >= n){
                return -1;
            }
        }
        while(arr[prev] < ele){
            prev++;
            if(prev == Math.min(step,n)){
                return -1;
            }
        }
        if(arr[prev] == ele){
            return prev;
        }
        return -1;
    }
}

class LinearSearch implements Search{
    @Override
    public int search(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele){
                return i;
            }
        }
        return -1;
    }
}

class NumberExample{
    public static int searchElement(int[] arr,int ele,Search search){
        return search.search(arr,ele);
    }
}
public class InterfaceExample3 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int ele = 5;
        int index = NumberExample.searchElement(arr,ele,new LinearSearch());
        if(index == -1) {
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+index);
        }

    }
}
