package frc.team2974.robot.Subsystem;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team2974.robot.Command.DriveCommand;
import org.waltonrobotics.AbstractDrivetrain;
import org.waltonrobotics.MotionLogger;
import org.waltonrobotics.controller.RobotPair;

import static frc.team2974.robot.Config.Encoder.ENCODER_DISTANCE_PER_PULSE;
import static frc.team2974.robot.Config.Input.IntakeButtons.LEFT_INTAKE_PORT;
import static frc.team2974.robot.Config.Input.IntakeButtons.RIGHT_INTAKE_PORT;
import static frc.team2974.robot.OI.leftJoystick;
import static frc.team2974.robot.OI.rightJoystick;
import static frc.team2974.robot.RobotMap.*;

public class Drivetrain extends AbstractDrivetrain {

    public Drivetrain() {
        super(new MotionLogger("/home/lvuser"));
        setEncoderDistancePerPulse();
    }


    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new DriveCommand());
    }

    //Intake State
    public static boolean leftIntakeState = false;
    public static boolean rightIntakeState = false;

    public static void initialIntakeState() {
        SmartDashboard.putString("Left intake state: ", "False");
        SmartDashboard.putString("Right intake state: ", "False");
    }

    public static void leftIntake() {
        if (leftJoystick.getRawButton(LEFT_INTAKE_PORT)) {
            leftIntakeState = true;
            SmartDashboard.putString("Left intake state: ", "True");
        } else {
            SmartDashboard.putString("Left intake state: ", "False");
        }
    }

    public static void rightIntake() {
        if (rightJoystick.getRawButton(RIGHT_INTAKE_PORT)) {
            rightIntakeState = true;
            SmartDashboard.putString("Right intake state: ", "True");
        } else {
            SmartDashboard.putString("Right intake state: ", "False");
        }
    }

    public static void shiftUp() {
        if (solenoid.get()) {
            solenoid.set(false);
        }
    }

    public static void shiftDown() {
        if (solenoid.get()) {
            solenoid.set(true);
        }
    }

    @Override
    public RobotPair getWheelPositions() {
        return new RobotPair(rightEncoder.getDistance(), leftEncoder.getDistance(), Timer.getFPGATimestamp());
    }

    @Override
    public double getRobotWidth() {
        return 1;
    }

    @Override
    public void reset() {

    }

    @Override
    public void setSpeeds(double left, double right) {
        leftMotor.set(left);
        rightMotor.set(right);
    }

    @Override
    public void setEncoderDistancePerPulse() {
        leftEncoder.setDistancePerPulse(ENCODER_DISTANCE_PER_PULSE);
        rightEncoder.setDistancePerPulse(ENCODER_DISTANCE_PER_PULSE);
    }

    @Override
    public double getKV() {
        return 0;
    }

    @Override
    public double getKAcc() {
        return 0;
    }

    @Override
    public double getKK() {
        return 0;
    }

    @Override
    public double getKS() {
        return 0;
    }

    @Override
    public double getKAng() {
        return 0;
    }

    @Override
    public double getKL() {
        return 0;
    }

    @Override
    public double getILag() {
        return 0;
    }

    @Override
    public double getIAng() {
        return 0;
    }

    @Override
    public double getMaxVelocity() {
        return 0;
    }

    @Override
    public double getMaxAcceleration() {
        return 0;
    }
}
