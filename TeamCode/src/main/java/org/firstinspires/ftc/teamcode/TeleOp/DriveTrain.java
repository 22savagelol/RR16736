package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.RR.MecanumDrive;

public class DriveTrain {
    DcMotorEx leftFront, rightFront, leftBack, rightBack; MecanumDrive drive;
    double botHeading, slow; double THROTTLE = .8;
    boolean field;
    public DriveTrain(DcMotorEx leftFront, DcMotorEx rightFront, DcMotorEx leftBack, DcMotorEx rightBack, MecanumDrive drive, boolean field) {
        this.leftFront = leftFront;
        this.rightFront = rightFront;
        this.leftBack = leftBack;
        this.rightBack = rightBack;
        this.drive = drive;
        this.field = field;
    }
    public void drive(double leftStickY, double leftStickX, double rightStickX, double precise, double startSpeed) {
        if(field) {
            //take input from gamepad
            double y = -leftStickY;
            double x = leftStickX;
            double rx = rightStickX;

            slow = precise * (1 - startSpeed) + startSpeed;

            botHeading = drive.localizer.getPose().heading.toDouble() - Math.toRadians(90);
            //Rotate the movement direction counter to the bot's rotation
            double rotX = x * Math.cos(-botHeading) - y * Math.sin(-botHeading);
            double rotY = x * Math.sin(-botHeading) + y * Math.cos(-botHeading);
            //counter robot imperfect strafing
            rotX = rotX * 1.1;

            double denominator = Math.max(Math.abs(rotY) + Math.abs(rotX) + Math.abs(rx), 1);
            double frontLeftPower = (rotY + rotX + rx) / denominator;
            double rearLeftPower = (rotY - rotX - rx) / denominator;
            double frontRightPower = (rotY - rotX + rx) / denominator;
            double rearRightPower = (rotY + rotX - rx) / denominator;

            leftFront.setPower(frontLeftPower * slow);
            rightFront.setPower(frontRightPower * slow);
            leftBack.setPower(rearLeftPower * slow);
            rightBack.setPower(rearRightPower * slow);
        } else {
            double y = leftStickY;
            double x = -leftStickX;
            double rx = -rightStickX;

            slow = precise * (1 - startSpeed) + startSpeed;

            x = x * THROTTLE;
            y = y * THROTTLE;
            rx = rx * THROTTLE;

            double frontLeft = x + y - rx;
            double frontRight = -x + y + rx;
            double backLeft = -x + y - rx;
            double backRight = x + y + rx;

            rightFront.setPower(frontRight * slow);
            leftFront.setPower(frontLeft * slow);
            rightBack.setPower(backRight * slow);
            leftBack.setPower(backLeft * slow);
        }
    }
}
