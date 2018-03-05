package com.mks.springdi;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

class Question {
	private int id;
	private String name;
	private List<String> answers;

	// non-parameterized constructor
	public Question() {

	}

	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;

	}

	public void displayInfo() {
		System.out.println(id + " " + name);
		// iterator to display the list of answers

		Iterator<String> anslist = answers.iterator();
		while (anslist.hasNext()) {
			System.out.println(anslist.next());
		}

	}
}

public class TestConstructorInjectionWithCollection {
	
	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("/resource/applicationContext.xml");
		Question question=(Question) context.getBean("answerlist");
		question.displayInfo();
		
	}

}
