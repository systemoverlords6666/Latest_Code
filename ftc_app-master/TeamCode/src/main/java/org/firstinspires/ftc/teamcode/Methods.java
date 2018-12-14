package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Methods extends LinearOpMode {


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

        DriveForward(.1);
        sleep(2000);


    }

    public void DriveForward (double power)
    {
        lm.setPower(power);
        rm.setPower(power);
    }

    public void StopDriving ()
    {
        lm.setPower(0);
        rm.setPower(0);
    }

    public void TurnRight (double power)
    {
        lm.setPower(power);
        rm.setPower(-power);
    }

    public void TurnLeft (double power)
    {
        lm.setPower(-power);
        rm.setPower(power);

    }

    public void LiftUp (double power)
    {
        up.setPower(power);
    }

    public void LiftDown (double power)
    {
        up.setPower(-power);
    }

    public void StopLift ()
    {
        up.setPower(0);
    }


}
