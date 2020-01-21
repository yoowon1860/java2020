package sstack;

public class StringStack implements Stack{
	String [] ss;
	int index;

	public StringStack(int n){
		ss = new String[n];
		index = -1;
	}

	@Override
	public int length() {

		return index +1;
	}

	@Override
	public int capacity() {
		return ss.length;
	}

	@Override
	public String pop() {
		if(index ==-1)
			return null;
		String s = ss[index];
		index--;
		return s;
	}

	@Override
	public boolean push(String val) {
		if(index == ss.length-1) {
			return false;
		}else 
		{
			index++;
			ss[index]= val;
			return true;
		}
	}


}
