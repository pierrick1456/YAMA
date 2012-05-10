package org.papaours.YAMA.tests.xml.jaxb.model.impl;

import javax.xml.bind.annotation.XmlRegistry;

import org.papaours.YAMA.tests.xml.jaxb.model.IObjectFactory;


@XmlRegistry
public class ObjectFactoryImpl extends IObjectFactory {

	@Override
	public QuizImpl createQuizImpl() {
		return new QuizImpl();
	}
}