package com.sc.db1.core.file;

/**
 * Created by snehasis_2 on 10/14/2017.
 */
public class DBCollections {
    public static int[] quickSort(int[] data,int low,int high){
        if (low<high){
            int partIndex=partition(data,low,high);
            quickSort(data,low,partIndex-1);
            quickSort(data,partIndex+1,high);
        }
        return data;
    }
    private static int partition(int[] data,int low,int high){
        int pivot=high;
        int fIdx=low-1;
        for(int scanner=low;scanner<high;scanner++){
            if(data[scanner]<=data[pivot]){
                fIdx++;
                int temp=data[scanner];
                data[scanner]=data[fIdx];
                data[fIdx]=temp;

            }

        }
        int temp=data[pivot];
        data[pivot]=data[fIdx+1];
        data[fIdx+1]=temp;
        return fIdx+1;
    }

    public static void main(String [] args){
        int [] x= {2,23,24,45,42,89,12,32,98,57,55,53};
        DBCollections ds=new DBCollections();
        x=ds.quickSort(x,0,x.length-1);
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }

    }
}
