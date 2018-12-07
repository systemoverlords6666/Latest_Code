package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class AutonomousPeriod1208 extends LinearOpMode {

    DcMotor lm;
    DcMotor rm;

    @Override
    public void runOpMode() throws InterruptedException {

        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");

        rm.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();




    }
}
