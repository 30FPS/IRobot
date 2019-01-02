package frc.team2974.robot.Command;

import edu.wpi.first.wpilibj.command.Command;

import static frc.team2974.robot.Config.Input.Deadzone.CONTROLLER_DEADZONE;
import static frc.team2974.robot.OI.*;
import static frc.team2974.robot.Robot.drivetrain;

public class DriveCommand extends Command {

    public DriveCommand() {
        requires(drivetrain);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void execute() {
        double leftPos = leftJoystick.getY();
        double rightPos = rightJoystick.getY();

        if (Math.abs(leftPos) < CONTROLLER_DEADZONE) {
            leftPos = 0;
        }
        if (Math.abs(rightPos) < CONTROLLER_DEADZONE) {
            rightPos = 0;
        }

        drivetrain.setSpeeds(leftPos, rightPos);

        if(shiftUp.get()) {
            drivetrain.shiftUp();
        } else if (shiftDown.get()) {
            drivetrain.shiftDown();
        }
    }

    @Override
    protected void end() {
        super.end();
    }
}
