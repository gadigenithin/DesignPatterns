package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TaskList implements Task {

	private String title;

	private List<Task> tasks = new ArrayList<Task>();

	public TaskList(String title) {
		super();
		this.title = title;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void removeTask(Task task) {
		tasks.remove(task);
	}

	@Override
	public void display() {

		System.out.println("Task List: " + title);
		tasks.stream().forEach(Task::display);

	}

}
