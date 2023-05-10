import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    stack stack = new stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);

    system.out.print("Stack: ");
    stack.printStack();

    // ta bort elemnt från stack
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();
  }
}
