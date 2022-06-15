int triple(int base) {
    return base * 3;
}

void caller() {
    int value = 12;
    int result = triple(value);
    System.out.println(result);
}