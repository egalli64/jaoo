// Run this script in the local JVM: jshell --execution local script.jsh

System.out.print("Pass me a (small) natural number: ");

Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();

int i = 1;
while(i <= n) {
	System.out.println(i);
	i += 1;
}

/exit