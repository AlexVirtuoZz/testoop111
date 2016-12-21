package ua.kpi.tef.writer.model.paper;

import java.util.List;

public class Sheet implements Paper {
	
	private List<String> list;
	private int maxSize;
	
	public Sheet(List<String> list, int maxSize) {
		this.list = list;
		this.maxSize = maxSize;
	}

	@Override
	public int getContentSize() {		
		return list.size();
	}

	@Override
	public boolean isFull() {
		return list.size() >= maxSize;
	}

	@Override
	public List<String> getContent() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public String showContent() {
		StringBuffer sb = new StringBuffer();
		for (String s : list)
			sb.append(s+" ");
		return sb.toString();
	}
	
}
