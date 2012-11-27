package gomoku;

//ת��һλ����Ͷ�ά����
public class ChessBoardHelper {
	
	//����һλ����index��ȡ��ά�����Ӧ����
	public static int GetRowIndex(int index){
		return index / ChessBoardConstant.ChessBoardWidth;
	}
	
	//����һλ����index��ȡ��ά�����Ӧ����
	public static int GetColumnIndex(int index){
		return index % ChessBoardConstant.ChessBoardWidth;
	}
	
	//�Ѷ�ά����indexתΪһλ����index
	public static int GetListIndex(int rowIndex, int columnIndex){
		if (rowIndex < 0 || rowIndex >= ChessBoardConstant.ChessBoardWidth 
				|| columnIndex < 0 || columnIndex >= ChessBoardConstant.ChessBoardWidth)
			return ChessBoardConstant.BoarderIndex;
		return rowIndex * ChessBoardConstant.ChessBoardWidth + columnIndex;
	}
	
	public static int GetNextPlayer(int currentPlayer){
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
}
