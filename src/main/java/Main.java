import java.util.Stack;

public class Main {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topElement = stack.pop();
                if ((c == ')' && topElement != '(') || (c == '}' && topElement != '{') || (c == ']' && topElement != '[')) {
                    return false;

                }
            }
        }

        return stack.isEmpty();
    }
    //Problem 2: Evaluate Reverse Polish Notation

    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if(t.equals("+") || t.equals("-")|| t.equals("*")|| t.equals("/")){
                // Pop two elements from stack
                int b = stack.pop();
                int a = stack.pop();

                // Apply the operation and push result back
                switch (t){
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/": stack.push(a/b); break;
                }
            } else {
                // Push number onto stack
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop(); // Final result
    }

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
        System.out.println(isValidParentheses( "([])"));

        //Problem 2: Evaluate Reverse Polish Notation
        System.out.println(evaluateRPN(new String[]{"2","1","+","3","*"}));
        System.out.println(evaluateRPN(new String[]{"4","13","5","/","+"}));
        System.out.println(evaluateRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));

    }

}
