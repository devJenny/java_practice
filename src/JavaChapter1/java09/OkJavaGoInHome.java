package JavaChapter1.java09;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {
    public static void main(String[] args) {

        String id = "JAVA APT 507";

        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1); // 올라갈 거니까, 1층으로 보내

        // Security off

        Security mySecurity = new Security(id);
        mySecurity.off(); // 보안 해제

        // Light on
        Lighting hallLamp = new Lighting(id+" / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id+" / floor Lamp");
        floorLamp.on();
    }
}
