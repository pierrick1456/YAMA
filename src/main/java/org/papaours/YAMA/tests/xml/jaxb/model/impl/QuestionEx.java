package org.papaours.YAMA.tests.xml.jaxb.model.impl;

import javax.xml.bind.annotation.XmlRootElement;

import org.papaours.YAMA.tests.xml.jaxb.model.Category;
import org.papaours.YAMA.tests.xml.jaxb.model.Question;


@XmlRootElement
public class QuestionEx extends Question {

	public Category getCatgory() {
		return catgory;
	}

	public void setCatgory(final Category catgory) {
		super.catgory = catgory;
	}
}
