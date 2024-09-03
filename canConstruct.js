const canConstruct = (target, wordBank, memo = {}) => {
    //base case
    if(target in memo) return memo[target];
    if(target === '') return 1;

    let totalCount = 0;

    for(let word of wordBank){
        if(target.indexOf(word) === 0){
            const numWaysForResolve = canConstruct(target.slice(word.length), wordBank, memo);;
            totalCount += numWaysForResolve;
        }
    }

    memo[target] = totalCount;
    return totalCount;    
};

console.log(canConstruct("hola", ["ho", "la"]));
console.log(canConstruct(
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", 
    ["eeeeeeeeeeeeeeeeeeeeea",
     "eeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"]));