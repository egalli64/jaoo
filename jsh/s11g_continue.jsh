for(int i = 0; i < 20; i++) {
	System.out.print("[");
	if(i < 3 || i > 16) {
		System.out.print(" ? ] ");
		continue;
	}
	System.out.print(i + "] ");
}
System.out.println();