package frc.robot.subsystems;

public class RobotMap {

    
    public static class PlayerButton {
        public static final int FORCE_LOW_TRANSMISSION  = 2;
        public static final int CHASE_CARGO_1           = 3;
        public static final int ROTATE_ROLLERS_OUT_1    = 4;
        public static final int CHASE_CARGO_2           = 5;
        public static final int ROTATE_ROLLERS_OUT_2    = 6;
        public static final int CHASE_HATCH_1           = 7;
        public static final int CHASE_HATCH_2           = 8;
        public static final int INTAKE_CARGO_HUMAN_1    = 9;
        public static final int INTAKE_CARGO_HUMAN_2    = 10;
        public static final int INTAKE_CARGO_FLOOR_1    = 11;
        public static final int INTAKE_CARGO_FLOOR_2    = 12;
    }

    public static class DigitalInputPort {
        public static final int CLAW_SWITCH        =  0;
        public static final int UPPER_ARM_SWITCH   =  1;
        public static final int LOWER_ARM_SWITCH   =  2;
        public static final int INTAKE_OUT_SWITCH  =  3;
    }
 
    public static class AnalogPort {
        public static final int LEFT_PANEL_SENSOR  = 0;
        public static final int RIGHT_PANEL_SENSOR = 1;
    }
    
    public static class CANSparkID {
        public static final int LEFT_LEADER     = 1;
        public static final int LEFT_FOLLOWER   = 2;
        public static final int RIGHT_LEADER    = 3;
        public static final int RIGHT_FOLLOWER  = 4;
        public static final int INTAKE_NEO      = 5;
        public static final int SHOOTER_BOTTOM  = 6;
        public static final int SHOOTER_TOP     = 7;
        public static final int ARM_NEO         = 8;
        public static final int RIGHT_CLIMBER   = 9;
        public static final int LEFT_CLIMBER    = 10; 
    }

    public static class SolenoidPort {
        public static final int HATCH_GRAB        = 0;
        public static final int DRIVE_TRANS_1     = 1;
        public static final int DRIVE_TRANS_2     = 2;
        public static final int INTAKE_ROLLER_OUT = 3;
        public static final int INTAKE_ROLLER_IN  = 4;
        public static final int PANEL_INDICATOR_LIGHT = 7;
    }

    public static class CompressorPort {
        public static final int MAIN_COMPRESSOR   = 0;
    }

    public static class JoystickPort {
        public static final int Joystick_Port  = 0;
    }
    
   public static enum AutoMode {
        TEST, MOVE_FORWARD, MOVE_BACKWARD
    };

    public static class RobotType{
        public static final boolean isFinal = true;
    }

    public static class LimelightPipeline {
        public static final int HATCH = 0;
        public static final int CARGO = 1;
    }

}