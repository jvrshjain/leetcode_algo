package algo.easy;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinary {

    public void generateBinary (int n){
        if(n<=0) {
            System.out.println("0");
            return;
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while (n-->0) {
            String s1= queue.peek();
            queue.remove();
            System.out.println(s1);
            String s2 = s1;
            queue.add(s1 + "0");
            queue.add(s2 + 1);
        }
    }

    public static void main(String[] args) {
        GenerateBinary solution  = new GenerateBinary();
        solution.generateBinary(15);
    }
}
