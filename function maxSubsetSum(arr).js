function maxSubsetSum(arr) {
    if (arr.length === 0) return 0;
    if (arr.length === 1) return Math.max(0, arr[0]);

    // Initialize dp array
    const dp = new Array(arr.length).fill(0);

    // Base cases
    dp[0] = Math.max(0, arr[0]);
    dp[1] = Math.max(dp[0], arr[1]);

    // Fill dp array
    for (let i = 2; i < arr.length; i++) {
        dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
    }

    return dp[arr.length - 1];
}
