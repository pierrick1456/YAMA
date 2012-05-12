package org.papaours.YAMA.xml.parser.model;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.junit.Before;
import org.junit.Test;

/**
 * The Quiz tests.
 * 
 * @author Pierrick MARIE: pierrick.marie1456@gmail.com
 * 
 */
public class QuizGeneratorTests {

	/**
	 * The JAXB context to read and write xml.
	 */
	private JAXBContext context;
	/**
	 * The quiz which will be test.
	 */
	private Quiz quiz;

	/**
	 * Init the quiz variable.
	 */
	@Before
	public final void init() {
		quiz = new Quiz();
		try {
			context = JAXBContext.newInstance(ObjectFactory.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * The main test.
	 */
	@Test
	public final void test() {
		quiz.setLabel("The test of the quiz");

		Question question = new Question();
		question.setName("My question's name");

		Questions questions = new Questions();
		questions.addQuestion(question);

		quiz.setQuestions(questions);
		try {
			context.createMarshaller().marshal(quiz, System.out);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
