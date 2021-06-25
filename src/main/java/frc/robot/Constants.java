// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;

/** Add your docs here. */
public interface Constants {

    // XBOX
    public static final int XBOX_PORT = 0;
    public static final double DEADBAND = 0.05;
    public static final double SPEED_MULTIPLIER = 0.5;
    public static final double TURN_MULTIPLIER = 0.5;

    // ROBOT
    public static final int PDP = 0;
    public static final int PCM = 1;

    // DRIVETRAIN
    public static final int LEFT_DRIVE_MASTER = 2;
    public static final int LEFT_DRIVE_SLAVE = 4;    
    public static final int LEFT_DRIVE_SLAVE2 = 6;

    public static final int RIGHT_DRIVE_MASTER = 3;
    public static final int RIGHT_DRIVE_SLAVE = 5;
    public static final int RIGHT_DRIVE_SLAVE2 = 7;

    // PNEUMATICS
    public static final int SHIFTER_EXT = 0;
    public static final int SHIFTER_RET = 1;

    public final DoubleSolenoid.Value EXT = DoubleSolenoid.Value.kForward;
    public final DoubleSolenoid.Value RET = DoubleSolenoid.Value.kReverse;
    public final DoubleSolenoid.Value OFF = DoubleSolenoid.Value.kOff;


}
