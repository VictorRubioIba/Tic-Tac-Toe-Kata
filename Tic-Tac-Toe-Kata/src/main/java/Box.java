public class Box {

	public String state;

	public void Box() {
		this.state = "" ;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		if(state!="X" && state!="Y"){
			this.state = "";
		}
	}
}
