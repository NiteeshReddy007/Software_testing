package org.example;

public class mergesort {
    static private void doMerge(int[] num,int s,int mid,int e){

        int[] mixArr = new int[e-s];
        int i=s,j=mid;
        int k=0;

        while(i<mid && j<e){
            if(num[i]<num[j]){
                mixArr[k] = num[i];
                i++;
            }
            else{
                mixArr[k] = num[j];
                j++;
            }
            k++;
        }
        while(i<mid) mixArr[k++] = num[i++];
        while(j<e) mixArr[k++] = num[j++];

        for(int ele : mixArr){
            num[s] = ele;
            s++;
        }
    }
    static  public void mergeSort(int[] nums,int s,int e){
        if(e-s==1) return ;
        int mid = (e+s)/2;
        mergeSort(nums,s,mid);
        mergeSort(nums,mid,e);
        doMerge(nums,s,mid,e);
    }
}
