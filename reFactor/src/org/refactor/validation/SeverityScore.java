package org.refactor.validation;

public class SeverityScore {
	
	public static int computeScore(double value, double min, double max){
		if (value < Math.min(min, max)) return 0;
		if (value > Math.max(min, max)) return 10;
		if (min == max) return 1;
		return (int)(1+9*(value-min)/(max-min));
	}
}