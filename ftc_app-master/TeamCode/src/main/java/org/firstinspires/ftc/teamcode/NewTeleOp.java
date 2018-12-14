package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp(name = "NewTeleOp")
public class NewTeleOp extends LinearOpMode
{
    DcMotor lm;
    DcMotor rm;
    DcMotor up;

    Servo ps;

    static final double PUSHED_OUT = 1;
    static final double PULLED_IN = 0;



    @Override
    public void runOpMode() throws InterruptedException
    {
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");
        ps = hardwareMap.servo.get("ps");

        rm.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();

        while(opModeIsActive())
        {
           lm.setPower(-gamepad1.left_stick_y);
           rm.setPower(-gamepad1.right_stick_y);
           up.setPower(-gamepad2.left_stick_y);

           if (gamepad2.a)
           {
               ps.setPosition(PUSHED_OUT);
           }

           if (gamepad2.b)
           {
               ps.setPosition(PULLED_IN);
           }

           telemetry.addData("Status", "Run Time");
           telemetry.update();
            idle();
        }
    }
}
