package de.infogk1.pacman;

public class KeyTrigger {

	int[] triggerCodes;
	boolean triggered = false;
	
	public KeyTrigger(int... triggerCodes){
		this.triggerCodes = triggerCodes;
	}
	
	public void checkTrigger(int keyCode, boolean setTo){
		for(int trigger : triggerCodes){
			if(trigger == keyCode){
				triggered = setTo;
				if(setTo) Listener.lastKey.push(this);
				else Listener.lastKey.removeElement(this);
				break;
			}
		}
	}
	
	public boolean isLastKey(){
		if(!Listener.lastKey.isEmpty() && Listener.lastKey.peek() == this && triggered) return true;
		else return false;
	}
	
}
