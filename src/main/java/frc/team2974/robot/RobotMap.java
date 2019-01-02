package frc.team2974.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

import static frc.team2974.robot.Config.Encoder.*;
import static frc.team2974.robot.Config.Motor.LEFT_MOTOR_PORT;
import static frc.team2974.robot.Config.Motor.RIGHT_MOTOR_PORT;
import static frc.team2974.robot.Config.Motor.SOLENOID_PORT;

public class RobotMap {
    public static Talon leftMotor = new Talon(LEFT_MOTOR_PORT);
    public static Talon rightMotor = new Talon(RIGHT_MOTOR_PORT);
    public static Encoder leftEncoder = new Encoder(LEFT_ENCODER_CHANNEL_A, LEFT_ENCODER_CHANNEL_B);
    public static Encoder rightEncoder = new Encoder(RIGHT_ENCODER_CHANNEL_A, RIGHT_ENCODER_CHANNEL_B);
    public static Solenoid solenoid = new Solenoid(SOLENOID_PORT);
}
