package test;
public class Designation {
	public boolean verify(String des) {
		return switch(des) {
				case "SE":yield true;
				case "TE":yield true;
				case "ME":yield true;
				default:yield false;
	};
	}
}	

