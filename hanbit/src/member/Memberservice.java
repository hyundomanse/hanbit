package member;

import java.util.List;

public interface Memberservice {
	// Create, Update, Delete, Read (CRUD) >> 이중 R만 get타입 나머지는 set타입 때문에 r을 제외한 나머지는 void
	// 
	
	public String join(MemberBean member); // 만약 회원 가입 후 가입성공 여부를 알려주려면 public String 타입이 되어야 한다.
	public String login(String id, String pwd);
	public MemberBean detail();
	public void update(MemberBean member);
	public void delete();
	public MemberBean findByID(String id);
	public List<MemberBean> findByName(String name);
	public int countByGen(String gen);
	
}
