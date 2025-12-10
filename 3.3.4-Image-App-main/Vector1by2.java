
public class Vector1by2 {

    private int row;
    private int col;

    public Vector1by2(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Vector1by2 add(Vector1by2 other) {
        return new Vector1by2(this.row + other.row, this.col + other.col);
    }

    public boolean inBounds(int maxRows, int maxCols) {
        return row >= 0 && row < maxRows
                && col >= 0 && col < maxCols;
    }
}
