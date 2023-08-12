// C++ code
//
#define LED_PIN    13
#define SENSOR_PIN A0

#define BRIGHTNESS_THRESHOLD 500

void setup() {
  pinMode(LED_PIN, OUTPUT);
  Serial.begin(9600);
  Serial.println("Initialising Serial Printing");
}

void loop() {
  int sensorValue = analogRead(SENSOR_PIN);
  Serial.println(sensorValue);
  int state = 0;
  if (sensorValue <= BRIGHTNESS_THRESHOLD){
    state = HIGH;
  }
  else {
    state = LOW;
  }
  digitalWrite(LED_PIN, state);
}