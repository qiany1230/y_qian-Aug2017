package textExcel;

public class Spreadsheet implements Grid {

	private int numOfRows = 20;
	private int numOfCols = 12;
	private Cell[][] spreadsheet;
	
	public Spreadsheet () {
		
		spreadsheet = new EmptyCell[numOfRows][numOfCols];
	}
	
	@Override
	public String processCommand(String command) {
		
		return "";
	}

	@Override
	public int getRows() {
		

		return numOfRows;
	}

	@Override
	public int getCols() {
		

		return numOfCols;
	}

	@Override
	public Cell getCell(Location loc) {

		return null;
	}

	@Override
	public String getGridText() {
		
		return null;
	}

}
