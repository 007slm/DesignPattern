package Command;

public class Command {

	/*
	 * 实现Client Invoker Command Receiver的组合，将请求封装成对象
	 */
	public static void main(String[] args) {
		Control control = new Control();

		Light light = new Light();
		LightOn lightOn = new LightOn(light);
		LightOff lightOff = new LightOff(light);
		
		control.setCommand(lightOn);
		control.pressButton();
		control.setCommand(lightOff);
		control.pressButton();

		System.out.println("Party 组合模式");
		control.setCommand(lightOn, lightOff);
	}

}
