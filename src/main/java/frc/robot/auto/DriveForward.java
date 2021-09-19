package frc.robot.auto;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.RobotContainer;

public class DriveForward extends CommandBase {
    private Timer timer = new Timer();
    private double time = 1.8;
    
    public DriveForward() {
        addRequirements(RobotContainer.dt);
    }

    @Override
    public void initialize() {
        timer.start();
    }

    @Override
    public void execute() {
        RobotContainer.dt.arcadeDrive(0.5,0);
    }

    @Override
    public void end(boolean interrupted) {
        RobotContainer.dt.arcadeDrive(0,0);
        timer.stop();
        timer.reset();
    }

    @Override
    public boolean isFinished() {
        return timer.get() > time;
    }
}
