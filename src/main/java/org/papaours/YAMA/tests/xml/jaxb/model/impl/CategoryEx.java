package org.papaours.YAMA.tests.xml.jaxb.model.impl;

import javax.xml.bind.annotation.XmlRootElement;

import org.papaours.YAMA.tests.xml.jaxb.model.Category;


@XmlRootElement
public class CategoryEx extends Category {

	public String getText() {
		return text;
	}

	public void setText(final String text) {
		super.text = text;
	}
}
