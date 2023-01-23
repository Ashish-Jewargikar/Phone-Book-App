
public class LandLine implements Phone {
	private String myPhoneNo;
	private boolean isRinging;
	private boolean isPowerOn;
	
	
     
	
	public LandLine(String myPhoneNo) {
		//super();
		this.myPhoneNo = myPhoneNo;
		this.isRinging = false;
		this.isPowerOn = true;
	}
	
	

	public String getMyPhoneNo() {
		return myPhoneNo;
	}



	public void setMyPhoneNo(String myPhoneNo) {
		this.myPhoneNo = myPhoneNo;
	}



	public boolean isPowerOn() {
		return isPowerOn;
	}



	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}



	public void setRinging(boolean isRinging) {
		this.isRinging = isRinging;
	}



	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		this.isPowerOn=true;
	}

	@Override
	public void callNumber(String phoneNo) {
		// TODO Auto-generated method stub
		if(isPowerOn==true) {
			System.out.println("you are dialing "+phoneNo);
		}else {
			System.out.println("call no received");
		}
		return;
	}

	@Override
	public void receiveCall(String phoneNo) {
		// TODO Auto-generated method stub
		if(isPowerOn==true && myPhoneNo.equals(phoneNo)) {
			this.isRinging=true;
			System.out.println("Hey "+myPhoneNo+" you are receiving a calls");
		}
		else {
			System.out.println("power off");
		}
	}

	@Override
	public boolean answerCall() {
		// TODO Auto-generated method stub
		if(isRinging==true) {
			System.out.println("Call answered");
			this.isRinging=false;
			return true;
		}
		return false;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		
		return isRinging;
	}
	
	

}
