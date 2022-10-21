package polymorphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{
	public SonySpeaker() {
		System.out.println("===>SonySpeaker객체 생성");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker--- 소리 울린다.");
	}
	
	public void volumeDown() {
		System.out.println("SonySpeaker--- 소리 내린다.");
	}
}
