// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.drivetrain;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.HardwareAdapter;
import frc.robot.RobotContainer;

public class Drive extends CommandBase implements HardwareAdapter{
  /** Creates a new Drive. */
  public Drive() {
    addRequirements(RobotContainer.dt);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //RobotContainer.dt.arcadeDrive(SPEED_MULTIPLIER * xbox.getSmoothedMainY(), TURN_MULTIPLIER * xbox.getSmoothedAltX() );
    RobotContainer.dt.tankDrive(SPEED_MULTIPLIER_LEFT * xbox.getSmoothedMainY(), SPEED_MULTIPLIER_RIGHT * xbox.getSmoothedAltY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
