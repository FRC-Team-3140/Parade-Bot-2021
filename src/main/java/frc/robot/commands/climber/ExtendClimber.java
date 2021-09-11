package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ExtendClimber extends CommandBase {
  public ExtendClimber() {
    addRequirements(RobotContainer.cl);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.cl.climberExtend();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.cl.climberOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return !RobotContainer.xbox.dpadUp.get();
  }
}