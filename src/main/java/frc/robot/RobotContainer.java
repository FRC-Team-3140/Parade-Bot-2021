// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.drivetrain.Drive;
import frc.robot.subsystems.Drivetrain;

/** Add your docs here. */
public class RobotContainer implements HardwareAdapter {

    public static Drivetrain dt = new Drivetrain();

    public RobotContainer() {
        configDefaultCommands();
    }

    public void configDefaultCommands() {
        dt.setDefaultCommand(new Drive());
    }

}
