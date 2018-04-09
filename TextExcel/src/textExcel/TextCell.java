package textExcel;

public class TextCell implements Cell {

	private String text;
	
	public TextCell (String text) {
		
		this.text = text.substring(1, text.length() - 1);
	}
	
	@Override
	public String abbreviatedCellText() {
		
		String abbreviated = "";
		if (text.length() > 10) {
			abbreviated = text.substring(0, 10);
		} else {
			abbreviated += text;
			for (int i= 0; i < 10 - text.length(); i++) {
				abbreviated += " ";
			}
		}
		return abbreviated;

	}

	@Override
	public String fullCellText() {
		return "\"" + this.text + "\"";
	}

}

