// Run this script in the local JVM: jshell --execution local script.jsh

int n = 1;

System.out.print("Are there 6 fresh eggs? [y/n]: ");
Scanner scanner = new Scanner(System.in);
String next = scanner.next();

char c = next == null || next.isEmpty() ? 'y' : Character.toLowerCase(next.charAt(0));
if(c == 'y') {
	System.out.println("Buy 6 fresh eggs");
}

System.out.println("Buy " + n + " milk bottle(s)");

/exit
