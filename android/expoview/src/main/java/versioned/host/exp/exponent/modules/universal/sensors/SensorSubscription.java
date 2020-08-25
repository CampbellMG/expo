package versioned.host.exp.exponent.modules.universal.sensors;

import host.exp.exponent.kernel.services.sensors.SensorKernelServiceSubscription;

public class SensorSubscription {
  private SensorKernelServiceSubscription mSensorKernelServiceSubscription;

  public SensorSubscription(SensorKernelServiceSubscription subscription) {
    mSensorKernelServiceSubscription = subscription;
  }

  public void start() {
    mSensorKernelServiceSubscription.start();
  }

  public boolean isEnabled() {
    return mSensorKernelServiceSubscription.isEnabled();
  }

  public Long getUpdateInterval() {
    return mSensorKernelServiceSubscription.getUpdateInterval();
  }

  public void setUpdateInterval(long updateInterval) {
    mSensorKernelServiceSubscription.setUpdateInterval(updateInterval);
  }

  public void stop() {
    mSensorKernelServiceSubscription.stop();
  }

  public void release() {
    mSensorKernelServiceSubscription.release();
  }
}
