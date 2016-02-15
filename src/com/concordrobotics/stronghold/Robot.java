
package com.concordrobotics.stronghold;

import com.concordrobotics.stronghold.subsystems.*;
import com.concordrobotics.stronghold.CustomRobotDrive.MotorType;
import com.concordrobotics.stronghold.commands.*;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Command;
import com.kauailabs.navx.frc.AHRS;

/**
 * Concord Robotics FRC Team 1721
 * 2016 - FIRST STRONGHOLD
 * Robot.java
 *
 * This is the main class for the entire robot.
 * The VM is set to run this class before anything else.
 */
public class Robot extends IterativeRobot {
	/**
	 * Triggered when the robot is first initialized.
	 */
    public void robotInit() {
		//Init Subsystems
		RobotMap.driveTrain = new DriveTrain();
		RobotMap.shooter = new Shooter();
    	//Init OI
		RobotMap.oi = new OI();
		//Init motors
		RobotMap.dtLeft = new VictorSP(RobotMap.spLeftPort);
		RobotMap.dtRight = new VictorSP(RobotMap.spRightPort);
		RobotMap.dtLeftEnc = new Encoder(RobotMap.dtLeftEncPortA, RobotMap.dtLeftEncPortB, RobotMap.dtLeftEncReversed);
		RobotMap.dtRightEnc = new Encoder(RobotMap.dtRightEncPortA, RobotMap.dtRightEncPortA, RobotMap.dtRightEncReversed);
		RobotMap.shootL = new VictorSP(RobotMap.spShootLP);
		RobotMap.shootR = new VictorSP(RobotMap.spShootRP);
		RobotMap.shootA = new VictorSP(RobotMap.spShootAP);
		RobotMap.shootK = new Servo(RobotMap.spShootKP);
        //try {
            /* Communicate w/navX MXP via the MXP SPI Bus.                                     */
            /* Alternatively:  I2C.Port.kMXP, SerialPort.Port.kMXP or SerialPort.Port.kUSB     */
            /* See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface/ for details. */
            RobotMap.navx = new AHRS(SPI.Port.kMXP); 
            LiveWindow.addSensor("Gyro", "navx", RobotMap.navx);
        /*} catch (RuntimeException ex ) {
            DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
        } */
        RobotMap.navController = new NavxController("NavController", RobotMap.navP, RobotMap.navI, RobotMap.navD,
        		RobotMap.navF, RobotMap.navx);
        LiveWindow.addActuator("DriveTrain", "nav Controller", RobotMap.navController.getPIDController());

		RobotMap.robotDrive = new CustomRobotDrive(RobotMap.dtLeft, RobotMap.dtRight, RobotMap.dtLeftEnc, RobotMap.dtRightEnc, RobotMap.navController);
        LiveWindow.addActuator("DriveTrain", "LeftDriveController", RobotMap.robotDrive.getPIDController(MotorType.kLeft));
        LiveWindow.addActuator("DriveTrain", "RightDriveController", RobotMap.robotDrive.getPIDController(MotorType.kRight));
		RobotMap.driveTrain = new DriveTrain();
    }

    /**
     * Triggered when the robot is disabled (every time).
     */
    public void disabledInit(){

    }
    
    /**
     * Loops while the robot is disabled.
     */
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * Triggers when auto starts.
	 */
    public void autonomousInit() {
    }

    /**
     * Loops during auto.
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * Triggers when teleop starts.
     */
    public void teleopInit() {
    	
    }

    /**
     * Loops during teleop.
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        SmartDashboard.putNumber("heading", RobotMap.navx.getAngle());
        SmartDashboard.putNumber("gyroPIDOutput", RobotMap.navController.getPIDOutput());
    }

    /**
     * Loops during test.
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
