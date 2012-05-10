package org.papaours.YAMA.xml.parser.model;

import javax.xml.bind.annotation.XmlAttribute;

/**
 * 
 * The general definition of quiz question.
 * 
 * @author Pierrick MARIE: pierrick.marie1456@gmail.com
 * 
 */
public class Question {

	/**
	 * The minimum size of the question name.
	 */
	private static final int MIN_NAME_SIZE = 3;

	/**
	 * The name of the question.
	 */
	private String name;

	/**
	 * Get the name of the question.
	 * 
	 * @return the question name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * Set the label of the quiz.
	 * 
	 * @param value
	 *            : the new label value
	 */
	@XmlAttribute(name = "name", required = true)
	public final void setLabel(final String value) {
		if (value.length() <= Question.MIN_NAME_SIZE) {
			throw new IllegalArgumentException();
		}
		name = value;
	}

}
