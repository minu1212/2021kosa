package multi_implement;

import interface_declaration.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		
		RemoteControl rc = (RemoteControl)st;
		Searchable sc = (Searchable)st;
		rc.turnOn();
		rc.turnOff();
//		sc.search("Á¶¹Î¿ì");
	}
}
