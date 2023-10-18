package insertion.cc26;

public class Sort {

    public int [] insertionSort(int[] arr){
        if(arr.length <2) return arr;
        int length = arr.length , j,key;
        if(length <1) return arr;
        for(int i = 1 ; i<length;i++){
            j=i-1;
            key=arr[i];
            while(j>=0 && key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
        arr[j+1]=key;
    }
        return arr;
    }

}
