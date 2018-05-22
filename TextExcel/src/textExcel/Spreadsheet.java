package textExcel;

public class Spreadsheet implements Grid {

	private int numOfRows = 20;
	private int numOfCols = 12;
	private Cell[][] spreadsheet =new Cell[numOfRows][numOfCols];
	
	public Spreadsheet () {
		//making all the cell empty cells
		for (int r = 0; r < getRows(); r++) {
			for (int c = 0; c < getCols(); c++) {
				spreadsheet [r][c] = new EmptyCell();
			}
		}
	}
	
	@Override
	public String processCommand(String command) {
	
		String [] splitOfCommand = command.split(" ", 3);
		int numOfChar = command.length();
		
		//assignment of string values
		if (command.contains("=")) {
			String cellLoc = splitOfCommand[0];
			String userInput = splitOfCommand[2];
			assignCellValue(cellLoc, userInput);
			return getGridText();
			
		//cell inspection
		} else if(numOfChar == 2 || numOfChar == 3) {
			SpreadsheetLocation cellLoc = new SpreadsheetLocation(command);
			return getCell(cellLoc).fullCellText();
		
		//clearing a particular cell
		} else if(command.toLowerCase().contains("clear ")) {
			String cellLoc = splitOfCommand[1];
			clearAssignedCell(cellLoc);
			return getGridText();

		//clearing the entire sheet
		} else if (command.equalsIgnoreCase("clear")) {
			for (int r = 0; r < getRows(); r++) {
				for (int c = 0; c < getCols(); c++) {
					spreadsheet [r][c] = new EmptyCell();
				}
			}
			return getGridText();

		} else {
			return "";
		}
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
	//getcell using a location (overloading)
	public Cell getCell(Location loc) {
		
		Cell getCell = spreadsheet [loc.getRow()] [loc.getCol()];
		return getCell;
	}
	
	//getcell using two ints (overloading)
	public Cell getCell(int i, int j) {
		
		Cell getCell = spreadsheet [j] [i];
		return getCell;
	}

	@Override
	//creating the grid
	public String getGridText() {
		
		String gridText = "   |";
		
		for (char a = 'A'; a < 'M'; a++){
			gridText = gridText + a + "         |";
		}
		
		for (int i = 1; i <= numOfRows; i++){
			
			gridText += "\n" + i;
			
			if (i < 10){
				gridText += "  |";
			}else if (i >= 10){
				gridText += " |";
			}
			for (int j = 0; j < numOfCols; j++){
				gridText += spreadsheet[i-1][j].abbreviatedCellText() + "|";
			}
		}
		gridText += "\n";
		return gridText;
	}
	
	public void assignCellValue (String cellLoc, String userInput) {
		
		SpreadsheetLocation cell = new SpreadsheetLocation(cellLoc);
		//textcell
		if (userInput.contains("\"")) {
			spreadsheet [cell.getRow()] [cell.getCol()] = new TextCell(userInput);
		//percentcell
		}else if (userInput.contains("%")) {
			spreadsheet [cell.getRow()] [cell.getCol()] = new PercentCell(userInput);
		//formulacell
		}else if (userInput.contains("(")) {
			spreadsheet [cell.getRow()] [cell.getCol()] = new FormulaCell(userInput, this);
		//valuecell
		}else {
			spreadsheet [cell.getRow()] [cell.getCol()] = new ValueCell(userInput);
		}
	}
	
	public void clearAssignedCell (String cellLoc) {
		//change the cell to an emptycell
		SpreadsheetLocation clearcell = new SpreadsheetLocation(cellLoc);
		spreadsheet [clearcell.getRow()] [clearcell.getCol()] = new EmptyCell();
	}
	
	
}

