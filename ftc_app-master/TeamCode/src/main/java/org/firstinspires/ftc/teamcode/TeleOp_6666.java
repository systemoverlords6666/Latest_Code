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
    Servo hs;

    double leftwheelpower;
    double rightwheelpower;
    double upmotor;
    boolean hookservo;

    @Override
    public void init() {
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("cm");
        hs = hardwareMap.servo.get("hs");



        rm.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void loop() {
        leftwheelpower = gamepad1.left_stick_y;
        rightwheelpower = gamepad1.right_stick_y;
        upmotor = gamepad2.left_stick_y;
        hookservo = gamepad2.a;
        hookservo = gamepad2.b;


        if (gamepad2.a)
        {
            hs.setPosition(1);
        }

        if (gamepad2.b)
        {
            hs.setPosition(0);
        }



        lm.setPower(leftwheelpower);
        rm.setPower(rightwheelpower);
        up.setPower(upmotor);

    }

}
