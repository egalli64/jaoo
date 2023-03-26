// Run this script in the local JVM: jshell --execution local script.jsh

System.out.print("What's your name? ");

Scanner scanner = new Scanner(System.in);
String next = scanner.next();

String message = "Hello, ";

if(next.equals("Tom")) {
	message += next;
} else {
	message += "stranger";
}

System.out.println(message);

/exit