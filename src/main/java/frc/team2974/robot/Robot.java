package frc.team2974.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team2974.robot.Command.EncoderResetCommand;
import frc.team2974.robot.Subsystem.Drivetrain;
import org.waltonrobotics.command.SimpleLine;
import org.waltonrobotics.controller.Pose;

import static frc.team2974.robot.RobotMap.leftEncoder;
import static frc.team2974.robot.RobotMap.rightEncoder;

public class Robot extends TimedRobot {

    public static Drivetrain drivetrain;

    public void updateSmartDashboard() {
        SmartDashboard.putNumber("left encoder: ", leftEncoder.get());
        SmartDashboard.putNumber("right encoder: ", rightEncoder.get());
    }

    @Override
    public void robotInit() {
        drivetrain = new Drivetrain();
        drivetrain.cancelControllerMotion();
        SmartDashboard.putData("Encoder reset: ", new EncoderResetCommand());
        SmartDashboard.putData("Simple line: ", SimpleLine.lineWithDistance(new Pose(0, 0), 1));
        updateSmartDashboard();
    }

    @Override
    public void disabledInit() {
        drivetrain.cancelControllerMotion();
        updateSmartDashboard();
    }

    @Override
    public void autonomousInit() {
        drivetrain.cancelControllerMotion();
        drivetrain.startControllerMotion(new Pose(0,0));
        drivetrain.shiftUp();
        DriverStation.getInstance().getGameSpecificMessage();
        updateSmartDashboard();
    }

    @Override
    public void teleopInit() {
        drivetrain.cancelControllerMotion();

        updateSmartDashboard();
    }

    @Override
    public void testInit() {
        drivetrain.cancelControllerMotion();

        updateSmartDashboard();
    }


    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();

        updateSmartDashboard();
    }
    
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();

        updateSmartDashboard();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();

        updateSmartDashboard();
    }

    @Override
    public void testPeriodic() {
        Scheduler.getInstance().run();

        updateSmartDashboard();
    }
}
