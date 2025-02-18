package frc.hardwareWrappers.MotorCtrl;

public abstract class AbstractSimmableMotorController {


    
    public abstract void setInverted(boolean invert);

    //Velocity Closed-loop gains need to be in units of Volts, rad/sec of error, and seconds (for integration/div)
    public abstract void setClosedLoopGains(double p, double i, double d);
    public abstract void setClosedLoopCmd(double velocityCmd_radpersec, double arbFF_V);
    public abstract void setVoltageCmd(double cmd_v);
    public abstract void resetDistance();
    public abstract double getCurrent_A();
    public abstract void setSoftLimits(float fwd, float rev, boolean e);
    public abstract void setCurrent_A(int a);
    public abstract double getVelocity_radpersec();
    public abstract double getPosition_rad();
    public abstract double getAppliedVoltage_V();
    public abstract void follow(Object leader);

}
