package org.papaours.YAMA.tests.xml.jaxb.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public abstract class Category {

	@XmlElement
	protected String text;
}
