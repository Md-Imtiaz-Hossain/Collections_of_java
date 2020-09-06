package List.Vector;

import java.util.ArrayList;

public class Sub_Class_of_Vector {
    public static void main(String[] args) {
        Stack stkList =new Stack();
        stkList.push(15);
        stkList.push(30);
        stkList.push(45);
        stkList.push(60);
        stkList.listPrint();
        stkList.peek();

        stkList.pop();
        stkList.listPrint();
        stkList.peek();

        stkList.push(75);
        stkList.push(90);
        stkList.listPrint();
        stkList.pop();
        stkList.listPrint();
    }

}


class Stack{

    ArrayList list = new ArrayList();

    public void push(int stackValue ){
        list.add(stackValue);
    }

    public void listPrint(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1)+"- "+list.get(i));
        }
        System.out.println("===========================");
    }

    public void pop(){
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
            return;
        }
    }


    public void peek(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Top- "+list.get(i));
            break;
        }
        for (int j = list.size()-1 ; j >= 0 ; j--) {
            System.out.println("Bottom- "+list.get(j));
            break;
        }

    }













}