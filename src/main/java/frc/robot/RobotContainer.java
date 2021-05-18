// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.drivetrain.Drive;
import frc.robot.commands.pneumatics.ShiftDown;
import frc.robot.commands.pneumatics.ShiftUp;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;

/** Add your docs here. */
public class RobotContainer implements HardwareAdapter {

    public static Drivetrain dt = new Drivetrain();
    public static Pneumatics pn = new Pneumatics();

    public RobotContainer() {
        configDefaultCommands();
        configButtons();
    }

    public void configDefaultCommands() {
        dt.setDefaultCommand(new Drive());

        new ShiftDown().schedule();
    }

    public void configButtons() {
        xbox.leftBumper.whenPressed(new ShiftUp());
        xbox.leftBumper.whenReleased(new ShiftDown());
    }

}
