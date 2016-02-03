package com.concordrobotics.stronghold;

import com.concordrobotics.stronghold.subsystems.DriveTrain;
import com.concordrobotics.stronghold.subsystems.Shooter;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/**
	 * MOTORS, MOTOR CONTROLLERS, ETC.
	 */
	/** 
	 * dtLeft, dtRight = drivetrain.
	 * shootL, shootR = shooter left/right CIMs.
	 * shootA = shooter angle.xc
	 */
	public static VictorSP dtLeft, dtRight, shootL, shootR, shootA;
	public static Servo shootK;

	/**
     * DRIVE TRAIN VARIABLES
     */
	public static final int spLeftPort = 0;
	public static final int spRightPort = 1;

	/**
     * SUBSYSTEMS
     */
	public static DriveTrain driveTrain;
	public static Shooter shooter;
	
	/**
	 * ROBOTDRIVE OBJECTS FOR TANK, ARCADE.
	 */
	public static RobotDrive tank;
	public static RobotDrive arcade;
	public static OI oi;

	/**
	 * SHOOTER VARIABLES
	 */
	public static final int spShootLP = 2;
	public static final int spShootRP = 3;
	public static final int spShootAP = 4;
	public static final int spShootKP = 5;
	
	public static final double sSpinupTime = 1.5;
	/**
	 *Joysticks, Input, and Buttons.
	 */
	public static final int jLeftPort = 1;
	public static final int jRightPort = 2;
	public static final int jOpPort = 3;

	/**
	 * BUTTON MAPPING
	 */
	public static final int jTrigger = 1;
}
