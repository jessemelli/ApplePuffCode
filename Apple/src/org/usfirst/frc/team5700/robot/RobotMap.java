package org.usfirst.frc.team5700.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int flm = 1;
	public static final int frm = 2;
	public static final int blm = 3;
	public static final int brm = 4;
	public static final int LEFT_ARM_MOTOR = 5;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static final int RIGHT_ARM_MOTOR = 6;
    public static final int INTAKE_MOTOR = 7;
    public static final int WINCH_MOTOR = 8;
	public static final int RELEASE_SERVO = 9;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
