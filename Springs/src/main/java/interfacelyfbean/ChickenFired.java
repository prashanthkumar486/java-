package interfacelyfbean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ChickenFired implements InitializingBean,DisposableBean {
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "ChickenFired [cost=" + cost + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("coleccting the resources for preparingthe chicken");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("we ate chicken !!!! ::) its done");
		
	}
	

}
