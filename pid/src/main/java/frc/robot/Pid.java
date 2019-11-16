/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * Add your docs here.
 */
public class Pid {
    double wanted_angle = 0;
    double current_angle = 0;
    double error = 0;
    double last_error = 0;
    double kI = 0;
    double integral = 0;
    double kP = 0;
    double kD = 0;
    double derivative = 0;
    double output = 0;

    public Pid(){
    }

    public double pid(double wanted_angle, double current_angle) {
        last_error = error;
        error = wanted_angle - current_angle;
        integral += error;
        derivative = error - last_error;
        output = (kI*integral) + (kP*error) + (kD*derivative);
        return output;
    }
}
