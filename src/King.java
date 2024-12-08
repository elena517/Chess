public class King extends ChessPiece {

    public King(String color) {
        super(color);
    }


    @Override
    public String getColor() {
        return color;
    }


    @Override
    public String getSymbol() {
        return "K";
    }


    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine <= 7 && toLine >= 0 && toColumn <= 7 && toColumn >= 0 &&
                line <= 7 && line >= 0 && column <= 7 && column >= 0) {

            if (Math.abs(toLine - line) == 1 && column == toColumn ||
                    line == toLine && Math.abs(toColumn - column) == 1 ||
                    Math.abs(toLine - line) == 1 && Math.abs(toColumn - column) == 1 ) {
                return true;
            } else return false;
        } else return false;
    }



    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        if (line >= 0 && line <= 7 && column >= 0 && column <= 7) {
            for (int i = 0; i <= 7; i++) {
                for (int j = 0; j <= 7; j++) {
                    if (board.board[i][j] != null) {
                        if (!board.board[i][j].getColor().equals(color) && board.board[i][j].canMoveToPosition(board, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
    }
}
