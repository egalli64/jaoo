int[] data = { 4, 5, 1, 8, 2 };
System.out.println("The array: " + java.util.Arrays.toString(data));

// for each position (but the last one)
for(int i = 0; i < data.length - 1; i++) {
    // find the position of the smallest element to the right
    int pos = i;
    for(int j = i; j < data.length; j++) {
        if(data[j] < data[pos]) {
            pos = j;
        }
    }

    // swap current and minimal elements
    int temp = data[i];
    data[i] = data[pos];
    data[pos] = temp;
}

System.out.println("The sorted array: " + java.util.Arrays.toString(data));
