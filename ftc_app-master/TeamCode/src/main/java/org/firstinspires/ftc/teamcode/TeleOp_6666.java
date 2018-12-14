package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "TeleOp_")
public class TeleOp_6666 extends OpMode{


    DcMotor lm;
    DcMotor rm;
    DcMotor up;

    Servo ps;

    double leftwheelpower;
    double rightwheelpower;
    double upmotor;
    boolean pushservo;


    @Override
    public void init() {
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");
        ps = hardwareMap.servo.get("ps");



        rm.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftwheelpower = gamepad1.left_stick_y;
        rightwheelpower = gamepad1.right_stick_y;
        upmotor = gamepad2.left_stick_y;
        pushservo = gamepad2.a;


        lm.setPower(leftwheelpower);
        rm.setPower(rightwheelpower);
        up.setPower(upmotor);



    }

}
