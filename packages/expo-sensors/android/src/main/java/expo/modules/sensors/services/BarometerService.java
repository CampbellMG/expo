// Copyright 2015-present 650 Industries. All rights reserved.

package expo.modules.sensors.services;

import android.content.Context;
import android.hardware.Sensor;

public class BarometerService extends SubscribableSensorService {
  public BarometerService(Context reactContext) {
    super(reactContext);
  }

  @Override
  int getSensorType() {
    return Sensor.TYPE_PRESSURE;
  }
}
