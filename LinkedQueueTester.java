import jsjf.LinkedQueue;
import jsjf.exceptions.EmptyCollectionException;

public class LinkedQueueTester {
  public static void main(String[] args){
    LinkedQueue<Character> queue = new LinkedQueue<>();
    queue.enqueue('a');
    queue.enqueue('b');
    queue.enqueue('c');
    queue.enqueue('d');
    System.out.println("expect:abcd");
    System.out.println("   got:"+queue);

    Character c = queue.dequeue();
    System.out.println("expect:a");
    System.out.println("   got:"+c);

    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    System.out.println("expect:empty string");
    System.out.println("   got:"+queue);

    System.out.println("expect:EmptyCollectionException to be thrown");
    try{
      queue.dequeue();
    }catch(EmptyCollectionException e){
      System.out.println("EmptyCollectionException is caught");
    }
  }
}
