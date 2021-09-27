package SearchEngine;

import java.util.List;

public class SearchHistoryMgr {

	private String  getLogFileName(String fileName) {
		return fileName;	
	}
	public boolean saveSearch(String fileName,SearchResult searchResult) {
		return false;	
	}
	public boolean getSearchHistoryAvailable(String fileName) {
		return false;	
	}
	public List<String> getSearchHistory(String fileName) {
		return null;	
	}
}
