package com.evan.dynamicprogramming;

public class Test {

    public static void main(String[] args){
        Test test = new Test();
        test.casess(1,1, "");
    }


    private void casess(int left, int right, String path){
        if(left == 0 && right == 0){
            System.out.println(path);
            return;
        }

        if(left > 0){
            casess(left-1, right, path + "(");
        }

        if(left < right){
            casess(left, right-1, path + ")");
        }
    }
}
