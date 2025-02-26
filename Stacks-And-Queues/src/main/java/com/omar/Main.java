package com.omar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myNums = new Stack<>();

        System.out.println(myNums);

        myNums.push(5);
        myNums.push(6);
        myNums.push(7);
        System.out.println( myNums.pop());

        System.out.println(myNums.peek());
        System.out.println(myNums);

        System.out.println(myNums.size());

        System.out.println(myNums.isEmpty());


//        ArrayList remove from beggening: O(n)
//        LinkedList remove from beggening: O(1)

        Queue<Integer> myInts = new LinkedList<>();

        myInts.add(1);
        myInts.add(2);
        myInts.add(3);

//        add element to queue
        myInts.offer(4);
//        remove element from queue
        myInts.poll();
        System.out.println(myInts);

        System.out.println(myInts.peek());

        System.out.println(myInts);

        System.out.println(myInts.isEmpty());

        System.out.println(myInts.size());


    }

    public int calPoints(String[] operations) {
        Stack<Integer> finalScore = new Stack<>();

//        loop through all the operations
//        if it is a number than just push
//        if its a + I will add the last two score
//        if its a D I will double the last score
//        if its a C I will invalidate the last score

        for(String op: operations){
            if(op.equals("+")){
                int firstValue = finalScore.pop();
                int secondValue = finalScore.pop();

                int result = firstValue + secondValue;

                finalScore.push(secondValue);
                finalScore.push(firstValue);
                finalScore.push(result);
            }
            else if(op.equals("D")){
                int lastValue = finalScore.peek();
                int doubledValue = lastValue*2;
                finalScore.push(doubledValue);
            }
            else if(op.equals("C")){
                finalScore.pop();
            }
//            condition for if it is a number
            else{
                int parsedNumber = Integer.parseInt(op);
                finalScore.push(parsedNumber);
            }
        }

        int finalResult = 0;

        while(!finalScore.isEmpty()){
            finalResult+= finalScore.pop();
        }
        return finalResult;

    }


}