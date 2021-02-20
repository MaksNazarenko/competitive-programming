package com.maksnazarenko.subrectangle_queries;

public class Test {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        int[][] rectangle = {{1,2,1},{4,3,4},{3,2,1},{1,1,1}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);

        System.out.println("Test 1");
        System.out.println("---");
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");

        subrectangleQueries.updateSubrectangle(0,0,3,2,5);
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");

        subrectangleQueries.updateSubrectangle(3,0,3,2,10);
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");
    }

    public static void test2() {
        int[][] rectangle = {{3,9,4},{5,6,10}};
        SubrectangleQueries subrectangleQueries = new SubrectangleQueries(rectangle);

        System.out.println("Test 2");
        System.out.println("---");
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");

        subrectangleQueries.updateSubrectangle(1,1,1,1,5);
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");

        subrectangleQueries.updateSubrectangle(0,0,1,0,6);
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(subrectangleQueries.getValue(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("---");
    }
}
