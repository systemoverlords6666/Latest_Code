package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

@Autonomous(name = "SensorColorDistance")

public class SensorColor extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {


        ColorSensor color_Sensor;
        color_Sensor = hardwareMap.colorSensor.get("color_Sensor");

        waitForStart();

        color_Sensor.red();     // Red color value
        color_Sensor.blue();    // Blue color value
        color_Sensor.green();   // Green color value

        color_Sensor.alpha();   // Total luminosity
        color_Sensor.argb();    // Combined color value

        if (color_Sensor.blue()>200)
        {

        }
    }
}
