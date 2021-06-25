// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;

public class Drivetrain extends SubsystemBase implements HardwareAdapter {
  public Drivetrain() {
    setInverts();
    setSlaves();
    setBrakeMode();
  }

  public void arcadeDrive(double y, double x) {
    leftDriveMaster.set(y-x);
    rightDriveMaster.set(y+x);
  }

  public void tankDrive(double left, double right) {
    leftDriveMaster.set(left);
    rightDriveMaster.set(right);
  }

  private void setInverts() {
    leftDriveMaster.setInverted(false);
    leftDriveSlave.setInverted(true);
    leftDriveSlave2.setInverted(false);

    rightDriveMaster.setInverted(true);
    rightDriveSlave.setInverted(false);
    rightDriveSlave2.setInverted(true);

  }

  private void setSlaves() {
    leftDriveSlave.follow(leftDriveMaster);
    leftDriveSlave2.follow(leftDriveMaster);

    rightDriveSlave.follow(rightDriveMaster);
    rightDriveSlave2.follow(rightDriveMaster);

  }

  private void setBrakeMode() {
    leftDriveMaster.setNeutralMode(NeutralMode.Brake);
    leftDriveSlave.setNeutralMode(NeutralMode.Brake);
    leftDriveSlave2.setNeutralMode(NeutralMode.Brake);

    rightDriveMaster.setNeutralMode(NeutralMode.Brake);
    rightDriveSlave.setNeutralMode(NeutralMode.Brake);
    rightDriveSlave2.setNeutralMode(NeutralMode.Brake);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
