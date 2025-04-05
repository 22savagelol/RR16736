package org.firstinspires.ftc.teamcode.Config;

public class RobotConfig {
    public double[] config = new double[19];
    public static int selection = 0;

     public double setConfig(int pick){
        if(selection == 1){
            //First Robot
            config[0] = .001978956002; //inPerTick
            config[1] = 0.001476078562026779; //lateralInPerTick
            config[2] = 7838.38; //trackWidthTicks
            config[3] = 1.743513259298552; //kS
            config[4] = 0.00024448357470530834; //kV
            config[5] = 0.00000001; //kA
            config[6] = Pose.driveVelocity; //maxWheelVel
            config[7] = Pose.driveMinAccel; //minProfileAccel
            config[8] = Pose.driveMaxAccel; //maxProfileAccel
            config[9] = Pose.driveMinAngle; //maxAngVel
            config[10] = Pose.driveMaxAngle; //maxAngAccel
            config[11] = 1; //axialGain
            config[12] = 1; //lateralGain
            config[13] = 1; //headingGain
            config[14] = 0.0; //axialVelGain
            config[15] = 0.0; //lateralVelGain
            config[16] = 0.0; //headingVelGain
            config[17] =  .375; //parYTicks
            config[18] =  -.0675; //perpXTicks
            return config[pick];
        } else {
            //Second Robot
            config[0] = .001978956002; //inPerTick
            config[1] = 0.7665571658951872; //lateralInPerTick
            config[2] = 12.909184083483952; //trackWidthTicks
            config[3] = 2.41630800809041; //kS
            config[4] = 0.12578307198549346; //kV
            config[5] = 0.001; //kA
            config[6] = Pose.driveVelocity; //maxWheelVel
            config[7] = Pose.driveMinAccel; //minProfileAccel
            config[8] = Pose.driveMaxAccel; //maxProfileAccel
            config[9] = Pose.driveMinAngle; //maxAngVel
            config[10] = Pose.driveMaxAngle; //maxAngAccel
            config[11] = 1.5; //axialGain
            config[12] = 8; //lateralGain
            config[13] = 2; //headingGain
            config[14] = 0.0; //axialVelGain
            config[15] = 0.0; //lateralVelGain
            config[16] = 0.0; //headingVelGain
            config[17] = 80/25.4; //parYTicks todo run angular ramp logger to figure this out, it not based on inches
            config[18] = 81.0/25.4; //perpXTicks
            return config[pick];
        }
    }

}
