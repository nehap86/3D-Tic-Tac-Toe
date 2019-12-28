import java.util.*;
public class aiTicTacToe {

	public int player; //1 for player 1 and 2 for player 2
	private int getStateOfPositionFromBoard(positionTicTacToe position, List<positionTicTacToe> board)
	{
		//a helper function to get state of a certain position in the Tic-Tac-Toe board by given position TicTacToe
		int index = position.x*16+position.y*4+position.z;
		return board.get(index).state;
	}
	

	  public int evaluateboard(List<positionTicTacToe> board) {
		  
		  //I am not sure if we should use deep or shallow copy 
		  int score =0;
		  
		//48 straight winning lines
		  score += evaluateLine(0, 0, 0,    0, 1, 0,    0, 2, 0,    0,3,0,board);
		  score += evaluateLine(1, 0, 0,    1, 1, 0,    1, 2, 0,    1,3,0,board);
		  score += evaluateLine(2, 0, 0,    2, 1, 0,    2, 2, 0,    2,3,0,board);
		  score += evaluateLine(3, 0, 0,    3, 1, 0,    3, 2, 0,    3,3,0,board);
		  
		  
		  score += evaluateLine(0, 0, 0,    1, 0, 0,    2, 0, 0,    3,0,0,board);
		  score += evaluateLine(0, 1, 0,    1, 1, 0,    2, 1, 0,    3,1,0,board);
		  score += evaluateLine(0, 2, 0,    1, 2, 0,    2, 2, 0,    3,2,0,board);
		  score += evaluateLine(0, 3, 0,    1, 3, 0,    2, 3, 0,    3,3,0,board);		  
		 //-------------------------------------------------------------------/
		  score += evaluateLine(0, 0, 1,    0, 1, 1,    0, 2, 1,    0,3,1,board);
		  score += evaluateLine(1, 0, 1,    1, 1, 1,    1, 2, 1,    1,3,1,board);
		  score += evaluateLine(2, 0, 1,    2, 1, 1,    2, 2, 1,    2,3,1,board);
		  score += evaluateLine(3, 0, 1,    3, 1, 1,    3, 2, 1,    3,3,1,board);
		  
		  
		  score += evaluateLine(0, 0, 1,    1, 0, 1,    2, 0, 1,    3,0,1,board);
		  score += evaluateLine(0, 1, 1,    1, 1, 1,    2, 1, 1,    3,1,1,board);
		  score += evaluateLine(0, 2, 1,    1, 2, 1,    2, 2, 1,    3,2,1,board);
		  score += evaluateLine(0, 3, 1,    1, 3, 1,    2, 3, 1,    3,3,1,board);
		  //-------------------------------------------------------------------/

		  score += evaluateLine(0, 0, 2,    0, 1, 2,    0, 2, 2,    0,3,2,board);
		  score += evaluateLine(1, 0, 2,    1, 1, 2,    1, 2, 2,    1,3,2,board);
		  score += evaluateLine(2, 0, 2,    2, 1, 2,    2, 2, 2,    2,3,2,board);
		  score += evaluateLine(3, 0, 2,    3, 1, 2,    3, 2, 2,    3,3,2,board);
		  
		  
		  score += evaluateLine(0, 0, 2,    1, 0, 2,    2, 0, 2,    3,0,2,board);
		  score += evaluateLine(0, 1, 2,    1, 1, 2,    2, 1, 2,    3,1,2,board);
		  score += evaluateLine(0, 2, 2,    1, 2, 2,    2, 2, 2,    3,2,2,board);
		  score += evaluateLine(0, 3, 2,    1, 3, 2,    2, 3, 2,    3,3,2,board);
		  
		  
		//-------------------------------------------------------------------/
		  
		  score += evaluateLine(0, 0, 3,    0, 1, 3,    0, 2, 3,    0,3,3,board);
		  score += evaluateLine(1, 0, 3,    1, 1, 3,    1, 2, 3,    1,3,3,board);
		  score += evaluateLine(2, 0, 3,    2, 1, 3,    2, 2, 3,    2,3,3,board);
		  score += evaluateLine(3, 0, 3,    3, 1, 3,    3, 2, 3,    3,3,3,board);
		  
		  
		  score += evaluateLine(0, 0, 3,    1, 0, 3,    2, 0, 3,    3,0,3,board);
		  score += evaluateLine(0, 1, 3,    1, 1, 3,    2, 1, 3,    3,1,3,board);
		  score += evaluateLine(0, 2, 3,    1, 2, 3,    2, 2, 3,    3,2,3,board);
		  score += evaluateLine(0, 3, 3,    1, 3, 3,    2, 3, 3,    3,3,3,board);
		  
			//-------------------------------------------------------------------/
		  
		  score += evaluateLine(0, 0, 0,    0, 0, 1,    0, 0, 2,    0,0,3,board);
		  score += evaluateLine(1, 0, 0,    1, 0, 1,    1, 0, 2,    1,0,3,board);
		  score += evaluateLine(2, 0, 0,    2, 0, 1,    2, 0, 2,    2,0,3,board);
		  score += evaluateLine(3, 0, 0,    3, 0, 1,    3, 0, 2,    3,0,3,board);
		  
		  
		  score += evaluateLine(0, 1, 0,    0, 1, 1,    0, 1, 2,    0,1,3,board);
		  score += evaluateLine(1, 1, 0,    1, 1, 1,    1, 1, 2,    1,1,3,board);
		  score += evaluateLine(2, 1, 0,    2, 1, 1,    2, 1, 2,    2,1,3,board);
		  score += evaluateLine(3, 1, 0,    3, 1, 1,    3, 1, 2,    3,1,3,board);
		  
		  
		  score += evaluateLine(0, 2, 0,    0, 2, 1,    0, 2, 2,    0,2,3,board);
		  score += evaluateLine(1, 2, 0,    1, 2, 1,    1, 2, 2,    1,2,3,board);
		  score += evaluateLine(2, 2, 0,    2, 2, 1,    2, 2, 2,    2,2,3,board);
		  score += evaluateLine(3, 2, 0,    3, 2, 1,    3, 2, 2,    3,2,3,board);
		  
		  
		  
		  score += evaluateLine(0, 3, 0,    0, 3, 1,    0, 3, 2,    0,3,3,board);
		  score += evaluateLine(1, 3, 0,    1, 3, 1,    1, 3, 2,    1,3,3,board);
		  score += evaluateLine(2, 3, 0,    2, 3, 1,    2, 3, 2,    2,3,3,board);
		  score += evaluateLine(3, 3, 0,    3, 3, 1,    3, 3, 2,    3,3,3,board);
		  
		  
			//diagonal winning lines
		  
		  score += evaluateLine(0, 0, 0,    1, 1, 0,    2, 2, 0,    3,3,0,board);
		  score += evaluateLine(0, 0, 1,    1, 1, 1,    2, 2, 1,    3,3,1,board);
		  score += evaluateLine(0, 0, 2,    1, 1, 2,    2, 2, 2,    3,3,2,board);
		  score += evaluateLine(0, 0, 3,    1, 1, 3,    2, 2, 3,    3,3,3,board);
		  
		  
		  score += evaluateLine(0, 3, 0,    1, 2, 0,    2, 1, 0,    0,0,0,board);
		  score += evaluateLine(0, 3, 1,    1, 2, 1,    2, 1, 1,    0,0,1,board);
		  score += evaluateLine(0, 3, 2,    1, 2, 2,    2, 1, 2,    0,0,2,board);
		  score += evaluateLine(0, 3, 3,    1, 2, 3,    2, 1, 3,    0,0,3,board);
		 /*******************/
		  score += evaluateLine(0, 0, 0,    0, 1, 1,    0, 2, 2,    0,3,3,board);
		  score += evaluateLine(1, 0, 0,    1, 1, 1,    1, 2, 2,    1,3,3,board);
		  score += evaluateLine(2, 0, 0,    2, 1, 1,    2, 2, 2,    2,3,3,board);
		  score += evaluateLine(2, 0, 0,    3, 1, 1,    3, 2, 2,    3,3,3,board);

		  score += evaluateLine(0, 0, 3,    0, 1, 2,    0, 2, 1,    0,1,1,board);
		  score += evaluateLine(1, 0, 3,    1, 1, 2,    1, 2, 1,    1,1,1,board);
		  score += evaluateLine(2, 0, 3,    2, 1, 2,    2, 2, 1,    2,1,1,board);
		  score += evaluateLine(3, 0, 3,    3, 1, 2,    3, 2, 1,    3,1,1,board);

		  score += evaluateLine(0, 0, 0,    1, 0, 1,    2, 0, 2,    3,0,3,board);
		  score += evaluateLine(0, 1, 0,    1, 1, 1,    2, 1, 2,    3,1,3,board);
		  score += evaluateLine(0, 2, 0,    1, 2, 1,    2, 2, 2,    3,2,3,board);
		  score += evaluateLine(0, 3, 0,    1, 3, 1,    2, 3, 2,    3,3,3,board);

		  score += evaluateLine(0, 0, 3,    1, 0, 2,    2, 0, 1,    3,0,0,board);
		  score += evaluateLine(0, 1, 3,    1, 1, 2,    2, 1, 1,    3,1,0,board);
		  score += evaluateLine(0, 2, 3,    1, 2, 2,    2, 2, 1,    3,2,0,board);
		  score += evaluateLine(0, 3, 3,    1, 3, 2,    2, 3, 1,    3,3,0,board);
		  
		  // 4 special line
		  
		  
		  score += evaluateLine(0,0,0,1,1,1,2,2,2,3,3,3,board);
		  score += evaluateLine(0,0,3,1,1,2,2,2,1,3,3,0,board);
		  score += evaluateLine(3,0,0,2,1,1,1,2,2,0,3,3,board);
		  score += evaluateLine(0,3,0,1,2,1,2,1,2,3,0,3,board);
		  
		  return score;
	  }
	  
