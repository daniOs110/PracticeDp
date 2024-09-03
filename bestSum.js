const bestSum = (target, numbers, memo = {}) => {
    //base case
    if(target in memo) return memo [target];
    if(target === 0) return [];
    if(target < 0) return null;

    let bestSumNumber = null;

    for(let num of numbers){
        const result = target - num;
        const resultRecursive = bestSum(result, numbers, memo);
        if(resultRecursive !== null){
            const combination = [...resultRecursive, num];
            if(bestSumNumber === null || combination.length <= bestSumNumber.length) {
                bestSumNumber = combination;
            }
        }      
    }
    memo[target] = bestSumNumber;
    return memo[target];
}

console.log(bestSum(7, [5,3,4,7]));
console.log(bestSum(7, [2, 3]));
console.log(bestSum(8, [2,3,5]));
console.log(bestSum(500, [7, 14, 5]));
