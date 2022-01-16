//Implementation of ‘Stack’ Data-Structure in Java.
import java.util.Arrays;

class TheStack {
    
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;
    
    TheStack(int stackSize){
        this.stackSize = stackSize;
        stackArray = new String[this.stackSize];
        Arrays.fill(stackArray, "-1");
    }
    
    
    //Push operation
    public void push(String data){
        if(topOfStack +1 < stackSize){
            topOfStack++;
            stackArray[topOfStack] = data;
            System.out.println("PUSH: New data element "+data+" is pushed into stack");
        }else{
            System.out.println("Stack is full");
        }
    }
    
    //Pop Operation
    public String pop(){
        if(topOfStack >= 0){
            System.out.println("POP: top data element "+stackArray[topOfStack]+" is removed from stack");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        }else{
            System.out.println("Sorry but the stack is empty");
            return "-1";
        }
    }
    
 // Peek operation
    public String peek() {
        System.out.println("PEEK: " + stackArray[topOfStack] + " is at the top of the Stack.");
        return stackArray[topOfStack];
    }
    
 // Using our Stack
    public static void main(String[] args ) {
        
        TheStack theStack = new TheStack(10);
        theStack.push("5Balloons");
        theStack.push("Programming");
        theStack.push("Tutorials");
        theStack.peek();
        theStack.pop();
        theStack.pop();
        theStack.pop();
        
    }

}