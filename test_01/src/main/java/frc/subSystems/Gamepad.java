/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.subSystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
/**
 * Add your docs here.
 */
public class Gamepad extends Subsystem {
  private static Gamepad mInstance = new Gamepad();
  Joystick gamepad = new Joystick(0);
  XboxController gamepadx = new XboxController(0);

  public static Gamepad getInstance(){
      return mInstance;
  }

  public boolean getButtonA(){
  return gamepad.getRawButton(1);
  }

  public boolean getButtonB(){
      return gamepad.getRawButton(2);
      }

  public boolean getButtonX(){
      return gamepad.getRawButton(3);
  }

  public boolean getButtonY(){
      return gamepad.getRawButton(4);
  }

  public double getLAxisY(){
      return gamepad.getRawAxis(1);
  }

  public double getRAxisX(){
      return gamepad.getRawAxis(4);
  }
  public boolean getLB(){
      return gamepad.getRawButton(5);
  }
  public boolean getRB(){
      return gamepad.getRawButton(6);
  }
  public boolean getRBpressed(){
      return gamepad.getRawButtonReleased(6);
  }

  public boolean getYpressed(){
      return gamepad.getRawButtonReleased(4);
  }



  public double getRTrigger(){
      return gamepad.getRawAxis(3);
  }


  public double getLTrigger(){
      return gamepad.getRawAxis(2);
  }
  public double getLAxisX(){
      return gamepad.getRawAxis(0);
  }public double returnTrigger(){
      return getRTrigger()-getLTrigger();
  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
