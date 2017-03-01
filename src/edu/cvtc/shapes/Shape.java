package edu.cvtc.shapes;


abstract class Shape implements Renderer{
	
	protected Dialog messageBox;
	protected Dialog getMessageBox() {
		return messageBox;
	}
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	// Method for surfaceArea
	abstract float surfaceArea();
	// Method for volume
	abstract float volume();	
	
	public Shape (Dialog dialog) {
		setMessageBox(dialog);
	}
}
