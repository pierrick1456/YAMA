package org.papaours.YAMA.tests.xml.jaxb;

import javax.xml.bind.JAXBContext;

import org.papaours.YAMA.tests.xml.jaxb.model.impl.ObjectFactoryImpl;
import org.papaours.YAMA.tests.xml.jaxb.model.impl.QuizImpl;


public class TestJaxb {

	public static void main(final String[] args) {
		new TestJaxb();
	}

	public TestJaxb() {

		try {

			JAXBContext context = JAXBContext
					.newInstance(ObjectFactoryImpl.class);

			String path = "/home/viking/travail/workspaces/workspace-spring/YAMA/src/main/java/com/papaours/YAMA/tests/xml/jaxb/model/quiz_2.xml";

			QuizImpl quiz = new QuizImpl();
			quiz.setLabel("Quiz 1");

			// QuestionEx question = new QuestionEx();
			// CategoryEx category = new CategoryEx();
			// category.setText("Category 1");
			// question.setCatgory(category);
			//
			// List<QuestionEx> questions = new ArrayList<QuestionEx>();
			// questions.add(question);
			// quiz.setQuestions(questions);

			context.createMarshaller().marshal(quiz, System.out);

			// Unmarshaller marshaller = context.createUnmarshaller();
			// marshaller.setProperty("com.sun.xml.bind.ObjectFactory",
			// new ObjectFactoryEx());
			// QuizEx quiz = (QuizEx) marshaller.unmarshal(new FileInputStream(
			// path));

			// System.out.println(quiz.getLabel());

			// } catch (javax.xml.bind.UnmarshalException e) {
			// System.out.println("An error has been throwed! "
			// + e.getLocalizedMessage() + "\n"
			// + e.getLinkedException().getLocalizedMessage());
			//
			// System.out.println(e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
