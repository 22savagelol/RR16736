package org.firstinspires.ftc.teamcode.Config.Attachment;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ServoImplEx;

import org.firstinspires.ftc.teamcode.Config.Port;

public class VerticalWrist {
    ServoImplEx verticalWristLeft, verticalWristRight;
    public VerticalWrist(HardwareMap hardwareMap){
        verticalWristLeft = hardwareMap.get(ServoImplEx.class, Port.VERTICAL_WRIST_LEFT);
        verticalWristRight = hardwareMap.get(ServoImplEx.class, Port.VERTICAL_WRIST_RIGHT);
//        verticalWristPose();
    }
    private class VerticalWristAction implements Action{
        double pose;
        public VerticalWristAction(double pose){
            this.pose = pose;
        }
        @Override
        public boolean run(@NonNull TelemetryPacket telemetryPacket) {
            return false;
        }
    }
    public Action verticalWristAction(double pose){return new VerticalWristAction(pose);}
    public void verticalWristPose(double pose){
        verticalWristLeft.setPosition(pose);
        verticalWristRight.setPosition(1-pose);
    }
}
