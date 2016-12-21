package ua.kpi.tef.writer.model.paper;

import java.util.List;

public interface Paper {
	int getContentSize();
	List<String> getContent();
	boolean isFull();
	String showContent();
}
