package org.papaours.YAMA.tests.xml.jaxb.model.impl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.papaours.YAMA.tests.xml.jaxb.model.IQuiz;


@XmlRootElement
public class QuizImpl extends IQuiz {

	@XmlElement
	private String label;

	@Override
	public final String getLabel() {
		return label;
	}

	// public List<T> getQuestions() {
	// return super.questions;
	// }

	@Override
	public void setLabel(final String label) {
		if (label.length() <= 3) {
			throw new IllegalArgumentException();
		}
		this.label = label;
	}

	// public void setQuestions(final List<T> questions) {
	// super.questions = questions;
	// }
}
