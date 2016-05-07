package grade;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService{
	List<GradeBean> list;
	public AdminServiceImpl() {
		list = new ArrayList<GradeBean>();
	}

	@Override
	public String regist(String id, String name, int kor, int eng, int math, int java) {
		// 학생부 등록
		return null;
	}

	@Override
	public GradeBean findByID(String id) {
		// id로 조회
		return null;
	}

	@Override
	public List<GradeBean> findByName(String name) {
		// 이름으로 조회
		return null;
	}

	@Override
	public String remove(String id) {
		// 탈퇴
		return null;
	}

	@Override
	public int countAll() {
		// 전체 학생수
		return 0;
	}

	@Override
	public List<GradeBean> list() {
		// 전체 학생 목록
		return null;
	}

	

}
