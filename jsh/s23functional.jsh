String[] data = { "hello", "welcome", "hi", "goodbye", "ciao" };

java.util.Arrays.sort(data, (a, b) -> a.length() - b.length());
System.out.println(java.util.Arrays.toString(data));
