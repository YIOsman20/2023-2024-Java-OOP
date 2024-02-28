package Lists;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        /*int[] intArray = new int[5];
        int[] intArray2 = {1,2,3,4};

        intArray2[3] =10;

        List<Integer>integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        List<Integer>intLinkedList = new LinkedList<>();

        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> queue = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        System.out.println(stack.peek());
        System.out.println((stack.pop()));
        stack.forEach(e->System.out.println(e));

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        queue.push(100);

        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.forEach(e->System.out.println(e));
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        ArrayDeque<Integer> openBracketIndexStack = new ArrayDeque<>();
        for(int i = 0;i<expression.length();i++)
        {
            if(expression.charAt(i)== '(')
            {
                openBracketIndexStack.push(i);
            }
            if(expression.charAt(i) == ')')
            {
                System.out.println(expression.substring(openBracketIndexStack.pop(),i+1));
            }
        }*/
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print"))
        {
            if(!input.equals("cancel"))
            {
                printerQueue.offer(input);
            }else{
                System.out.println("Canceled " + printerQueue.poll());
            }

            input=scanner.nextLine();
        }
        printerQueue.forEach(e -> System.out.println(e));
    }
}
