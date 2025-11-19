package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.*;
import frc.robot.subsystems.Intake;

public class TeleopIntake extends Command {
    private final Intake intake;
    private final double speed;

    
    public TeleopIntake (Intake intake, double speed){
        Commands.print("Telopintakeisinit@kjfukyballz");
        this.intake = intake;
        this.speed = speed;
        addRequirements(intake);
        execute(this.speed);
    }
    public void execute(double speed){
        Commands.print("Telopintakeisinit@kjfukyballz");
        intake.set(speed);
    }
    public void end(boolean interrupted){
        intake.stop();
    }
}