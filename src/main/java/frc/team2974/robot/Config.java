package frc.team2974.robot;

public class Config {

    public class Input {

        public class Joystick {
            public static final int LEFT_JOYSTICK_PORT = 0;
            public static final int RIGHT_JOYSTICK_PORT =1;
        }
    }

    public class Motor {
        public static final int LEFT_MOTOR_PORT = 0;
        public static final int RIGHT_MOTOR_PORT = 1;
        public static final int SOLENOID_PORT = 2;
    }

    public class Encoder {
        public static final int LEFT_ENCODER_CHANNEL = 0;
        public static final int RIGHT_ENCODER_CHANNEL = 1;
        public static final double ENCODER_DISTANCE_PER_PULSE = 0.000001;
    }
}