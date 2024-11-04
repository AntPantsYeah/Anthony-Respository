// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class ExampleSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {}
  CANSparkMax armMotor = new CANSparkMax(ArmConstants.ARM_ID, MotorType.kBrushless);
  //DigitalInput lowerLimitSwitch = new DigitalInput(channel:0);
  //DigitalInput upperLimitSwitch = new DigitalInput(channel:1);
   * Example command factory method.
   *
   public ExampleSubsystem() {}

  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }
  public Command upCommand () {
    return startEnd(()->{
        armMotor.set(ArmConstants.ARM_SPEED);/* 
      }, ()->{x
        armMotor.set(0);
      });*/
  }
  public Command downCommand () {
    return startEnd(()->{
        armMotor.set(-ArmConstants.ARM_SPEED);
      }, ()->{
        armMotor.set(0);
      });
  }
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
