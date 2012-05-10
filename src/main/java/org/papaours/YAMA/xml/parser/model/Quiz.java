package org.papaours.YAMA.xml.parser.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The root of the quiz.
 * 
 * @author viking
 * 
 */
@XmlRootElement
public class Quiz {

	/**
	 * The minimum size of the label.
	 */
	private static final int MINLABELSIZE = 3;

	/**
	 * The label of the quiz.
	 */
	private String label;

	/**
	 * The list of the quiz questions.
	 */
	private List<Question> questions;

	/**
	 * Add a new question into the questions list.
	 * 
	 * @param question
	 *            : the new question
	 */
	public final void addQuestion(final Question question) {
		questions.add(question);
	}

	/**
	 * Get the label.
	 * 
	 * @return label
	 */
	public final String getLabel() {
		return label;
	}

	/***
	 * Set the questions list.
	 * 
	 * @return the question list
	 */
	public final List<Question> getQuestions() {
		return questions;
	}

	/**
	 * Set the label of the quiz.
	 * 
	 * @param value
	 *            : the new label value
	 */
	@XmlAttribute(name = "label", required = false)
	public final void setLabel(final String value) {
		if (value.length() <= Quiz.MINLABELSIZE) {
			throw new IllegalArgumentException();
		}
		label = value;
	}

	/**
	 * Set the questions list.
	 * 
	 * @param value
	 *            : the new questions list
	 */
	@XmlElement(name = "questions", required = true)
	public final void setQuestions(final List<Question> value) {
		questions = value;
	}
}
