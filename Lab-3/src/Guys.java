
public enum Guys {
    Human ("Human"),
    Thing ("Thing");

    private final String Type;
    Guys(String t) {
        Type = t;
    }

    @Override
    public String toString() {
        return Type;
    }
}