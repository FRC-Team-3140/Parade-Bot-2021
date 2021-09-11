package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class RetractClimber extends CommandBase {
  public RetractClimber() {
    addRequirements(RobotContainer.cl);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.cl.climberRetract();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.cl.climberOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // makes the motor stop upon releasing the dpad button
    return !RobotContainer.xbox.dpadDown.get();
  }
}