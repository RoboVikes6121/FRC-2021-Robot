/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Auton;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

public class MoveAuton extends CommandBase {

  private DriveTrain m_DriveTrain;
  double speed;
  double distance;

  boolean isDone;

  //sets up command
  public MoveAuton(DriveTrain driveTrain, double speedi, double distancei) {
    m_DriveTrain = driveTrain;
    addRequirements(m_DriveTrain);

    if(distancei > 0) speed = speedi;
    if(distancei < 0) speed = -speedi;
    distance = Math.abs(distancei);
    isDone = false;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_DriveTrain.driveAuton(speed);
    if(distance >= m_DriveTrain.getAvragePos()) isDone = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_DriveTrain.end();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isDone;
  }
}
