package com.simple.board.dto;

public class BoardVO {
	
	private int id;
	private String name;
	private String title;
	private String content;
	
	public BoardVO() {
	}

	public BoardVO(int id, String name, String title, String content) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BoardVO [id=" + id + ", name=" + name + ", title=" + title + ", content=" + content + "]";
	}
}
