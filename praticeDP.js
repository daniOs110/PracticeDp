const howSum = (target, numbers, memo = {}) => {
    //base case
    if(target in memo) return memo[target];
    if(target === 0) return [];
    if(target < 0) return null;

    //recursive function
    for(let num of numbers){
        const result = target - num;
        const resultRecursive = howSum(result, numbers, memo);
        if(resultRecursive !== null){
            memo[target] = [...resultRecursive, num];
            return memo[target];
        }
    }
    memo[target] = null;
    return null;

}

console.log(howSum(7, [5,3,4,7]));
console.log(howSum(7, [2, 3]));
console.log(howSum(8, [2,3,5]));
console.log(howSum(300, [7, 14]));



