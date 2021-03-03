package stuff;

public class ServiceLearning {
	private String _title;
	private String _explanation;
	
	public ServiceLearning(String title, String explanation) {
		_title = title;
		_explanation = explanation;
	}
	
	public String toString() {
		return _title;
	}
	
	public String getTitle() { return _title; }
	public String getExplanation() { return _explanation; }
}
