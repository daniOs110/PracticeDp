const canConstruct = (target, wordBank, memo = {}) => {
    //base case
    if(target in memo) return memo[target];
    if(target === '') return true

    for(let word of wordBank){
        if(target.indexOf(word) === 0){
            const suffix = target.slice(word.length);
            if(canConstruct(suffix, wordBank, memo) === true){
                memo[target] = true;
                return memo[target];
            }
        }
    }
    memo[target] = false;
    return memo[target];
}

console.log(canConstruct("hola", ["ho", "la"]));
console.log(canConstruct(
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", 
    ["eeeeeeeeeeeeeeeeeeeeea",
     "eeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"]));
