package array_subsets;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> subsetA(List<Integer> arr) {
        int subsetAsize = 0;
        if(arr.size() % 2 == 0){
            subsetAsize = (arr.size() / 2) - 1;
        }
        else{
            subsetAsize = (arr.size() / 2);
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.size()-1; i++){     
            if (list.size() == subsetAsize){
                break;
            } 
            if (arr.get(i) >= arr.get(i+1)){
                list.add(arr.get(i));
            }
            else if(arr.get(i) <= arr.get(i+1)){
                list.add(arr.get(i+1));
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 10);
        System.out.println(subsetA(list1));
    }
}

