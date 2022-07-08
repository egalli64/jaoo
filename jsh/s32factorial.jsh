// recursive
int fact(int n) {
    if(n < 2) {
        return 1;
    }

    return n * fact(n-1);
}

// iterative
int factIterative(int n) {
    int result = 1;

    for(int i = 2; i <= n; i++) {
        result *= i;
    }
    
    return result;
}