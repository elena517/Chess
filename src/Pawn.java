public class Pawn extends ChessPiece {

    public Pawn(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }


    @Override
    public String getSymbol() {
        return "P";
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (column != toColumn || toLine > 7 || toLine < 0 || toColumn > 7 || toColumn < 0) {
            return false;
        } else {
            if (color.equals("White")) {
               if (toLine - line == 1) {
                   return true;
               } else if (toLine - line == 2 && line == 1) {
                   return true;
               } else {
                   return false;
               }
            } else if (line - toLine == 1) {
                return true;
            } else if (line - toLine == 2 && line == 6) {
                return true;
            } else return false;
        }
    }
}
