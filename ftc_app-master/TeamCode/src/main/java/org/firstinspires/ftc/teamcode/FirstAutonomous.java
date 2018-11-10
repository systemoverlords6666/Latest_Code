package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous (name = "First Autonomous")
public class FirstAutonomous extends LinearOpMode {


    DcMotor lm;
    DcMotor rm;

    @Override
    public void runOpMode() throws InterruptedException{
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");

        rm.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        lm.setPower(.4);
        rm.setPower(.4);
        sleep(3000);

        lm.setPower(-.4);
        rm.setPower(-.4);
        sleep(3000);

        lm.setPower(.4);
        rm.setPower(-.4);
        sleep(3000);

        lm.setPower(0);
        rm.setPower(0);

    }
}