package textExcel;

public class Spreadsheet implements Grid {

	private int numOfRows;
	private int numOfCols;
	private Cell[][] spreadsheet;
	
	public Spreadsheet () {
		
		this.numOfRows = 20;
		this.numOfCols = 12;
		spreadsheet = new EmptyCell[numOfRows][numOfCols];
	}
	
	@Override
	public String processCommand(String command) {
		
		int numOfChar = command.length();
		
		//assignment of string values
		if (command.contains("=")) {
			String [] splitOfCommand = command.split(" ");	
			String cellLocation = splitOfCommand[0];
			String userCommand = splitOfCommand[2];
			assignCellValue(cellLocation, userCommand);
			return getGridText();
			
		//cell inspection
		} else if(numOfChar <= 3) {
			SpreadsheetLocation cellLoc = new SpreadsheetLocation(command);
			return getCell(cellLoc).fullCellText();
			
		//clearing a particular cell
		} else if(command.toLowerCase().contains("clear") && command.contains(" ")) {
			String [] splitOfCommand = command.split(" ");
			String cellLoc = splitOfCommand[1];
			clearAssignedCell(cellLoc);
			return getGridText();
			
		//clearing the entire sheet
		} else {
			return getGridText();
			
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
	public Cell getCell(Location loc) {
		
		Cell getCell = spreadsheet [loc.getRow()] [loc.getCol()];
		return getCell;
	}

	@Override
	public String getGridText() {
		
		String getgridText = "   |";
		
		for(char a = 'A'; a < 'M'; a++){
			getgridText = getgridText + a + "         |";
		}
		
		for(int i = 1; i <= numOfRows; i++){
			
			getgridText += "\n" + i;
			
			if(i < 10){
				getgridText += "  |";
			}else if(i >= 10){
				getgridText += "  |";
			}
			for(int j = 0; j < numOfCols; j++){
				getgridText += spreadsheet[i-1][j].abbreviatedCellText() + "|";
			}
		}
		getgridText += "\n";
		return getgridText;
	}
	
	public void assignCellValue (String cellLoc, String userInput) {
		
		SpreadsheetLocation cell = new SpreadsheetLocation(cellLoc);
		spreadsheet [cell.getRow()] [cell.getCol()] = new TextCell(userInput);
	}
	
	public void clearAssignedCell (String cellLoc) {
		
		SpreadsheetLocation clearcell = new SpreadsheetLocation(cellLoc);
		spreadsheet [clearcell.getRow()] [clearcell.getCol()] = new EmptyCell();
	}
	
	
}
