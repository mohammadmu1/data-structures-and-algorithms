package insertion;

public class sort {

    int [] insertionSort(int [] arr){
        int length = arr.length , key , j;
        for(int i = 1 ;i<length;i++){
            key = arr[i];
            j=i-1;
            while(j>=0 && arr[i]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;

        }
        return arr;
    }

}
