package org.firstinspires.ftc.teamcode.Config;

public class Pose {
    public static double adriveMultiple = 1; //drive default movement
    public static double driveVelocity = (50* adriveMultiple); //default is 50
    public static double driveMinAccel =  -30; //default is -30
    public static double driveMaxAccel = (50* adriveMultiple); //default is 50
    public static double driveMinAngle = Math.PI * adriveMultiple; //default is Math.PI
    public static double driveMaxAngle = Math.PI * adriveMultiple; //default is Math.PI

    //vertical slide
    public static double verticalSlideHighBasket = 0;
    public static double verticalVelocity = 5000;

    //vertical tilt
    public static double verticalTiltTransfer = .07;
    public static double verticalTiltWall = .42;

    //vertical wrist
    public static double verticalWristTransfer = .71;
    public static double verticalWristWall = 0;

    //vertical grabber
    public static double verticalGrabberClose = .41;
    public static double verticalGrabberCloseHard = .39;
    public static double verticalGrabberOpen = .66;

    //horizontal slide
    public static double horizontalSlideRetract = .25;
    public static double horizontalSlideExtend = .7;

    //horizontal wrist
    public static double horizontalWristIntake = .93;
    public static double horizontalWristHover = .84;
    public static double horizontalWristUp = .54;


    //global variable
    public static boolean blue = false;
    public static boolean red = false;

    public static double blueThreshold = 100;

    public static double[] yellowThreshold = {1000, 200, 1000};
}
