package ua.kpi.tef.writer.model;

import ua.kpi.tef.writer.model.human.Human;
import ua.kpi.tef.writer.model.paper.Paper;
import ua.kpi.tef.writer.model.pen.WritingInstrument;

public class Writer {
	
	private Human man;
	private Paper paper;
	private WritingInstrument pen;
	
	public Human getMan() {
		return man;
	}
	public void setMan(Human man) {
		this.man = man;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	public WritingInstrument getPen() {
		return pen;
	}
	public void setPen(WritingInstrument pen) {
		this.pen = pen;
	}
	
	public Writer(Human man, Paper paper, WritingInstrument pen) {
		this.man = man;
		this.paper = paper;
		this.pen = pen;				
	}
	
	public void writePoem() throws Exception{
		check();
		
		if (!man.isAbleToWrite() || paper.isFull() || !pen.canWrite())
			throw new Exception("Writer can't continue working...");
		
		while (!paper.isFull() && pen.canWrite() && man.isAbleToWrite()){
			String thought = man.compose();
			pen.write(paper, thought);			
		}		
		watchPaper();
	};
	
	public void watchPaper(){
		System.out.println(paper.showContent());
	}
	
	private void check() throws Exception{
		if (man == null) 
			throw new NullPointerException("no human was set to writer");
		if (pen == null) 
			throw new NullPointerException("no writing instrument was set to writer");
		if (paper == null) 
			throw new NullPointerException("no paper was set to writer");
	}
	
}
