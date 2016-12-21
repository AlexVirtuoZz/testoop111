package ua.kpi.tef.writer.model.pen;

import ua.kpi.tef.writer.model.paper.Paper;

public class Pen implements WritingInstrument {
	
	private int inkwell;
	
	public Pen(int inkwell){
		this.inkwell = inkwell;
	}
			
	public int getInkwell() {
		return inkwell;
	}

	public void setInkwell(int inkwell) {
		this.inkwell = inkwell;
	}

	@Override
	public boolean canWrite() {		
		return inkwell > 0;
	}

	@Override
	public void write(Paper paper, String text) throws Exception {
		if (!canWrite())
			throw new Exception("Inkwell is empty");
		paper.getContent().add(text);
		inkwell -= 1;
	}

}
