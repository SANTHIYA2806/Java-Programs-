import java.util.Scanner;
import java.util.Arrays;
public class StackFunction {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int top = -1;

    public void push(int val){
        if(top==arr.length-1){
            System.out.println("Stack is Overflow");
        }
        else {
            top++;
            arr[top] = val;
        }
    }
    public void pop(){
        if (top==-1){
            System.out.println("Stack is Underflow");
        }
        else {
            System.out.println("Popped Element is "+arr[top]);
            top--;
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Peek Element is "+arr[top]);
        }
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else {
            for(int i = top;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        StackFunction stack = new StackFunction();
        stack.push(7);
        stack.push(9);
        stack.push(2);

        stack.pop();

        stack.peek();
        stack.display();
    }
}
