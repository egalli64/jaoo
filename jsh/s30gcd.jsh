/*
	Greatest Common Divisor
 */

// recursive
int gcd(int a, int b) {
	System.out.println(a + ", " + b);
    if(b == 0) {
        return a;
    }

    return gcd(b, a % b);
}


// iterative
int gcdIterative(int a, int b) {
	System.out.println(a + ", " + b);
	while(b != 0) {
		int temp = a;
		a = b;
		b = temp % a; 
		System.out.println(a + ", " + b);
	}
	return a;
}