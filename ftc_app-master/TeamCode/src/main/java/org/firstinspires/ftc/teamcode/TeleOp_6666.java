package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TeleOp")
public class TeleOp_6666 extends OpMode{


    DcMotor lm;
    DcMotor rm;
    DcMotor up;


    double leftwheelpower;
    double rightwheelpower;
    double upmotor;


    @Override
    public void init() {
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");




        rm.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftwheelpower = gamepad1.left_stick_y;
        rightwheelpower = gamepad1.right_stick_y;
        upmotor = gamepad2.left_stick_y;



        lm.setPower(leftwheelpower);
        rm.setPower(rightwheelpower);
        up.setPower(upmotor);

    }

}
