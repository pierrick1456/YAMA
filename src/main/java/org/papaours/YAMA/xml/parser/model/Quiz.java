package org.papaours.YAMA.xml.parser.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The root of the quiz.
 * 
 * @author viking
 * 
 */
@XmlRootElement(name = "quiz")
public class Quiz {

	/**
	 * The minimum size of the label.
	 */
	private static final int MINLABELSIZE = 3;

	/**
	 * The label of the quiz.
	 */
	private String label;

	/***
	 * A list of questions.
	 */
	private Questions questions;

	/**
	 * Get the label.
	 * 
	 * @return label
	 */
	public final String getLabel() {
		return label;
	}

	/**
	 * @return the questions
	 */
	public Questions getQuestions() {
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
	 * @param questions
	 *            the questions to set
	 */
	@XmlElement
	public void setQuestions(final Questions questions) {
		this.questions = questions;
	}
}
