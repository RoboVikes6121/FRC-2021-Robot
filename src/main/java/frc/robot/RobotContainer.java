/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.SetGyro;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  //creating sub systems
  private static DriveTrain DriveTrain = new DriveTrain();
  public static DriveTrain getDriveTrain(){
    return DriveTrain;
  } 
  private static SetGyro SetGyro = new SetGyro();
  public static SetGyro getSetGyro(){
    return SetGyro;
  }

  //creation of controllers 
  private final static XboxController mainDriveCon = new XboxController(Constants.MAINDRIVECON);

  //creation on controler one
  private static JoystickButton presitionButton = new JoystickButton(mainDriveCon, Constants.LEFTBUMPER);
  public static boolean getPresitionButton(){
    return presitionButton.get();
  } 

  //getting axies on a contraller
  public static double getDriveRawAxis(int axis) {
    return mainDriveCon.getRawAxis(axis);
  }
  
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  private void configureButtonBindings() {
  }

  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
   
