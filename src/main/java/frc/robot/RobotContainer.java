// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

// imports

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final Drive drive = new Drive();
  private final Pivot pivot = new Pivot();
  private final Arm arm = new Arm();
  private final Wrist wrist = new Wrist();
  private final Intake intake = new Intake();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  Drive getDrive() {
    return drive;
  }

  Pivot getPivot() {
      return pivot;
  }

  Arm getArm() {
      return arm;
  }

  Wrist getWrist() {
      return wrist;
  }

  Intake getIntake() {
      return intake;
  }

  private void configureBindings() {

  }

  public Command getAutonomousCommand() {
      AutoRoutine selectedRoutine = ShuffleboardData.routineChooser.getSelected();
      return selectedRoutine.getCommand();
  }
}
