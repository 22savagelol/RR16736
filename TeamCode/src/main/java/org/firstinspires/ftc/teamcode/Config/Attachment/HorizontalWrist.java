package org.firstinspires.ftc.teamcode.Config.Attachment;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ServoImplEx;

import org.firstinspires.ftc.teamcode.Config.Port;

public class HorizontalWrist {
    ServoImplEx horizontalWristLeft, horizontalWristRight;
    public HorizontalWrist(HardwareMap hardwareMap){
        horizontalWristLeft = hardwareMap.get(ServoImplEx.class, Port.HORIZONTAL_WRIST_LEFT);
        horizontalWristRight = hardwareMap.get(ServoImplEx.class, Port.HORIZONTAL_WRIST_RIGHT);
//        horizontalWristPose();
    }
    private class HorizontalWristAction implements Action{
        double pose;
        public HorizontalWristAction(double pose){
            this.pose = pose;
        }
        @Override
        public boolean run(@NonNull TelemetryPacket telemetryPacket) {
            return false;
        }
    }
    public Action horizontalWristAction(double pose){return new HorizontalWristAction(pose);}
    public void horizontalWristPose(double pose){
        horizontalWristLeft.setPosition(pose);
        horizontalWristRight.setPosition(1-pose);
    }
}
