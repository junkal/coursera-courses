void setup() {
  Serial.begin(9600);
  pinMode(LED_BUILTIN, OUTPUT);
}

void loop() {
  if (Serial.available() > 0) {
    // read the incoming byte:
    char incoming = Serial.read();

    Serial.print("Received a ");
    Serial.print(incoming);

    if (incoming == '1'){
      Serial.println(" : Turning ON LED");
      digitalWrite(LED_BUILTIN, HIGH);
    }
    else if (incoming == '0'){
      Serial.println(" : Turning OFF LED");
      digitalWrite(LED_BUILTIN, LOW);
    }
    else{
      Serial.println(" : Unknown character");
    }
  }
}
