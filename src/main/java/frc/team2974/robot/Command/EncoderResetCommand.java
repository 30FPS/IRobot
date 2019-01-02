package frc.team2974.robot.Command;

import edu.wpi.first.wpilibj.command.InstantCommand;

import static frc.team2974.robot.RobotMap.leftEncoder;
import static frc.team2974.robot.RobotMap.rightEncoder;

public class EncoderResetCommand extends InstantCommand {

    @Override
    public synchronized void start() {
        super.start();
    }

    public EncoderResetCommand() {
        leftEncoder.reset();
        rightEncoder.reset();
    }
}
