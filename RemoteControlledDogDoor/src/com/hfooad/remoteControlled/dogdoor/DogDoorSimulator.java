package com.hfooad.remoteControlled.dogdoor;

public class DogDoorSimulator {
	public static void main(String[] args)
	{
		DogDoor door = new DogDoor();
		BarkRecognizer recognozer = new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside ..");
		recognozer.recognize(new Bark("Woof"));
		
		System.out.println("\nFido has gone outside..");
		
		System.out.println("\nFido's all done..");
		
		try{
			Thread.currentThread().sleep(10000);
		}
		catch(InterruptedException e){}
		
		System.out.println("... but he's stuck outside");
		
		System.out.println("\nFido starts barking");
		recognozer.recognize(new Bark("Woof"));
		
		System.out.println("\nFide's back inside..");

	}
}
