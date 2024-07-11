package midterm.year2324.datastructure;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
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
        testStack();
        testQueue();

    }

    public static void testStack() {
        /* TODO */
        System.out.println("\nTEST MY STACK:");
        MyStack myStack = new MyStack();
        int max = 30;
        int min = 15;
        int range = max - min + 1;
        int num = (int)(Math.random() * range) + min;
        System.out.println("The random number is: " + num);
        for (int i = 0; i < num; i++){
            int upper = 10;
            int lower = 5;
            myStack.push((int)(Math.random() * (upper - lower + 1)) + lower);
        }
        System.out.println(myStack.size());
        System.out.println(Arrays.toString(myStack.toArray()) + " size: " + myStack.size());
        while (!myStack.isEmpty()){
            myStack.pop();
            System.out.println(Arrays.toString(myStack.toArray()) + " size: " + myStack.size());
        }
        System.out.println();
    }

    public static void testQueue() {
        /* TODO */
        System.out.println("\nTEST MY QUEUE:");
        MyQueue myQueue = new MyQueue();
        int max = 30;
        int min = 15;
        int range = max - min + 1;
        int num = (int)(Math.random() * range) + min;
        System.out.println("The random number is: " + num);
        for (int i = 0; i < num; i++){
            int upper = 10;
            int lower = 5;
            myQueue.add((int)(Math.random() * (upper - lower + 1)) + lower);
        }
        System.out.println(myQueue.size());
        System.out.println(Arrays.toString(myQueue.toArray()) + " size: " + myQueue.size());
        while (!myQueue.isEmpty()){
            myQueue.remove();
            System.out.println(Arrays.toString(myQueue.toArray()) + " size: " + myQueue.size());
        }
        System.out.println();
    }
}
