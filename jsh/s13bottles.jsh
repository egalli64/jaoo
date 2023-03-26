// Run this script in the local JVM: jshell --execution local script.jsh

int n = 1;

System.out.print("Are there 6 fresh eggs? [y/n]: ");
Scanner scanner = new Scanner(System.in);
String next = scanner.next();

char c = next == null || next.isEmpty() ? 'y' : Character.toLowerCase(next.charAt(0));
if(c == 'y') {
	n = 6;
}

System.out.println("Buy " + n + " milk bottle(s)");

/exit
