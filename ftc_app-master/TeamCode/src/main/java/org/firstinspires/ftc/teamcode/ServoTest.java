package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "Servo Test")

public class ServoTest extends OpMode {

    Servo testservo;
    boolean servoopen;


    ElapsedTime timer = new ElapsedTime();



    @Override
    public void init() {
        testservo = hardwareMap.servo.get("ts");
    }

    @Override
    public void loop() {

        if (gamepad1.a && servoopen == true && timer.seconds() >= .25){
            testservo.setPosition(0);
            servoopen = false;
            timer.reset();
        }

        if (gamepad1.a && servoopen == false && timer.seconds() >= .25){
            testservo.setPosition(1);
            servoopen = true ;
            timer.reset();
        }
    }
}
