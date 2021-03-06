package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous (name = "First Autonomous")
public class FirstAutonomous extends LinearOpMode {


    DcMotor lm;
    DcMotor rm;
    DcMotor up;
    @Override
    public void runOpMode() throws InterruptedException{
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");

        rm.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();

        up.setPower(.4);
        sleep(4250);



        lm.setPower(.8);
        rm.setPower(.8);
        sleep(4500);

        up.setPower(-.4);
        sleep(2500);




    }
}