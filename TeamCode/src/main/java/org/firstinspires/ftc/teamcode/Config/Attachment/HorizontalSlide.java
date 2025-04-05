package org.firstinspires.ftc.teamcode.Config.Attachment;

import androidx.annotation.NonNull;

import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.acmerobotics.roadrunner.Action;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ServoImplEx;

import org.firstinspires.ftc.teamcode.Config.Port;

public class HorizontalSlide {
    ServoImplEx horizontalSlideLeft, horizontalSlideRight;
    public HorizontalSlide(HardwareMap hardwareMap){
        horizontalSlideLeft = hardwareMap.get(ServoImplEx.class, Port.HORIZONTAL_SLIDE_LEFT);
        horizontalSlideRight = hardwareMap.get(ServoImplEx.class, Port.HORIZONTAL_SLIDE_RIGHT);
//        horizontalSLidePose();
    }
    private class HorizontalSlideAction implements Action{
        double pose;
        public HorizontalSlideAction(double pose){
            this.pose = pose;
        }
        @Override
        public boolean run(@NonNull TelemetryPacket telemetryPacket) {
            return false;
        }
    }
    public Action horizontalSlideAction(double pose){return new HorizontalSlideAction(pose);}
    public void horizontalSLidePose(double pose){
        horizontalSlideLeft.setPosition(pose);
        horizontalSlideRight.setPosition(1-pose);
    }
}
