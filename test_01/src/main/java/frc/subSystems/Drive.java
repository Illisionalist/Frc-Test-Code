/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subSystems;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drive extends Subsystem {
  public DifferentialDrive robotDrive;
  public VictorSP motorRight;
  public VictorSP motorLeft;
  public Drive(){
    motorRight = new VictorSP(0);
    motorLeft = new VictorSP(1);
    //motorLeft.setInverted(true);
    //motorRight.setInverted(true);
    robotDrive = new DifferentialDrive(motorLeft, motorRight);
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
