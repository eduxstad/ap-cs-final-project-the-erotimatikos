package Tanks;

public class TankTile {

	private boolean isMine;
	private boolean isWall;
	private boolean isTank;
	private boolean isAlive;
	private int row;
	private int col;
	
	
	
	
	
	public TankTile(){
		isMine = false;
		isWall = false;
		isTank = false;
		isAlive = true;
	}
	
	public TankTile(int row, int col){
		isMine = false;
		isWall = false;
		isTank = true;
		this.row = row;
		this.col = col;
		isAlive = true;
	}
	
	
	public boolean getMine(){
		return this.isMine();
	}
	public boolean getIsWall(){
		return isWall;
	}
	
	public void setWall(){
		this.isWall = true;
	}
	
	public void SetMine(){
		this.isMine = true;
	}
	
	public boolean isMine(){
	return this.isMine;
	}
	
	public void died(){
		isAlive = false;
	}
	public boolean isAlive(){
		return isAlive;
	}
	
}
