package com.soumyadeep;

import java.util.ArrayList;
import java.util.Arrays;

public class Tests {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        paths("",3,3);
//        System.out.println(pathsList("",3,3));
//        System.out.println(pathsListDiagonal("",3,3));
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        pathsWithObstacles("",board,0,0);
        allPathsPrint("",board,0,0,new int[board.length][board[0].length],1);

    }

    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }

    static void paths(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+"D",r-1,c);
        }
        if(c>1){
            paths(p+"R",r,c-1);
        }
    }

    static ArrayList<String> pathsList(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        if(r>1){
            ans.addAll(pathsList(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(pathsList(p+"R",r,c-1));
        }
        return ans;
    }

    static ArrayList<String> pathsListDiagonal(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        if(r>1){
            ans.addAll(pathsListDiagonal(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(pathsListDiagonal(p+"R",r,c-1));
        }
        if(r>1 && c>1){
            ans.addAll(pathsListDiagonal(p+"X",r-1,c-1));
        }
        return ans;
    }

    static void pathsWithObstacles(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            pathsWithObstacles(p+"D",maze,r+1,c);
        }
        if(c< maze[0].length-1){
            pathsWithObstacles(p+"R",maze,r,c+1);
        }
    }

    static void allPaths(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c== maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r< maze.length-1){
            allPaths(p+"D",maze,r+1,c);
        }
        if(c< maze[0].length-1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPaths(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPaths(p+"L",maze,r,c-1);
        }
        maze[r][c]=true;
    }

    static void allPathsPrint(String p,boolean[][] maze,int r,int c,int[][] path,int steps){
        if(r== maze.length-1 && c== maze[0].length-1){
            path[r][c]=steps;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=steps;
        if(r< maze.length-1){
            allPathsPrint(p+"D",maze,r+1,c,path,steps+1);
        }
        if(c< maze[0].length-1){
            allPathsPrint(p+"R",maze,r,c+1,path,steps+1);
        }
        if(r>0){
            allPathsPrint(p+"U",maze,r-1,c,path,steps+1);
        }
        if(c>0){
            allPathsPrint(p+"L",maze,r,c-1,path,steps+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
