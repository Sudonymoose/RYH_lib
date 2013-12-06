/**
 * 
 */
package ws;

/**
 * @author arthurc
 *
 */
public enum RequestType {
	GET_LOGIN,
	GET_LECTURES,
	SEND_END_QUESTION,

	GET_ROSTER,
	SEND_START_LECTURE,
	UPDATE_INSTRUCTOR,
	SEND_START_ATTENDANCE,
	SEND_END_ATTENDANCE,
	SEND_START_QUIZ,
	SEND_END_QUIZ,
	SEND_HIDE_QUIZ,
	SEND_INSTRUCTOR_NOTE,
	SEND_DISMISS_QUESTION,
	SEND_ANSWER_QUESTION,
	SEND_ACCEPT_STUDENT_NOTE,
	SEND_DENY_STUDENT_NOTE,
	SEND_END_LECTURE,

	GET_LECTURE,
	SEND_JOIN_LECTURE,
	UPDATE_STUDENT,
	SEND_REQUEST_QUESTION,
	SEND_QUESTION,
	SEND_STUDENT_NOTE,
	SEND_QUIZ_ANSWER,
	SEND_LEAVE_LECTURE,

	SEND_RESPONSE,
	CLOSE;
}
