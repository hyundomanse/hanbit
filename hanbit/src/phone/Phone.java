package phone;

public class Phone {
	
	private String company, call; // 인스턴스 변수 - > 힙영역
	public static String KIND = "일반 전화기"; // 스태틱(전역) 변수
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public static String getKIND() {
		return KIND;
	}
	public static void setKIND(String kIND) {
		KIND = kIND;
	}
	
	public String toString(){
		return KIND+"인" + this.company + "폰을 가지고 '"
				+ this.call + "'라고 통화함";
	}
	
}
