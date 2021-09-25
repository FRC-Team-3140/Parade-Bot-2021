package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;

public class Climber extends SubsystemBase implements HardwareAdapter {
  public Climber() {
    // setFollowers();
    climberMaster.setNeutralMode(NeutralMode.Brake);
  }

  public void climberExtend() {
    climberMaster.set(1);
  }

  public void climberRetract() {
    if (getPosition() <= CLIMBER_MIN_HEIGHT) { //This line does not work, but it is here for now.
      climberOff();
    } else {
      climberMaster.set(-1);
  }

  public void climberOff() {
    climberMaster.set(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
