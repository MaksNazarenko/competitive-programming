package com.maksnazarenko.subrectangle_queries;

/*
https://leetcode.com/problems/subrectangle-queries/
 */
class SubrectangleQueries {
    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int currentRow = row1; currentRow <= row2; currentRow++) {
            for (int currentCol = col1; currentCol <= col2; currentCol++) {
                rectangle[currentRow][currentCol] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return this.rectangle[row][col];
    }
}

/**
 * Your SubrectangleQueries object will be instantiated and called as such:
 * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
 * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
 * int param_2 = obj.getValue(row,col);
 */