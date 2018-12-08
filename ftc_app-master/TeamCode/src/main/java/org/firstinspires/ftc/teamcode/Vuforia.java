package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaBase;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaRoverRuckus;

@Autonomous(name = "Vuforia")
public class Vuforia extends LinearOpMode {

    private VuforiaRoverRuckus vuforiaRoverRuckus;


    DcMotor lm;
    DcMotor rm;
    DcMotor up;


    @Override
    public void runOpMode() {
        VuforiaBase.TrackingResults BlueResults;
        VuforiaBase.TrackingResults BackResults;
        VuforiaBase.TrackingResults FrontResults;

        rm.setDirection(DcMotor.Direction.REVERSE);
        VuforiaBase.TrackingResults RedResults;


        lm = hardwareMap.dcMotor.get("lm");
        rm = hardwareMap.dcMotor.get("rm");
        up = hardwareMap.dcMotor.get("up");


        vuforiaRoverRuckus = new VuforiaRoverRuckus();

        // Put initialization blocks here.
        vuforiaRoverRuckus.initialize("", VuforiaLocalizer.CameraDirection.FRONT,
                true, true, VuforiaLocalizer.Parameters.CameraMonitorFeedback.AXES,
                0, 0, 0, 0, 0, 0, true);
        waitForStart();

        if (opModeIsActive()) {
            vuforiaRoverRuckus.activate();

            while (opModeIsActive()) {

                BlueResults = vuforiaRoverRuckus.track("BluePerimeter");
                RedResults = vuforiaRoverRuckus.track("RedPerimeter");
                FrontResults = vuforiaRoverRuckus.track("FrontPerimeter");
                BackResults = vuforiaRoverRuckus.track("BackPerimeter");

/*
                rm.setPower(.7);
                lm.setPower(-.7);
                sleep(1500);

*/
                if (BlueResults.isVisible) {
                    telemetry.addData("VuMark", "BlueRover");
                    telemetry.update();
                }

                if (BackResults.isVisible) {
                    telemetry.addData("VuMark", "BackSpace");
                    telemetry.update();
                }

                if (FrontResults.isVisible) {
                    telemetry.addData("VuMark", "FrontCraters");
                    telemetry.update();
                }

                if (RedResults.isVisible) {
                    telemetry.addData("VuMark", "RedFootprint");
                    telemetry.update();
                }

            }
        }
        vuforiaRoverRuckus.close();
    }
}

