package List;

import java.util.ArrayList;

public class Sub_Class_of_Vector {
    public static void main(String[] args) {
        Stack stk =new Stack();
        stk.push(15);
        stk.push(30);
        stk.push(45);
        stk.push(60);
        stk.listPrint();
        stk.peek();

        stk.pop();
        stk.listPrint();
        stk.peek();

        stk.push(75);
        stk.push(90);
        stk.listPrint();
        stk.pop();
        stk.listPrint();
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