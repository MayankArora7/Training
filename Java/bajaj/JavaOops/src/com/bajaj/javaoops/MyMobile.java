package com.bajaj.javaoops;

interface FeaturesMobile {
	public void calling();
	public void sendSMS();
	public void playGame();
}

abstract class SimCardHolder {
	public void simCard() {
		System.out.println("Normal sim card");
	}
	
	abstract void hybridSimCard();
}
class SmartMobile extends SimCardHolder implements FeaturesMobile {
//	Additional features in smart phone
	public void OS() {
		System.out.println("Android");
	}
	
	public void videoCalling() {
		System.out.println("Video Calling");
	}
	
//	Features taken from feature phone
	@Override
	public void calling() {
		System.out.println("Calling");
	}

	@Override
	public void sendSMS() {
		System.out.println("Send SMS");
	}

	@Override
	public void playGame() {
		System.out.println("Play Game");
	}
	
	@Override
	void hybridSimCard() {
//		System.out.println("Sim card or memory card");
	}
}
public class MyMobile {
	public static void main(String[] args) {
		/*SmartMobile mobile = new SmartMobile();
		mobile.calling();
		mobile.hybridSimCard();
		mobile.playGame();
		mobile.sendSMS();
		mobile.simCard();*/
		
//		Anonymous class (Inner class)
		SimCardHolder sim = new SimCardHolder() {
			
			@Override
			void hybridSimCard() {
				System.out.println("Sim card or memory card");
			}
		};
		sim.simCard();
		sim.hybridSimCard();
		
//		child class reference to parent
		FeaturesMobile mobile = new SmartMobile();
		mobile.calling();
	}
}
