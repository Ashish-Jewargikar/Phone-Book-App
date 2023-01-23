
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LandLine l1 = new LandLine("123");
        LandLine l2 = new LandLine("345");       
        l1.callNumber("345");
        l2.receiveCall("345");
        System.out.println(l2.answerCall());
	}

}
