const howSum = (targetSum, numbers, memo = {}) => {
    if(targetSum in memo) return memo[targetSum];
    // base case
    if(targetSum === 0) return [];
    if(targetSum < 0) return null;
    //iteration of numbers
    for( let num of numbers){
        const reminder = targetSum - num;
        //recursive function
        const reminderResult = howSum(reminder, numbers, memo);
        if(reminderResult !== null){
            //memoization part
            memo[targetSum] = [ ...reminderResult, num];
            return memo[targetSum];
        }
    }
    memo[targetSum] = null;
    return null;
};

console.log(howSum(7, [5,3,4,7]));
console.log(howSum(7, [2, 4]));
console.log(howSum(8, [2,3,5]));
console.log(howSum(300, [7, 14]));