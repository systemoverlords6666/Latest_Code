package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous (name = "AutonomousPeriod1208")
public class AutonomousPeriod1208 extends LinearOpMode {

    DcMotor lm;
    DcMotor rm;
    DcMotor up;

    @Override
    public void runOpMode() throws InterruptedException {

        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");

        rm.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        up.setPower(.2);
        sleep(2000);




    }
}
