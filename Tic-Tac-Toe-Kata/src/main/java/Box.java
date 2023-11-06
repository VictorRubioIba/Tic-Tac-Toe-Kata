public class Box {

	private static String state;

	public void Box(String state) {
		this.state = state ;
	}

	public static String getState(String state) {
		if(state!="X" || state!="Y"){
			return "";
		}
		return state;
	}
}
