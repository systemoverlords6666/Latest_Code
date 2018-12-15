package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "SensorColorDistance")

public class SensorColor extends LinearOpMode {

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
        ColorSensor color_Sensor;
        color_Sensor = hardwareMap.colorSensor.get("color_Sensor");

        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        waitForStart();

        color_Sensor.red();     // Red color value
        color_Sensor.blue();    // Blue color value
        color_Sensor.green();   // Green color value
        color_Sensor.alpha();   // Total luminosity
        color_Sensor.argb();    // Combined color value



        while(color_Sensor.blue()>200)
        {
            telemetry.addData("Status", "Deteced the color blue");    //
            telemetry.update();
            lm.setPower(.8);
            rm.setPower(.8);
            sleep(6000);
        }
        sleep(6000);
        telemetry.addData("Status", "Finished");    //
        telemetry.update();

    }
}
