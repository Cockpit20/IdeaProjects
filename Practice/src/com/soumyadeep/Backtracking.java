package com.soumyadeep;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//
//        pathsWithDiagonal("",3,3);

        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        pathsWithObstacles("",board,0,0);

        allPaths("",board,0,0,new int[board.length][board[0].length],1);
    }

    static int count(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);
        return left+right;

    }

    static void paths(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            paths(p+"D",row-1,col);
        }

        if(col>1){
            paths(p+"R",row,col-1);
        }
    }

    static void pathsWithDiagonal(String p,int row,int col){
        if(row==1 && col==1){
            System.out.print(p+" ");
            return;
        }
        if(row>1){
            pathsWithDiagonal(p+"D",row-1,col);
        }

        if(col>1){
            pathsWithDiagonal(p+"R",row,col-1);
        }

        if(row>1 && col>1){
            pathsWithDiagonal(p+"X",row-1,col-1);
        }
    }

    static void pathsWithObstacles(String p,boolean[][] maze,int row,int col){
        if(row== maze.length-1 && col== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col])
            return;
        if(row< maze.length-1){
            pathsWithObstacles(p+"D",maze,row+1,col);
        }

        if(col< maze[0].length-1){
            pathsWithObstacles(p+"R",maze,row,col+1);
        }
    }

    static void allPaths(String p,boolean[][] maze,int row,int col,int[][] paths,int steps){
        if(row== maze.length-1 && col==maze[0].length-1){
            paths[row][col]=steps;
            for(int[] arr:paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;
        paths[row][col]=steps;
        if(row<maze.length-1){
            allPaths(p+"D",maze,row+1,col,paths,steps+1);
        }
        if(col<maze[0].length-1){
            allPaths(p+"R",maze,row,col+1,paths,steps+1);
        }
        if(row>0){
            allPaths(p+"U",maze,row-1,col,paths,steps+1);
        }
        if(col>0){
            allPaths(p+"L",maze,row,col-1,paths,steps+1);
        }
        maze[row][col]=true;
        paths[row][col]=0;
    }

}

