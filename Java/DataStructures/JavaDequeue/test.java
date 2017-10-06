package DataStructures.JavaDequeue;

import java.util.*;

/*
6 3
5 3 5 2 3 2*/

public class test {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Deque<Object> deque = new ArrayDeque<>();

        int n = in.nextInt(); // amount of element
        int m = in.nextInt(); // window size
        int max = 0;
        int count = m - 1;

        Set<Object> buf = new HashSet<>();

        for (int i = 1; i <= count; i++) {

            int num = in.nextInt();
            deque.addLast(num);
        }

        while (count <= n) {

            buf.clear();
            int num = in.nextInt();

            deque.addLast(num);
            buf.addAll(deque);

            if (max < buf.size()) {
                max = buf.size();
            }

            if (max == m) {
                break;
            }

            deque.removeFirst();

            count++;
        }

        System.out.println(max);
    }
}
