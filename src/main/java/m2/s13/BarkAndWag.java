package m2.s13;

interface BarkAndWag extends Barker {
    int DEFAULT_WAG_COUNT = 3;

    String wag();
}