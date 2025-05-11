package com.designpatterns.structural.composite;

public class Client {

	public static void main(String[] args) {

		TaskList projectTasks = new TaskList("Project Tasks");
		projectTasks.addTask(new SimpleTask("Complete Coding"));
		projectTasks.addTask(new SimpleTask("Write Documentation"));

		TaskList phaseOneTasks = new TaskList("Phase One Task");
		phaseOneTasks.addTask(new SimpleTask("Design"));
		phaseOneTasks.addTask(new SimpleTask("Implementation"));

		projectTasks.addTask(phaseOneTasks);

		projectTasks.display();

	}

}
