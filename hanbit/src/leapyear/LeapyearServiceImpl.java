package leapyear;

public class LeapyearServiceImpl implements LeapyearService {

	@Override
	public int getIndex(LeapyearBean leap) {
		// TODO Auto-generated method stub
		int index = 0;
		index = (int)(leap.getMonth());
		
		return index;
	}

	@Override
	public String getResult(int index) {
		// TODO Auto-generated method stub
		String result="";
		return result;
	}

}
