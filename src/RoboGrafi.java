import org.jointheleague.graphical.robot.Robot;

public class RoboGrafi {
public static void main(String[] args) {
Robot a=new Robot();	
a.miniaturize();
a.setSpeed(999);
a.penDown();
a.turn(90);
a.move(100);
a.turn(135);
a.move(100);
a.turn(225);
a.move(100);
}
}
