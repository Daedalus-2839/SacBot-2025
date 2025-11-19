package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFXS;
import com.ctre.phoenix6.controls.DutyCycleOut;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final TalonFXS motor = new TalonFXS(18);

    //intake constructor
    public Intake() {
    }
    //this will just start robot motor
    public void set(double speed) {
        motor.setControl(new DutyCycleOut(speed));
    }
    //bruh does what it says
    public void stop() {
        motor.setControl(new DutyCycleOut(0));
    }
}
