int count = 0;

int triple(int base) {
    count += 1;
    return base * 3;
}

void caller() {
    int value = 12;
    int result = triple(value);
    System.out.println(value + " ---> " + result);
}

void f() {
    count = triple(27);
    System.out.println(count);
}

void hello() {
    System.out.println("Hello! ... " + count);
}