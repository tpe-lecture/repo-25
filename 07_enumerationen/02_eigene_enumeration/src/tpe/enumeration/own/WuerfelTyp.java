package tpe.enumeration.own;

public enum WuerfelTyp {
    D4(4), D6(6), D8(8), D10(10), D12(12);

    private int wuerfelSeiten;

    private WuerfelTyp(int wuerfelSeiten) {
        this.wuerfelSeiten = wuerfelSeiten;
    }

    public int getSeiten() {
        return wuerfelSeiten;
    }

    public int average() {
        return (wuerfelSeiten + 1) / 2;
    }
}
