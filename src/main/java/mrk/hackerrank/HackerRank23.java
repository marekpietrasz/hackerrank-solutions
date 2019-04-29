package mrk.hackerrank;

public class HackerRank23 {
    private static final int[][] MAGIC_SQUARE = new int[][]{new int[]{4, 9, 2}, new int[]{3, 5, 7}, new int[]{8, 1, 6}};

    public int formingMagicSquare(int[][] s) {
        int result = Math.min(diff(s), diff(mirror(s)));
        for (int i = 0; i < 3; i++) {
            s = rotateCW(s);
            int newDiff1 = diff(s);
            int newDiff2 = diff(mirror(s));
            result = Math.min(Math.min(newDiff1, newDiff2), result);
        }
        return result;
    }

    private int diff(int[][] square) {
        int result = 0;
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                result += Math.abs(square[i][j] - MAGIC_SQUARE[i][j]);
            }
        }
        System.out.println(result);
        return result;
    }

    private int[][] mirror(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[r][c] = mat[r][N - c - 1];
            }
        }
        return ret;
    }

    private int[][] rotateCW(int[][] mat) {
        final int M = mat.length;
        final int N = mat[0].length;
        int[][] ret = new int[N][M];
        for (int r = 0; r < M; r++) {
            for (int c = 0; c < N; c++) {
                ret[c][M - 1 - r] = mat[r][c];
            }
        }
        return ret;
    }
}
