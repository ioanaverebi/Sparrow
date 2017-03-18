package org.refactor.validation;

public interface IRuleChecker {
	public String getMessage();
	public boolean check();
	public String getDetails();
	public int getSeverity();
}
