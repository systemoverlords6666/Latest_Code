package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;


public class Encoders extends LinearOpMode
{

    DcMotor leftmotor = null;
    DcMotor rightmotor = null;

    @Override
    public void runOpMode() throws InterruptedException
    {
        leftmotor = hardwareMap.dcMotor.get("leftmotor");
        rightmotor = hardwareMap.dcMotor.get("rightmotor");

        leftmotor.setMode(DcMotorController);
    }
}
