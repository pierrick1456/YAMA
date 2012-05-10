package org.papaours.YAMA.xml.parser.model;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * 
 * The factory to create a new quiz.
 * 
 * @author Pierrick MARIE: pierrick.marie1456@gmail.com
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * The method to create a new quiz.
	 * 
	 * @return a new quiz
	 */
	public final Quiz createQuiz() {
		return new Quiz();
	}

}
