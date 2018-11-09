package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

abstract public class AutonomousRoutines extends LinearOpMode {

    DcMotor lm;
    DcMotor rm;


    public void init_6666(){
        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");

        lm.setDirection(DcMotor.Direction.REVERSE);
        waitForStart();
    }


    public void goforward(double tickstodrive, double speed){
        double lm_encoder_start_pos = 0;
        double rm_encoder_start_pos = 0;
        double lm_encoder_ticks;
        double rm_encoder_ticks;
        boolean destination_reached = false;


        lm_encoder_start_pos = lm.getCurrentPosition();
        rm_encoder_start_pos = rm.getCurrentPosition();

        while (destination_reached = false) {
            lm_encoder_ticks = lm.getCurrentPosition();
            rm_encoder_ticks = rm.getCurrentPosition();
            lm.setPower(speed);
            rm.setPower(speed);
            if (lm_encoder_ticks - lm_encoder_start_pos >= tickstodrive) {
                destination_reached = true;
            }
            if (rm_encoder_ticks - rm_encoder_start_pos >= tickstodrive){
                    destination_reached = true;

            }
            telemetry.addData("Left Motor Encoder Ticks", lm_encoder_ticks - lm_encoder_start_pos);
            telemetry.addData("Right Motor Encoder Ticks", rm_encoder_ticks - rm_encoder_start_pos);
            telemetry.update();
        }



        lm.setPower(0);
        rm.setPower(0);
    }
}

