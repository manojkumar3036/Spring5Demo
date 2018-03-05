package com.mks.springdi;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/*
 * This program contains a Question1 class and Answers class
 * It is an example of 
 */
class Question1 {
	private int id;
	private String name;
	private List<Answer> answer;

	public Question1() {

	}

	public Question1(int id, String name, List<Answer> answer) {
		this.id = id;
		this.name = name;
		this.answer = answer;

	}

	public void infoDisplay() {
		System.out.println(id + " " + name);
		System.out.println("Answer:");

		
		Iterator<Answer> ans = answer.iterator();
		while (ans.hasNext()) {
			System.out.println(ans.next());
		}
	}
}

class Answer {

	private int id;
	private String name;
	private String by;

	public Answer() {

	}

	public Answer(int id, String name, String by) {
		this.id = id;
		this.name = name;
		this.by = by;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", by=" + by + "]";
	}

}

public class TestCIWithCollectionDO {

	public static void main(String[] args) {
	
		ApplicationContext context=new FileSystemXmlApplicationContext("resource/applicationContext.xml");
		Question1 que=(Question1) context.getBean("question1");
		que.infoDisplay();
	}

}
