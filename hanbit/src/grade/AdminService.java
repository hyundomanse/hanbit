package grade;

import java.util.List;

import bank.AccountBean;

public interface AdminService {
	// 1. 학생부에 학생등록
	public String regist(String id, String name,
			int kor, int eng, int math, int java);
	// 2. ID로 해당 학생 정보 조회
	public GradeBean findByID(String id);
	// 3. 이름으로 학생 정보(단, 동명이인이면 다 출력)
	public List<GradeBean> findByName(String name);
	// 4. 학생부 탈퇴
	public String remove(String id);
	// 5. 전체 학생수
	public int countAll();
	// 6. 전체 학생 목록
	public List<GradeBean> list(); 
}

