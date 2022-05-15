package com.soumyadeep;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(count(3,3));
        paths("",3,3);
        System.out.println(pathsList("",3,3));
        System.out.println(pathsListDiagonal("",3,3));

        boolean[][] board={
            {true,true,true},
            {true,true,false},
            {true,true,true}
        };
        pathsWithObstacle("",board,0,0);
    }

    static int count(int r,int c){
        if(r==1||c==1)
            return 1;
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }

    static  void paths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            paths(p+'D',r-1,c);
        }
        if(c>1){
            paths(p+'R',r,c-1);
        }
    }

    static ArrayList<String> pathsList(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        if(r>1){
            ArrayList<String> left=pathsList(p+'D',r-1,c);
            ans.addAll(left);
        }
        if(c>1){
            ArrayList<String> right= pathsList(p+'R',r,c-1);
            ans.addAll(right);
        }
        return ans;
    }

    static ArrayList<String> pathsListDiagonal(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        if(r>1){
            ArrayList<String> left=pathsListDiagonal(p+'V',r-1,c);
            ans.addAll(left);
        }
        if(c>1){
            ArrayList<String> right= pathsListDiagonal(p+'H',r,c-1);
            ans.addAll(right);
        }
        if(r>1 && c>1){
            ArrayList<String> diagonal= pathsListDiagonal(p+'D',r-1,c-1);
            ans.addAll(diagonal);
        }
        return ans;
    }

    static  void pathsWithObstacle(String p,boolean[][] maze,int r,int c){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            pathsWithObstacle(p+'D',maze,r+1,c);
        }
        if(c< maze[0].length-1){
            pathsWithObstacle(p+'R',maze,r,c+1);
        }
    }


}
