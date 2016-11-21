package org.usfirst.frc.team5700.robot.subsystems;





import org.usfirst.frc.team5700.robot.commands.DriveWithJoysticks;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;


public class DriveTrain extends Subsystem {
	private SpeedController flm, blm,
							frm, brm;
	public RobotDrive go;
	public Object drive;

	public DriveTrain() {
		super();
		flm = new Talon(1);
		blm = new Talon(2);
		frm = new Talon(3);
		brm = new Talon(4);
		go = new RobotDrive(flm, blm,//front left motor, backleft etc.
							   frm, brm);
		

		// Encoders may measure differently in the real world and in
		// simulation. In this example the robot moves 0.042 barleycorns
		// per tick in the real world, but the simulated encoders
		// simulate 360 tick encoders. This if statement allows for the
		// real robot to handle this difference in devices.
	
		// Let's show everything on the LiveWindow
		LiveWindow.addActuator("Drive Train", "Front Left Motor", (Talon) flm);
		LiveWindow.addActuator("Drive Train", "Back Left Motor", (Talon) blm);
		LiveWindow.addActuator("Drive Train", "Front Right Motor", (Talon) frm);
		LiveWindow.addActuator("Drive Train", "Back Right Motor", (Talon) brm);
		
	}

	/**
	 * When no other command is running let the operator drive around
	 * using the PS3 joystick.
	 */
	public void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoysticks());
	}

	/**
	 * The log method puts interesting information to the SmartDashboard.
	 */
	

	/**
	 * Tank style driving for the DriveTrain.
	 * @param left Speed in range [-1,1]
	 * @param right Speed in range [-1,1]
	 * @return 
	 */
	public void drive (double left, double right) {
	go.drive(left, right);
	}


	/**
	 * @param joystick The ps3 style joystick to use to drive tank style.
	 */

	/**
	 * @return The robots heading in degrees.
	 */
	

	/**
	 * Reset the robots sensors to the zero states.
	 */
	

	/**
	 * @return The distance driven (average of left and right encoders).
	 */
	

	/**
	 * @return The distance to the obstacle detected by the rangefinder.
	 */
	



		



	

}