	  private int evaluateLine(int row1, int col1,int hei1, int row2, int col2, int hei2,int row3, int col3,int hei3, int row4, int col4,int hei4, List<positionTicTacToe> board) {
		    int state0 = getStateOfPositionFromBoard(new positionTicTacToe(row1,col1,hei1),board);
			int state1 = getStateOfPositionFromBoard(new positionTicTacToe(row2,col2,hei2),board);
			int state2 = getStateOfPositionFromBoard(new positionTicTacToe(row3,col3,hei3),board);
			int state3 = getStateOfPositionFromBoard(new positionTicTacToe(row4,col4,hei4),board);




			//Wining 
			if(state0==state1&&state1==state2&&state2==state3){
				if(state0==1) {
					return 9999;
				}
				if(state0==2) {
					return -9999;
				}
				else {
					return 0;
				}
			}
			//Three on the line
			if((state0==state1&&state1==state2)||(state0==state1&&state1==state3)||(state0==state2&&state2==state3)) {
				if(state0==1) {
					return 100;
				}
				if(state0==2) {
					return -100;
				}
				else {
					return 0;
				}
			}
			if(state1==state2&&state2==state3) {
				if(state1==1) {
					return 100;
				}
				if(state1==2) {
					return -100;
				}
				else {
					return 0;
				}
			}
			//two player 1 two player 2 return 0
			if(state0==state1&&state2==state3&&state0!=0&&state2!=0) {
				return 0;
			}
			if(state0==state3&&state1==state2&&state0!=0&&state1!=0) {
				return 0;
			}
			if(state0==state2&&state1==state3&&state0!=0&&state1!=0) {
				return 0;
			}
			
			//two in a line
			if(state0==state1&&state1!=0) {
				if(state0==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			if(state0==state2&&state0!=0) {
				if(state0==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			if(state0==state1&&state3!=0) {
				if(state0==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			if(state1==state2&&state1!=0) {
				if(state1==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			if(state1==state3&&state1!=0) {
				if(state1==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			if(state2==state3&&state2!=0) {
				if(state2==1) {
					return 10;
				}
				else {
					return -10;
				}
			}
			
		// only one in a line			
		if(state0==state1&&state1==state2) {
			if(state3==1) {
				return 1;
			}
			return -1;
		}
		if(state0==state1&&state1==state3) {
			if(state2==1) {
				return 1;
			}
			return -1;
		}
		if(state0==state2&&state3==state2) {
			if(state1==1) {
				return 1;
			}
			return -1;
		}
		if(state1==state2&&state3==state2) {
			if(state0==1) {
				return 1;
			}
			return -1;
		}

		  return 1;
	  }
	  
	  //minimax for player 2
		public int minimax2(positionTicTacToe move, int depth,int alpha, int beta, int maximizingPlayer, List<positionTicTacToe> board) {
			if(depth==0) {
				return evaluateboard(board);
			}
			int value;
			if(maximizingPlayer==2) {
				value = Integer.MIN_VALUE;
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						for(int k=0;k<4;k++) {
							positionTicTacToe myNextMove = new positionTicTacToe(i,j,k);
							if(getStateOfPositionFromBoard(myNextMove,board)==0) {
								List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
								makeMove(myNextMove,1,newboard);
								int res =minimax(myNextMove,depth-1,alpha,beta,1,newboard);
								value = Math.max(res, value);
								alpha = Math.max(alpha,value);
								if(alpha>=beta) {
									break;
								}

							}
						}
					}
				}
				
			}
			else {
				value = Integer.MAX_VALUE;
				for(int i=0;i<4;i++) {
					for(int j=0;j<4;j++) {
						for(int k=0;k<4;k++) {
							positionTicTacToe myNextMove = new positionTicTacToe(i,j,k);
							if(getStateOfPositionFromBoard(myNextMove,board)==0) {
								List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
								makeMove(myNextMove,2,newboard);
								int res =minimax(myNextMove,depth-1,alpha,beta,2,newboard);
								value = Math.min(res, value);
								beta = Math.min(beta,value);
								if(alpha>=beta) {
									break;
								}

							}
						}
					}
				}
				
			}
			return value;
			}
	 
	//minimax for player1
	public int minimax(positionTicTacToe move, int depth,int alpha, int beta, int maximizingPlayer, List<positionTicTacToe> board) {
		if(depth==0) {
			return evaluateboard(board);
		}
		int value;
		if(maximizingPlayer==1) {
			value = Integer.MIN_VALUE;
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					for(int k=0;k<4;k++) {
						positionTicTacToe myNextMove = new positionTicTacToe(i,j,k);
						if(getStateOfPositionFromBoard(myNextMove,board)==0) {
							List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
							makeMove(myNextMove,1,newboard);
							int res =minimax(myNextMove,depth-1,alpha,beta,2,newboard);
							value = Math.max(res, value);
							alpha = Math.max(alpha,value);
							if(alpha>=beta) {
								break;
							}

						}
					}
				}
			}
			
		}
		else {
			value = Integer.MAX_VALUE;
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					for(int k=0;k<4;k++) {
						positionTicTacToe myNextMove = new positionTicTacToe(i,j,k);
						if(getStateOfPositionFromBoard(myNextMove,board)==0) {
							List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
							makeMove(myNextMove,2,newboard);
							int res =minimax(myNextMove,depth-1,alpha,beta,1,newboard);
							value = Math.min(res, value);
							beta = Math.min(beta,value);
							if(alpha>=beta) {
								break;
							}

						}
					}
				}
			}
			
		}
		return value;
		}
		
	
	public boolean makeMove(positionTicTacToe position, int player, List<positionTicTacToe> targetBoard)
	{
		//make move on Tic-Tac-Toe board, given position and player 
		//player 1 = 1, player 2 = 2
		
		
		//brute force (obviously not a wise way though)
		for(int i=0;i<targetBoard.size();i++)
		{
			if(targetBoard.get(i).x==position.x && targetBoard.get(i).y==position.y && targetBoard.get(i).z==position.z) //if this is the position
			{
				if(targetBoard.get(i).state==0)
				{
					targetBoard.get(i).state = player;
					return true;
				}
				else
				{
					System.out.println("Error1");
				}
			}
			
		}
		return false;
	}
	private List<positionTicTacToe> deepCopyATicTacToeBoard(List<positionTicTacToe> board)
	{
		//deep copy of game boards
		List<positionTicTacToe> copiedBoard = new ArrayList<positionTicTacToe>();
		for(int i=0;i<board.size();i++)
		{
			copiedBoard.add(new positionTicTacToe(board.get(i).x,board.get(i).y,board.get(i).z,board.get(i).state));
		}
		return copiedBoard;
	}
	  
	//AI player 1
	public positionTicTacToe myAIAlgorithm(List<positionTicTacToe> board, int player)
	{
		//TODO: this is where you are going to implement your AI algorithm to win the game. The default is an AI randomly choose any available move.
		positionTicTacToe myNextMove = new positionTicTacToe(0,0,0);
		
		int maxres = Integer.MIN_VALUE;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					positionTicTacToe tem = new positionTicTacToe(i,j,k);
					if(getStateOfPositionFromBoard(tem,board)==0) {
						List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
						int value = minimax(myNextMove,3,Integer.MIN_VALUE,Integer.MAX_VALUE,1,newboard);
						if(value>maxres) {
							myNextMove = tem;
							maxres = value;
							
						}
						if(value==maxres) {
							Random rand = new Random();
							int x = rand.nextInt(2);
							if(x==1) {
								myNextMove = tem;
								maxres = value;
							}
						}
					}
				}
			}
		}

		System.out.println(myNextMove.x+myNextMove.y+myNextMove.z);
		return myNextMove;

	}
	
	//for AI player 2
	public positionTicTacToe myAIAlgorithm2(List<positionTicTacToe> board, int player)
	{
		//TODO: this is where you are going to implement your AI algorithm to win the game. The default is an AI randomly choose any available move.
		positionTicTacToe myNextMove = new positionTicTacToe(0,0,0);
		
		int maxres = Integer.MIN_VALUE;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				for(int k=0;k<4;k++) {
					positionTicTacToe tem = new positionTicTacToe(i,j,k);
					if(getStateOfPositionFromBoard(tem,board)==0) {
						List<positionTicTacToe> newboard = deepCopyATicTacToeBoard(board);
						int value = minimax2(myNextMove,3,Integer.MIN_VALUE,Integer.MAX_VALUE,2,newboard);
						if(value>maxres) {
							myNextMove = tem;
							maxres = value;
						}
						if(value==maxres) {
							Random rand = new Random();
							int x = rand.nextInt(2);
							if(x==1) {
								myNextMove = tem;
								maxres = value;
							}
						}
					}
				}
			}
		}

