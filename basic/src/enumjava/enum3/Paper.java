package enumjava.enum3;


public enum Paper {
    A1(594, 841),
    A2(420, 594),
    A3(297, 420),
    A4(210, 297),
    A5(148, 210);


    private int width;
    private int length;

    Paper(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
