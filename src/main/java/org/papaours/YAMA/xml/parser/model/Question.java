package org.papaours.YAMA.xml.parser.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * The general definition of quiz question.
 * 
 * @author Pierrick MARIE: pierrick.marie1456@gmail.com
 * 
 */
@XmlRootElement(name = "question")
public class Question {

	/**
	 * The minimum size of the question name.
	 */
	private static final int MIN_NAME_SIZE = 3;

	/**
	 * The default grade of the question.
	 */
	private Float defaultGrade;

	/**
	 * The errors of the question.
	 */
	private QuestionsError errors;

	/**
	 * The general feedback of the question.
	 */
	private String generalFeedBack;

	/**
	 * The optional image of the question.
	 */
	private String image;

	/**
	 * The base 64 of the image.
	 */
	private String image64;

	/**
	 * Return true if the question os hiden from the quiz.
	 */
	private Boolean isHidden;

	/**
	 * The name of the question.
	 */
	private String name;

	/**
	 * The penality of the question.
	 */
	private Float penality;

	/**
	 * The text of the question.
	 */
	private QuestionText questionText;

	/**
	 * The type of the question.
	 */
	private QuestionType questionType;

	/**
	 * @return the defaultGrade
	 */
	public final Float getDefaultGrade() {
		return defaultGrade;
	}

	/**
	 * @return the errors
	 */
	public final QuestionsError getErrors() {
		return errors;
	}

	/**
	 * @return the generalFeedBack
	 */
	public final String getGeneralFeedBack() {
		return generalFeedBack;
	}

	/**
	 * @return the image
	 */
	public final String getImage() {
		return image;
	}

	/**
	 * @return the image64
	 */
	public final String getImage64() {
		return image64;
	}

	/**
	 * @return the isHidden
	 */
	public final Boolean getIsHidden() {
		return isHidden;
	}

	/**
	 * Get the name of the question.
	 * 
	 * @return the question name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @return the penality
	 */
	public final Float getPenality() {
		return penality;
	}

	/**
	 * @return the questionText
	 */
	public final QuestionText getQuestionText() {
		return questionText;
	}

	/**
	 * @return the questionType
	 */
	public final QuestionType getQuestionType() {
		return questionType;
	}

	/**
	 * @param value
	 *            the defaultGrade to set
	 */
	@XmlElement(required = true)
	public final void setDefaultGrade(final Float value) {
		defaultGrade = value;
	}

	/**
	 * @param value
	 *            the errors to set
	 */
	@XmlElement(required = true)
	public final void setErrors(final QuestionsError value) {
		errors = value;
	}

	/**
	 * @param value
	 *            the generalFeedBack to set
	 */
	@XmlElement(required = false)
	public final void setGeneralFeedBack(final String value) {
		generalFeedBack = value;
	}

	/**
	 * @param value
	 *            the image to set
	 */
	@XmlElement(required = false)
	public final void setImage(final String value) {
		image = value;
	}

	/**
	 * @param value
	 *            the image64 to set
	 */
	@XmlElement(required = false)
	public final void setImage64(final String value) {
		image64 = value;
	}

	/**
	 * @param value
	 *            the isHidden to set
	 */
	@XmlElement(required = true)
	public final void setIsHidden(final Boolean value) {
		isHidden = value;
	}

	/**
	 * Set the label of the quiz.
	 * 
	 * @param value
	 *            : the new label value
	 */
	@XmlAttribute(required = true)
	public final void setName(final String value) {
		if (value.length() <= Question.MIN_NAME_SIZE) {
			throw new IllegalArgumentException();
		}
		name = value;
	}

	/**
	 * @param value
	 *            the penality to set
	 */
	@XmlElement(required = true)
	public final void setPenality(final Float value) {
		penality = value;
	}

	/**
	 * @param value
	 *            the questionText to set
	 */
	@XmlElement(required = true)
	public final void setQuestionText(final QuestionText value) {
		questionText = value;
	}

	/**
	 * @param value
	 *            the questionType to set
	 */
	@XmlElement(required = true)
	public final void setQuestionType(final QuestionType value) {
		questionType = value;
	}
}
