package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by jb2017 on 1/14/18.
 */

public class MyFirstOpMode extends LinearOpMode {
    private DcMotor motor;

    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");

        telemetry.addData("Status", "Initialized");

        waitForStart();

        while (opModeIsActive()) {
            motor.setPower(gamepad1.left_stick_y);
            
        }
    }
}
