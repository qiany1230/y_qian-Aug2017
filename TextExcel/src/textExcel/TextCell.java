package textExcel;

public class TextCell implements Cell {

	private String Text;
	
	public TextCell (String Text) {
		
		this.Text = Text;
	}
	
	@Override
	public String abbreviatedCellText() {
		
		String abbreviatedCellText = "";
		for (int i = 0; i < 10; i++) {
			abbreviatedCellText += this.Text.charAt(i);
		}
		return abbreviatedCellText;
	}

	@Override
	public String fullCellText() {
		
		String fullCellText = "\"" + this.Text + "\"";
		return fullCellText;
	}

}
