package org.usfirst.frc.team5700.robot.commands;

import org.usfirst.frc.team5700.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ReelWinch extends Command {

    public ReelWinch() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.scaling);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.scaling.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.scaling.reel();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.scaling.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.scaling.stop();
    }
}
