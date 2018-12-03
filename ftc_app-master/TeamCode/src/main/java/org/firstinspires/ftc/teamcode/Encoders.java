package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

@Autonomous(name = "Encoders")
public class Encoders extends LinearOpMode
{

    DcMotor leftmotor = null;
    DcMotor rightmotor = null;

    @Override public void runOpMode() throws InterruptedException
    {
        leftmotor = hardwareMap.dcMotor.get("leftmotor");
        rightmotor = hardwareMap.dcMotor.get("rightmotor");

        leftmotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

    }
        public void DriveForwardDistance (double power, int distance)
        {
            // Reseting encoder
            leftmotor.setMode(DcMotor.RunMode.RESET_ENCODERS);
            rightmotor.setMode(DcMotor.RunMode.RESET_ENCODERS);

            // Setting target position
            leftmotor.setTargetPosition(distance);
            rightmotor.setTargetPosition(distance);

            //Setting to RUN_TO_POSTION mode
            leftmotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            rightmotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            //Set drive power
           DriveForward(power, distance);
        }

    private void DriveForward(double power, int distance) {
    }

    public void StopDriving()
        {

        }

        public void TurnLeft(double power)
        {
            leftmotor.setPower(-power);
            rightmotor.setPower(power);
        }

        public void TurnRight(double power)
        {
            leftmotor.setPower(power);
            rightmotor.setPower(power);
        }
}
