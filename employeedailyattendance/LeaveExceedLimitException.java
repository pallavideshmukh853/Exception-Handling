package com.employeedailyattendance;

public class LeaveExceedLimitException extends RuntimeException {

	public LeaveExceedLimitException(String s) {
		super(s);
	}
}
