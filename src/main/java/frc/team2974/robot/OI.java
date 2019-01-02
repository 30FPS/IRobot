package frc.team2974.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import static frc.team2974.robot.Config.Input.Buttons.SHIFT_DOWN_PORT;
import static frc.team2974.robot.Config.Input.Buttons.SHIFT_UP_PORT;
import static frc.team2974.robot.Config.Input.Joystick.LEFT_JOYSTICK_PORT;
import static frc.team2974.robot.Config.Input.Joystick.RIGHT_JOYSTICK_PORT;

public class OI {
    public static final Joystick leftJoystick = new Joystick(LEFT_JOYSTICK_PORT);
    public static final Joystick rightJoystick = new Joystick(RIGHT_JOYSTICK_PORT);
    public static final JoystickButton shiftUp = new JoystickButton(leftJoystick, SHIFT_UP_PORT);
    public static final JoystickButton shiftDown = new JoystickButton(rightJoystick, SHIFT_DOWN_PORT);
}
