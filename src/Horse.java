public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }


    @Override
    public String getSymbol() {
        return "H";
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0) {
            if ((Math.abs(line - toLine) == 1) && (Math.abs(column - toColumn) == 2) ||
                (Math.abs(line - toLine) == 2) && (Math.abs(column - toColumn) == 1)) {
                return true;
            } else { return false; }
        } else { return false; }
    }
}

