int[] data = { 4, 5, 1, 8, 2 };
System.out.println("The array: " + java.util.Arrays.toString(data));

// repeat n-1 times
for(int i = 0; i < data.length - 1; i++) {
    // compare the neighbors, and swap if required
    for(int j = 0; j < data.length - 1; j++) {
        if(data[j] > data[j+1]) {
            int temp = data[j];
            data[j] = data[j+1];
            data[j+1] = temp;
        }
    }
}

System.out.println("The sorted array: " + java.util.Arrays.toString(data));
