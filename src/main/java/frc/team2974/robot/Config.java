package frc.team2974.robot;

public class Config {

    public class Input {

        public class Joystick {
            public static final int LEFT_JOYSTICK_PORT = 0;
            public static final int RIGHT_JOYSTICK_PORT = 1;
        }


        //Intake Ports
        public class IntakeButtons {
            public static final int LEFT_INTAKE_PORT = 0;
            public static final int RIGHT_INTAKE_PORT = 1;
        }


        public class Buttons {
            public static final int SHIFT_UP_PORT = 2;
            public static final int SHIFT_DOWN_PORT = 3;
        }

        public class Deadzone {
            public static final double CONTROLLER_DEADZONE = 0.5;
        }
    }




    public class Motor {
        public static final int LEFT_MOTOR_PORT = 0;
        public static final int RIGHT_MOTOR_PORT = 1;
        public static final int SOLENOID_PORT = 2;
    }

    public class Encoder {
        public static final int LEFT_ENCODER_CHANNEL_A = 0;
        public static final int LEFT_ENCODER_CHANNEL_B = 2;
        public static final int RIGHT_ENCODER_CHANNEL_A = 1;
        public static final int RIGHT_ENCODER_CHANNEL_B = 3;
        public static final double ENCODER_DISTANCE_PER_PULSE = 0.000001;
    }
}