// the setup function runs once when you press reset or power the board
void setup() {
  // initialize digital pin LED_BUILTIN as an output.
  pinMode(LED_BUILTIN, OUTPUT);
}

// the loop function runs over and over again forever
void loop() {
  for (int i = 0; i < 5; i++){
    digitalWrite(LED_BUILTIN, HIGH);
    delay(500);                     
    digitalWrite(LED_BUILTIN, LOW); 
    delay(500);                     
  }

  for (int j = 0; j < 5; j++){
    digitalWrite(LED_BUILTIN, HIGH);  
    delay(2000);                      
    digitalWrite(LED_BUILTIN, LOW);   
    delay(2000);                      
  }
}
