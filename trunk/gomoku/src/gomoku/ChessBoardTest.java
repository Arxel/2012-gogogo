package gomoku;

public class ChessBoardTest {
	
	//����Monte
	//����MiniMax
	public void TestMonteMiniMax(){
		//��ʼ��
	    boolean isGameOver = false;
	    int[] chessBoard = new int[ChessBoardConstant.ChessBoardWidth * ChessBoardConstant.ChessBoardWidth];
	    Minimax minimaxPlayer = new Minimax(chessBoard);
	    ChessBoardChecker chessBoardChecker = new ChessBoardChecker();
	    int currentPlayer = ChessBoardConstant.PlayerBlack;
	    int newMove = 0;
		while(! isGameOver){
			if(currentPlayer==ChessBoardConstant.PlayerBlack){
				//ģ��monte
			}
			else{
				//ģ��minimax
				newMove = minimaxPlayer.getBestMove(currentPlayer, 3, chessBoard);
			}
			
			//�����
			chessBoard[newMove] = currentPlayer;
			if(chessBoardChecker.isWin(currentPlayer, chessBoard)){
				isGameOver = true;
			}
			else{
				currentPlayer = ChessBoardHelper.GetNextPlayer(currentPlayer);
			}
		}
		System.out.println(ChessBoardConstant.PlayerBlack);
	}
}
