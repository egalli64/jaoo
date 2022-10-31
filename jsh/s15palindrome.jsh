String s = "abba";
// indices  0123

boolean isPal = true;

for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
    if(s.charAt(i) != s.charAt(j)) {
        isPal = false;
        break;
    }
}

System.out.println(s + " is a palindrome? " + isPal);