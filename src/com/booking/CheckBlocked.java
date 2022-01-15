package com.booking;

public class CheckBlocked {

	 static char[][] board = new char[][]{
         {'E','W','W','W','W','W','W'},
         {'E','W','B','W','W','W','W'},
         {'E','W','B','W','W','B','W'},
         {'E','W','B','B','W','B','B'},
         {'E','W','W','B','B','W','W'},
         {'E','B','B','B','W','W','W'},
         {'E','W','W','W','B','W','W'},
         {'E','W','W','W','W','W','W'}
         
     };
    public static void main(String[] args){
        System.out.println(isCaptured(3, 2));
    }
   
	
	static boolean isCaptured(int x,int y){
		boolean[][] visited = new boolean[board.length][board[0].length];
        char currentState=getState(x,y);
        return isCaptured(x,y,currentState,visited);
    }
    
    static boolean isCaptured(int x, int y, char desired, boolean[][] visited){
		if( x < 0 || y<0 || x >= board.length || y >= board[0].length || visited[x][y])
    		return true;
        char current=getState(x,y);
        if(current== 'E'){
            return false;
        }
        if(current != desired){
            return true;
        }

        visited[x][y] = true;
        return isCaptured(x-1,y,desired,visited)&&
                isCaptured(x+1,y,desired,visited)&&
                isCaptured(x,y-1,desired,visited)&&
                isCaptured(x,y+1,desired,visited);
    }

	private static char getState(int x, int y) {
		// TODO Auto-generated method stub
		return board[x][y];
	}
}
