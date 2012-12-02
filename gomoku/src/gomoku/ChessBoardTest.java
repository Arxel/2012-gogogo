package gomoku;

import monte.MovePropose;

public class ChessBoardTest {
	
	public ChessBoardTest(){
		
	}
	
	//����Monte
	//����MiniMax
	public void TestMonteMiniMax() throws Exception{
		//��ʼ��
		int blackWin = 0;
		int whiteWin = 0;
		for(int i =0; i< 100 ;i++){
		    boolean isGameOver = false;
		    int[] chessBoard = new int[ChessBoardConstant.ChessBoardWidth * ChessBoardConstant.ChessBoardWidth];
		    Minimax minimaxPlayer = new Minimax(chessBoard);
		    MovePropose montePlayer = new MovePropose();
		    ChessBoardChecker chessBoardChecker = new ChessBoardChecker();
		    int currentPlayer = ChessBoardConstant.PlayerBlack;
		    int newMove = 0;
			while(! isGameOver){
				if(currentPlayer==ChessBoardConstant.PlayerBlack){
					//ģ��monte
					newMove = montePlayer.play(chessBoard, currentPlayer);
				}
				else{
					//ģ��minimax
					newMove = minimaxPlayer.getBestMove(currentPlayer, 4, chessBoard);
				}
				
				//�����
				chessBoard[newMove] = currentPlayer;
				if(chessBoardChecker.isWin(currentPlayer, chessBoard,newMove)){
					isGameOver = true;
				}
				else{
					currentPlayer = ChessBoardHelper.getNextPlayer(currentPlayer);
				}
			}
			
			if(currentPlayer==ChessBoardConstant.PlayerBlack){
				blackWin++;
				System.out.println("��: "+ String.valueOf(i) +"�ֺ�ʤ");
			}
			else{
				whiteWin++;
				System.out.println("��: "+ String.valueOf(i) +"�ְ�ʤ");
			}
			
		}
		System.out.println("����Monteʤ: "+ String.valueOf(blackWin) +"��");
		System.out.println("����Minimaxʤ: "+ String.valueOf(whiteWin) + "��");
	}
}
