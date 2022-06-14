int[] data = { 1, 42, 13, 3, 45, 2 };

int result = data[0];
for(int i = 1; i < data.length; i++) {
	result += data[i];
}

System.out.println("Sum of array is " + result);