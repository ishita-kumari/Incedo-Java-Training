package design_patterns.chess;

public abstract class Piece {
	
	private boolean killed  = false;
	private boolean white = false;
	
	public Piece(boolean white) {
		this.setWhite(white);
	}
	
	public void setWhite(boolean white) {
		this.white = white;
	}
	
	public void setKilled(boolean killed) {
		this.killed = killed;
	}
	
	public abstract boolean canMove(Board board, Spot start, Spot end);
}


public class King extends Piece{
	private boolean castlingDone = false;
	public King(boolean white) {
		super(white);
	}
}