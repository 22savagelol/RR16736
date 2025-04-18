package org.firstinspires.ftc.teamcode.Config;

public class Pose {
    public static double adriveMultiple = 1; //drive default movement
    public static double driveVelocity = (50* adriveMultiple); //default is 50
    public static double driveMinAccel =  -30; //default is -30
    public static double driveMaxAccel = (50* adriveMultiple); //default is 50
    public static double driveMinAngle = Math.PI * adriveMultiple; //default is Math.PI
    public static double driveMaxAngle = Math.PI * adriveMultiple; //default is Math.PI

    //vertical slide
    public static double verticalSlideHighBasket = 888;
    public static double verticalSlideBottom = 0;
    public static double verticalVelocity = 5000;

    //vertical tilt
    public static double verticalTiltTransfer = .07;
    public static double verticalTiltWall = .42;
    public static double verticalTiltBasket = .5;

    //vertical wrist
    public static double verticalWristTransfer = .705;
    public static double verticalWristHover = .65;
    public static double verticalWristWall = 0;
    public static double verticalWristBasket = .4;

    //vertical grabber
    public static double verticalGrabberClose = .41;
    public static double verticalGrabberCloseHard = .39;
    public static double verticalGrabberOpen = .66;

    //horizontal slide
    public static double horizontalSlideRetract = .3;
    public static double horizontalSlideExtend = .7;
    public static double horizontalSlideTransfer = .3;

    //horizontal wrist
    public static double horizontalWristIntake = .93;
    public static double horizontalWristHover = .84;
    public static double horizontalWristUp = .54;


    //global variable
    public static boolean blue = false;
    public static boolean red = false;

    public static double[] yellowThreshold = {1000, 200, 1000};
    public static double[] redThreshold = {700, 170, 300};
    public static double[] blueThreshold = {1200, 2900, 1900};
    public static double[] nonThreshold = {1300, 2100, 1800};
}
