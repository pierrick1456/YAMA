/**
 * 
 */
package org.papaours.YAMA.xml.parser.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * YAMA - Yet Another Moodle API
 * 
 * Copyright (C) 2012 MARIE Pierrick <pierrick.marie1456@gmail.com> MOULIS
 * Marius <moulis.marius@gmail.com> ZILIO Thomas <zilio_thomas@yahoo.fr>
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 * 
 * 
 * @author Pierrick MARIE: pierrick.marie1456@gmail.com
 * 
 */
@XmlType
public class Questions {

	/**
	 * The list of the quiz questions.
	 */
	private List<Question> questions;

	/**
	 * The default constructor.
	 */
	public Questions() {
		questions = new ArrayList<Question>();
	}

	/**
	 * Add a new question into the questions list.
	 * 
	 * @param value
	 *            : the new question
	 */
	public final void addQuestion(final Question value) {
		questions.add(value);
	}

	/***
	 * Set the questions list.
	 * 
	 * @return the question list
	 */
	public final List<Question> getQuestions() {
		return questions;
	}

	/**
	 * Set the questions list.
	 * 
	 * @param value
	 *            : the new questions list
	 */
	@XmlElement
	public final void setQuestions(final List<Question> value) {
		questions = value;
	}
}
