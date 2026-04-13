package lab3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue {
    public static void main(String[] args) {
        System.out.println("Deepayan Chakravarti 04714802724");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack Pop: " + stack.pop());
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        System.out.println("Queue Poll: " + queue.poll());
    }
}
