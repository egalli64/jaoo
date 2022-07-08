String[] data = { "hello", "welcome", "hi", "goodbye", "ciao" };

java.util.Arrays.sort(data, (a, b) -> b.length() - a.length());


// java.util.Arrays.sort(data);
System.out.println(java.util.Arrays.toString(data));


int[] array = {10,12,33};

int sum = 0;
for(int i = 0; i < array.length; i++) {
    sum += array[i];
}

int recursiveSum(int[] a, int begin, int end) {
    if(begin == end) {
        return 0;
    } else {
        return a[begin] + recursiveSum(a, begin + 1, end);
    }
}

int result = recursiveSum(array, 0, 3);

int sum(int[] a, int begin, int end) {
    return begin == end ? 0 : a[begin] + sum(a, begin + 1, end);
}
