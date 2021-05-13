package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.HardwareAdapter;

public class Pneumatics extends SubsystemBase implements HardwareAdapter {
  public Pneumatics() {}

  public void setShifter(DoubleSolenoid.Value v) {
    shifter.set(v);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
