package frc.team2974.robot.Subsystem;
import frc.team2974.robot.command.teleop.DriveCommand;
import org.waltonrobotics.AbstractDrivetrain;
import org.waltonrobotics.MotionLogger;

import static frc.team2974.robot.RobotMap.solenoid;

public class Drivetrain extends AbstractDrivetrain {

    public Drivetrain() {
        super(new MotionLogger("/home/lvuser"));
        setEncoderDistancePerPulse();
    }

    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new DriveCommand());
    }

    public static void shiftUp() {
        if (solenoid.get()) {
            solenoid.set(false);
        }
    }

    public static void shiftDown() {

    }

}
