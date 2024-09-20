package OOP2023_2024.datastructure;
import java.util.Random;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Test Queue: ");
        testQueue();
        System.out.println();
        System.out.println("Test Stack: ");
        testStack();


        /*
        Yêu cầu:

        - Hoàn thiện code chương trình theo mẫu đã cho.

        - Sinh ra một số tự nhiên ngẫu nhiên nằm trong đoạn [15 - 30], gọi là n.
        - Sinh ra n số nguyên ngẫu nhiên, cho vào stack.
            + In ra các phần tử trong stack.
            + Lần lượt xóa các phần tử trong stack. Sau mỗi lần xóa, in ra các phần tử còn lại trong stack.

        - Sinh ra n số nguyên ngẫu nhiên, cho vào queue.
            + In ra các phần tử trong queue.
            + Lần lượt xóa các phần tử trong queue. Sau mỗi lần xóa, in ra các phần tử còn lại trong queue.
        */

    }

    public static void testStack() {
        /* TODO */
        MyStack myStack = new MyStack();
        for (int i = 0; i < 10; i++){
            myStack.push(i);
        }
        System.out.println(myStack.size());
        System.out.println(Arrays.toString(myStack.toArray()));
        while (!myStack.isEmpty()){
            myStack.pop();
            System.out.println(Arrays.toString(myStack.toArray()) + " " + myStack.size());
        }
    }

    public static void testQueue() {
        /* TODO */
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 10; i++){
            myQueue.add(i);
        }
        System.out.println(myQueue.size());
        System.out.println(Arrays.toString(myQueue.toArray()));
        for (int i = 0; i < 10; i++){
            myQueue.remove();
            System.out.println(Arrays.toString(myQueue.toArray()) + " size: " + myQueue.size());
        }
    }
}