		System.out.println(myNextMove.x+myNextMove.y+myNextMove.z);
		return myNextMove;

	}
	
	public positionTicTacToe randommove(List<positionTicTacToe> board, int player)
	{
		//TODO: this is where you are going to implement your AI algorithm to win the game. The default is an AI randomly choose any available move.
		positionTicTacToe myNextMove = new positionTicTacToe(0,0,0);
		
		do
			{
				Random rand = new Random();
				int x = rand.nextInt(4);
				int y = rand.nextInt(4);
				int z = rand.nextInt(4);
				
				myNextMove = new positionTicTacToe(x,y,z);

			}while(getStateOfPositionFromBoard(myNextMove,board)!=0);
		
		return myNextMove;

	}
	
	
	private List<List<positionTicTacToe>> initializeWinningLines()
	{
		//create a list of winning line so that the game will "brute-force" check if a player satisfied any 	winning condition(s).
		List<List<positionTicTacToe>> winningLines = new ArrayList<List<positionTicTacToe>>();
		
		//48 straight winning lines
		//z axis winning lines
		for(int i = 0; i<4; i++)
			for(int j = 0; j<4;j++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(i,j,0,-1));
				oneWinCondtion.add(new positionTicTacToe(i,j,1,-1));
				oneWinCondtion.add(new positionTicTacToe(i,j,2,-1));
				oneWinCondtion.add(new positionTicTacToe(i,j,3,-1));
				winningLines.add(oneWinCondtion);
			}
		//y axis winning lines
		for(int i = 0; i<4; i++)
			for(int j = 0; j<4;j++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(i,0,j,-1));
				oneWinCondtion.add(new positionTicTacToe(i,1,j,-1));
				oneWinCondtion.add(new positionTicTacToe(i,2,j,-1));
				oneWinCondtion.add(new positionTicTacToe(i,3,j,-1));
				winningLines.add(oneWinCondtion);
			}
		//x axis winning lines
		for(int i = 0; i<4; i++)
			for(int j = 0; j<4;j++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(0,i,j,-1));
				oneWinCondtion.add(new positionTicTacToe(1,i,j,-1));
				oneWinCondtion.add(new positionTicTacToe(2,i,j,-1));
				oneWinCondtion.add(new positionTicTacToe(3,i,j,-1));
				winningLines.add(oneWinCondtion);
			}
		
		//12 main diagonal winning lines
		//xz plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(0,i,0,-1));
				oneWinCondtion.add(new positionTicTacToe(1,i,1,-1));
				oneWinCondtion.add(new positionTicTacToe(2,i,2,-1));
				oneWinCondtion.add(new positionTicTacToe(3,i,3,-1));
				winningLines.add(oneWinCondtion);
			}
		//yz plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(i,0,0,-1));
				oneWinCondtion.add(new positionTicTacToe(i,1,1,-1));
				oneWinCondtion.add(new positionTicTacToe(i,2,2,-1));
				oneWinCondtion.add(new positionTicTacToe(i,3,3,-1));
				winningLines.add(oneWinCondtion);
			}
		//xy plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(0,0,i,-1));
				oneWinCondtion.add(new positionTicTacToe(1,1,i,-1));
				oneWinCondtion.add(new positionTicTacToe(2,2,i,-1));
				oneWinCondtion.add(new positionTicTacToe(3,3,i,-1));
				winningLines.add(oneWinCondtion);
			}
		
		//12 anti diagonal winning lines
		//xz plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(0,i,3,-1));
				oneWinCondtion.add(new positionTicTacToe(1,i,2,-1));
				oneWinCondtion.add(new positionTicTacToe(2,i,1,-1));
				oneWinCondtion.add(new positionTicTacToe(3,i,0,-1));
				winningLines.add(oneWinCondtion);
			}
		//yz plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(i,0,3,-1));
				oneWinCondtion.add(new positionTicTacToe(i,1,2,-1));
				oneWinCondtion.add(new positionTicTacToe(i,2,1,-1));
				oneWinCondtion.add(new positionTicTacToe(i,3,0,-1));
				winningLines.add(oneWinCondtion);
			}
		//xy plane-4
		for(int i = 0; i<4; i++)
			{
				List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
				oneWinCondtion.add(new positionTicTacToe(0,3,i,-1));
				oneWinCondtion.add(new positionTicTacToe(1,2,i,-1));
				oneWinCondtion.add(new positionTicTacToe(2,1,i,-1));
				oneWinCondtion.add(new positionTicTacToe(3,0,i,-1));
				winningLines.add(oneWinCondtion);
			}
		
		//4 additional diagonal winning lines
		List<positionTicTacToe> oneWinCondtion = new ArrayList<positionTicTacToe>();
		oneWinCondtion.add(new positionTicTacToe(0,0,0,-1));
		oneWinCondtion.add(new positionTicTacToe(1,1,1,-1));
		oneWinCondtion.add(new positionTicTacToe(2,2,2,-1));
		oneWinCondtion.add(new positionTicTacToe(3,3,3,-1));
		winningLines.add(oneWinCondtion);
		
		oneWinCondtion = new ArrayList<positionTicTacToe>();
		oneWinCondtion.add(new positionTicTacToe(0,0,3,-1));
		oneWinCondtion.add(new positionTicTacToe(1,1,2,-1));
		oneWinCondtion.add(new positionTicTacToe(2,2,1,-1));
		oneWinCondtion.add(new positionTicTacToe(3,3,0,-1));
		winningLines.add(oneWinCondtion);
		
		oneWinCondtion = new ArrayList<positionTicTacToe>();
		oneWinCondtion.add(new positionTicTacToe(3,0,0,-1));
		oneWinCondtion.add(new positionTicTacToe(2,1,1,-1));
		oneWinCondtion.add(new positionTicTacToe(1,2,2,-1));
		oneWinCondtion.add(new positionTicTacToe(0,3,3,-1));
		winningLines.add(oneWinCondtion);
		
		oneWinCondtion = new ArrayList<positionTicTacToe>();
		oneWinCondtion.add(new positionTicTacToe(0,3,0,-1));
		oneWinCondtion.add(new positionTicTacToe(1,2,1,-1));
		oneWinCondtion.add(new positionTicTacToe(2,1,2,-1));
		oneWinCondtion.add(new positionTicTacToe(3,0,3,-1));
		winningLines.add(oneWinCondtion);	
		
		return winningLines;
		
	}
	public aiTicTacToe(int setPlayer)
	{
		player = setPlayer;
	}
}
