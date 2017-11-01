
public class ButtonPressed {

	public ButtonCalc getButton(int pressed){
		
		if (pressed == 1){
			return new Add();
		} else if (pressed == 2){
			return new Subtract();
		} else if (pressed == 3){
			return new Multiply();
		} else if (pressed == 4){
			return new Divide();
		} else {
			return null;
		}
	}
}
