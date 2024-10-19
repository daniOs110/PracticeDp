public class BasketBallGame {
    class Solution {
        public int calPoints(String[] operations) {
            //+ sum of previous 2 scores
            //D new score (double of previous score)
            //C invalidate the previous score removing from the record
            //["5","2","C","D","+"]
            //                  -
            //[5, 10, 15] LIFO
            //if(is C) -> remove last from stack
            //if(is D) -> duplicate last number into the stack
            //if(is +) -> sum the last two numbers of the stack
            //output = 5+2-2
            Stack<Integer> finalStack = new Stack<>();
            int lastCharacter = 0;
            int output = 0;
            for(String letter : operations){
                if(letter.equals("C") &&  !finalStack.isEmpty()){
                    finalStack.pop();
                }else
                if(letter.equals("D")){
                    lastCharacter = finalStack.peek() * 2;
                    finalStack.push(lastCharacter);
                }else
                if(letter.equals("+")){
                    int top1 = finalStack.pop();
                    int top2 = finalStack.peek();
                    int sum = top1 + top2;
                    finalStack.push(top1);
                    finalStack.push(sum);
                }else{
                    finalStack.push(Integer.parseInt(letter));
                }
            }
            while(!finalStack.isEmpty()){
                output += finalStack.pop();
            }
            return output;
        }
        //complexity
        //O(n) time (for loops)
        //O(n) space (stack)
    }
}
