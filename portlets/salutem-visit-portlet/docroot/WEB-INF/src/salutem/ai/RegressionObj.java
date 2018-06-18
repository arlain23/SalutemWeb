package salutem.ai;

import java.util.HashMap;
import java.util.List;

public class RegressionObj {
	private  HashMap<List<Integer>, Double> polynomial;
	private List<Double> minimumListTraining;
	private List<Double> maximumListTraining;
	private int chosenK;
	public RegressionObj(HashMap<List<Integer>, Double> polynomial,
			List<Double> minimumListTraining, List<Double> maximumListTraining, int chosenK) {
		super();
		this.polynomial = polynomial;
		this.minimumListTraining = minimumListTraining;
		this.maximumListTraining = maximumListTraining;
		this.chosenK = chosenK;
	}
	public HashMap<List<Integer>, Double> getPolynomial() {
		return polynomial;
	}
	public List<Double> getMinimumListTraining() {
		return minimumListTraining;
	}
	public List<Double> getMaximumListTraining() {
		return maximumListTraining;
	}
	public int getChosenK() {
		return chosenK;
	}
	
	
}
