package ua.kpi.tef.writer;

import java.util.ArrayList;

import ua.kpi.tef.writer.model.Writer;
import ua.kpi.tef.writer.model.human.Hand;
import ua.kpi.tef.writer.model.human.Human;
import ua.kpi.tef.writer.model.human.Man;
import ua.kpi.tef.writer.model.paper.Paper;
import ua.kpi.tef.writer.model.paper.Sheet;
import ua.kpi.tef.writer.model.pen.Pen;
import ua.kpi.tef.writer.model.pen.WritingInstrument;

public class Main {

	public static void main(String[] args) {
		Human man = new Man(new Hand(false));
		Paper paper = new Sheet(new ArrayList<>(), 99);
		WritingInstrument pen = new Pen(100);
		try {
			new Writer(man, paper, pen).writePoem();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

}
