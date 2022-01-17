package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        MyList<String> myList2 = new MyList<String>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        for (int i = 0 ; i < myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}
