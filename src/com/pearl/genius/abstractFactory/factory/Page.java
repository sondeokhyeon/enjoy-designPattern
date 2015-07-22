package com.pearl.genius.abstractFactory.factory;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015-07-22.
 */
public abstract class Page {

	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}
}
