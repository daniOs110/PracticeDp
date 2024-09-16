const countConstruct = (target, wordBank) => {
    const table = Array(target.length + 1).fill(0);
    table[0] = 1;

    for(let i = 0; i <= target.length; i++){
        for(let word of wordBank){
            if(target.slice(i, i+word.length) === word){
                table[i + word.length] += table[i];
            }
        }
    }

    return table[target.length];
};

console.log(countConstruct("hola", ["ho", "la"]));
console.log(countConstruct(
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", 
    ["eeeeeeeeeeeeeeeeeeeeea",
     "eeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
    "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee",
    "ee"]));