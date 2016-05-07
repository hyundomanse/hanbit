package grade;

public class GradeBean {
	// ==== 멤버 필드영역(스코프) ====
	//int total, avg; 
	
	private int kor, eng, math, java; // 인스턴스 변수는 초기화를 하지 않는다, 메인메소드에서 보기 위한 값이 아니기 때문에 리턴하는 값이 아니라 초기화가 불필요하다.
	private String name, id;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getKor() {
		return kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getEng() {
		return eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMath() {
		return math;
	}
	public void setJava() {
		this.java = java;
	}
	public int getJava() {
		return java;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "=== "+name+"("+id+") 의 성적표 === \n "
				+" [kor=" + kor + ", eng=" + eng + ", math=" + math + ", java=" + java + "]\n";
	}
	
}