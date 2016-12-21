package ua.kpi.tef.writer.model.pen;

import ua.kpi.tef.writer.model.paper.Paper;

public interface WritingInstrument {
	
	boolean canWrite();
	void write(Paper paper, String text) throws Exception;
}
