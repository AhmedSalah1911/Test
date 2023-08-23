import javax.lang.model.util.Elements;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        MyQueue myQueue = new MyQueue();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            queue.add(alphabet.charAt(i));
            myQueue.add(alphabet.charAt(i));
        }

        while (queue.size() != 0) {
            System.out.println(queue.remove() + "-------------" + myQueue.remove());
            System.out.println(queue.size() + "------------" + myQueue.size());
            queue.remove();
            myQueue.remove();
        }

    }
}