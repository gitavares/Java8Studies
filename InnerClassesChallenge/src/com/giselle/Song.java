package com.giselle;

public class Song {
	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return this.title + ": " + this.duration;
	}
	
	
}
