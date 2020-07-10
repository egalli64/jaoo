package m1ex;

import java.util.Arrays;

public class SinkThem {
    static public final char SHIP = 'S';
    static public final char WRECK = 'W';
    static public final char MISS = 'M';
    static public final char EMPTY = '_';
    static public final char UNKNOWN = '?';

    static public final int POINTS_FOR_SINK = 5;
    static public final int POINTS_FOR_MISS = 1;

    /** the battlefield */
    private char[][] board;
    /** ships on board */
    private int counter;
    /** current player score */
    private int points;

    /**
     * Create the squared board game filled with EMPTY cells
     * 
     * @param dimension board size
     */
    public SinkThem(int dimension) {
        // TODO
        board = new char[0][0];
    }

    /**
     * @return the current score
     */
    public int getPoints() {
        return points;
    }

    /**
     * @return true if no more ships
     */
    public boolean done() {
        return counter == 0;
    }

    /**
     * The board is a square
     * 
     * @return board size
     */
    public int getBoardSize() {
        return board.length;
    }

    /**
     * A user representation for the board
     * 
     * Only MISS and WRECK should be shown
     * 
     * UNKWNOWN should hide EMPTY and SHIP
     * 
     * @return a string
     */
    public String getBoard() {
        // TODO
        return "* * *\n* * *\n* * *\n";
    }

    /**
     * Place a ship on the board
     * 
     * @param row
     * @param col
     * @return false if it can't be placed
     */
    public boolean place(int row, int col) {
        // TODO
        return false;
    }

    /**
     * Shoot to a cell
     * 
     * a miss would cost POINTS_FOR_MISS, a center would give POINTS_FOR_SINK
     * 
     * @param row
     * @param col
     * @return true for a sink
     */
    public boolean shoot(int row, int col) {
        // TODO
        return false;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(board);
    }

    /**
     * Apply a simple strategy to the game
     * 
     * @param st the game
     */
    public static void shootAll(SinkThem st) {
        for (int i = 0; i < st.getBoardSize(); i++) {
            for (int j = 0; j < st.getBoardSize(); j++) {
                System.out.println(st.getBoard());
                if (st.shoot(i, j)) {
                    System.out.println("Hit!");
                    if (st.done()) {
                        System.out.println("You win!");
                        return;
                    }
                } else {
                    System.out.println("Miss ...");
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO: use Scanner for user interaction

        // TODO: let the player choose for a (sensible) board size
        SinkThem st = new SinkThem(10);

        // TODO: place the ships randomly instead
        st.place(0, 2);
        st.place(1, 1);
        st.place(2, 0);

        // TODO: use Scanner instead
        shootAll(st);

        System.out.println(st);
        System.out.println("You scored " + st.getPoints());
    }
}
