package salutem.ai;

public class kNNObj implements Comparable<kNNObj>{
	private long patientId;
	private double similarity;
	private double meanTime;
	
	public kNNObj(long patientId, double similarity, double meanTime) {
		super();
		this.patientId = patientId;
		this.similarity = similarity;
		this.meanTime = meanTime;
	}
	public long getPatientId() {
		return patientId;
	}
	public double getSimilarity() {
		return similarity;
	}
	public double getMeanTime() {
		return meanTime;
	}
	@Override
	public int compareTo(kNNObj otherPatient) {
		if (this.similarity == otherPatient.getSimilarity()) return 0;
		if (this.similarity > otherPatient.getSimilarity()) return 1;
		else return -1;
	}
	
	
}
