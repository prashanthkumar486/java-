package projecttest3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Value("456")
	private int n1;
	@Value("342")
	private  int n2;
	@Autowired
	@Qualifier("multiple")
	private Calculate calculate;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public Calculate getCalculate() {
		return calculate;
	}
	public void setCalculate(Calculate calculate) {
		this.calculate = calculate;
	}
	@Override
	public String toString() {
		return "Main [n1=" + n1 + ", n2=" + n2 + ", calculate=" + calculate + "]";
	}
	

}
