package gomoku;

//ת��һλ����Ͷ�ά����
public class ChessBoardHelper {
	
	//����һλ����index��ȡ��ά�����Ӧ����
	public static int getRowIndex(int index){
		return index / ChessBoardConstant.ChessBoardWidth;
	}
	
	//����һλ����index��ȡ��ά�����Ӧ����
	public static int getColumnIndex(int index){
		return index % ChessBoardConstant.ChessBoardWidth;
	}
	
	//�Ѷ�ά����indexתΪһλ����index
	public static int getListIndex(int rowIndex, int columnIndex){
		if (rowIndex < 0 || rowIndex >= ChessBoardConstant.ChessBoardWidth 
				|| columnIndex < 0 || columnIndex >= ChessBoardConstant.ChessBoardWidth)
			return ChessBoardConstant.BoarderIndex;
		return rowIndex * ChessBoardConstant.ChessBoardWidth + columnIndex;
	}
	
	public static int getNextPlayer(int currentPlayer){
		if(currentPlayer==ChessBoardConstant.PlayerBlack)
			return ChessBoardConstant.PlayerWhite;
		return ChessBoardConstant.PlayerBlack;
	}
	
	public static boolean emptyChessBoard(int[] chessBoardStatus){
		for(int i =0; i<ChessBoardConstant.ChessBoardWidth *ChessBoardConstant.ChessBoardWidth ;i++){
			if(chessBoardStatus[i]!=ChessBoardConstant.Blank)
				return false;
		}
		return true;
	}
	
	public static int emptyChessCount(int[] chessBoardStatus){
		int count = 0;
		for(int i =0; i<ChessBoardConstant.ChessBoardWidth *ChessBoardConstant.ChessBoardWidth ;i++){
			if(chessBoardStatus[i]==ChessBoardConstant.Blank)
				count++;
		}
		return count;
	}
    public static boolean isfull(int[] chessBoardStatus){
    	for(int i = 0; i < ChessBoardConstant.ChessBoardWidth*ChessBoardConstant.ChessBoardWidth ;i++){
			if(chessBoardStatus[i] == 0){
				return false;
				}
			}
    	return true;
	}
}
