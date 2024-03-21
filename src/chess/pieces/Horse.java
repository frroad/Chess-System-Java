package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class Horse extends ChessPiece{

	public Horse(Board board, Color color) {
		super(board, color);
		
	}

	@Override
	public String toString() {
		return "H";
	}
	
	public boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();	
	}
	
		@Override
	public boolean[][] possibleMoves() {
		boolean[][]mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position (0,0);
		
		//ABOVE-LEFT
		p.setValues(position.getRow()-2, position.getColumn()-1);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
		}
		
		//ABOVE-RIGHT
		p.setValues(position.getRow()-2, position.getColumn()+1);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}	
	
		//HORIZON-UP-LEFT
		p.setValues(position.getRow()-1, position.getColumn()-2);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
		}
			
		//HORIZON-DOWN-LEFT
		p.setValues(position.getRow()+1, position.getColumn()-2);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}
	
			//HORIZON-UP-RIGHT
		p.setValues(position.getRow()-1, position.getColumn()+2);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}
	
			//HORIZON-UP-RIGHT
		p.setValues(position.getRow()+1, position.getColumn()+2);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}
		
		//BELLOW -LEFT
		p.setValues(position.getRow()+2, position.getColumn()-1);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}
		
			
			//BELLOW -RIGHT
		p.setValues(position.getRow()+2, position.getColumn()+1);
			if(getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] =true;
			}
			
		
			
			
	return mat;
	
	
}
}
