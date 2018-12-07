package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EncoderPractice extends LinearOpMode {

    HardwarePushbot robot = new HardwarePushbot();

    static double MOTOR_TICK_COUNT = 1120;

    public void goforward(int tickstodrive, double power)
            throws InterruptedException {
        if (opModeIsActive()) {
            robot.lm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            robot.rm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            robot.lm.setPower(power);
            robot.rm.setPower(power);

        }
    }


        public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        telemetry.addData("Status", "Resetting Encoders");
        telemetry.update();

        // Wait for the game to start (drive presses PLAY)
        waitForStart();

        // drive forward for 500 millisecond
        robot.lm.setPower(1);
        robot.rm.setPower(1);
        sleep(500);

        // Stop all motion;
        robot.lm.setPower(0);
        robot.rm.setPower(0);

        //put code here for ticks instead of seconds
        double oneFoot=1886;




        robot.lm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);// This line of code sets the encoders at zero
        int lmNewTarget = robot.lm.getTargetPosition() + (int)oneFoot;
        int rmNewTarget= robot.rm.getTargetPosition() + (int)oneFoot;
        robot.lm.setTargetPosition(lmNewTarget);
        robot.rm.setTargetPosition(rmNewTarget);
        robot.lm.setPower(4);
        robot.rm.setPower(4);

        goforward((int) oneFoot,4 );

        robot.up.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        int upNewTarget = robot.up.getTargetPosition() + 1120;

        telemetry.addData("Path","Complete");
        telemetry.update();
    }
}
