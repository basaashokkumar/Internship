import java.util.*;
public class Arraydeque {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Samson");
        deque.add("Amandeep");
        deque.add("Malleshwari");
        System.out.println("head of the arrayqueue using element() method"+deque.element());
        System.out.println("head of the arrayqueue using peek() method"+deque.peek());
        //Traversing elements
        //for (String str : deque) {
            System.out.println(deque);
            //deque.removeLast();
            //deque.removeFirst();
        deque.remove();
        deque.offerFirst("Java Intern Samson");
        deque.pollLast();
        deque.offerLast("Malleshwari TeamLead");
        deque.remove("Amandeep");
        deque.offer("Amandeep Mentor");
        //
        // deque.pollLast();
        System.out.println(deque);

    }
}
