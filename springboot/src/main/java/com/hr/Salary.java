package com.hr;
import org.springframework.stereotype.Component;

@Component
public class Salary {

	double basic=475787.90;
	double hra=9489.8;
	double da=874878;
	double sa=596998;
	public double getBasic() {
		return basic;
	}
	public double getHra() {
		return hra;
	}
	public double getDa() {
		return da;
	}
	public double getSa() {
		return sa;
	}
}
