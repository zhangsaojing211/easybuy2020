package com.buy.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pager implements Serializable{
	private int currentPage;//当前页
	private int rowCount;//总条数
	private int rowPerPage;//每页显示条数
	private int pageCount;//总页数
	private String url;

	public Pager(int rowCount, int rowPerPage, int currentPage) {

		this.rowCount = rowCount;
		this.rowPerPage = rowPerPage;
		this.currentPage = currentPage;
		if(this.rowCount % this.rowPerPage == 0){
			this.pageCount = this.rowCount / this.rowPerPage;
		}else if(this.rowCount % this.rowPerPage > 0){
			this.pageCount = this.rowCount / this.rowPerPage + 1;
		}else{
			this.pageCount = 0;
		}
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getRowPerPage() {
		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}
