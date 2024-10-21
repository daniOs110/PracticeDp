class Solution {
    public int evalRPN(String[] tokens) {
         //["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        //   -
        // (3+9) = 12  -> (-11*12) = -132  -> (-132/6) = -22 -> (-22*10)=-220
        // (17 + -220)= -203 -> (5 + -203) = -198
        //[-198]
        //5+(((-11*(3+9))/6)*10))+17))
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int top = stack.pop();
                    stack.push(stack.pop() - top);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    top = stack.pop();
                    stack.push(stack.pop() / top);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        
        return stack.pop(); // Devuelve el resultado final
    }
    //complexity
    //time O(n)
    //space O(n)
}
