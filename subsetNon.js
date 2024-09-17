const backTrack = (start, currentSubset, array, memo) => {
    //base case
    if(start >= array.length){
        const sum = currentSubset.reduce((acc, num) => acc + num, 0);
        console.log(`Subconjunto: ${currentSubset}, Suma: ${sum}`);

        memo.push(sum);
        return;
    }

    for(let i=start; i < array.length; i++){
        //console.log(array[i]);
        currentSubset.push(array[i]);
        //llamada recursiva
        backTrack(i+2, currentSubset, array, memo);

        currentSubset.pop();
    }
}

const findMaxSubsetSum = (array) => {
    //memoizacion
    const memo = [];

    //backtracking
    backTrack(0, [], array, memo);

    //return max sum
    const maxSum = Math.max(...memo);
    return maxSum;
}

//console.log(backTrack(0,[], [-2,1,3,-4,5]));
console.log(findMaxSubsetSum([-2,1,3,-4,5]))