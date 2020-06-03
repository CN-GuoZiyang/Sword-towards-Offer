import java.util.LinkedList;
import java.util.Queue;

public class MovementRangeOfRobot {

    class Entry {
        int row;
        int col;
        public Entry(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int movingCount(int threshold, int rows, int cols) {
        int count = 0;
        boolean[][] added = new boolean[rows][cols];
        Queue<Entry> queue = new LinkedList<>();
        queue.add(new Entry(0, 0));
        added[0][0] = true;
        while(!queue.isEmpty()) {
            Entry entry = queue.poll();
            if(countSum(entry) <= threshold) {
                count ++;
                int row = entry.row;
                int col = entry.col;
                if(row != 0 && !added[row-1][col]) {
                    queue.add(new Entry(row-1, col));
                    added[row-1][col] = true;
                }
                if (row != rows-1 && !added[row+1][col]) {
                    queue.add(new Entry(row+1, col));
                    added[row+1][col] = true;
                }
                if(col != 0 && !added[row][col-1]) {
                    queue.add(new Entry(row, col-1));
                    added[row][col-1] = true;
                }
                if(col != cols-1 && !added[row][col+1]) {
                    queue.add(new Entry(row, col+1));
                    added[row][col+1] = true;
                }
            }
        }
        return count;
    }

    private int countSum(Entry entry) {
        int row = entry.row;
        int col = entry.col;
        int sum = 0;
        while(row != 0) {
            sum += (row%10);
            row /= 10;
        }
        while(col != 0) {
            sum += (col%10);
            col /= 10;
        }
        return sum;
    }

}
