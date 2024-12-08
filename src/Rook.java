public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }


    @Override
    public String getSymbol() {
        return "R";
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0 &&
                line <= 7 && line >= 0 && column <= 7 && column >= 0) {
            if (line != toLine && column == toColumn || line == toLine && column != toColumn) {
                return true;
            } else return false;
        } else return false;
    }
}