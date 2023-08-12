#include <EEPROM.h>

void setup() {

  Serial.begin(9600);

}

void loop()
{
  String buffer = "";
  String command = "";
  int address = 0;
  int value = 0;

  if (Serial.available() > 0) {
    // read the incoming byte:
    buffer =  Serial.readString();
    command = buffer.substring(0, buffer.indexOf(' '));

    if (command == "write"){
      buffer = buffer.substring(buffer.indexOf(' ') + 1);
      address = buffer.substring(0, buffer.indexOf(' ')).toInt();
      value = buffer.substring(buffer.indexOf(' ') + 1).toInt();

      Serial.print("Write ");
      Serial.print(value);
      Serial.print(" to Address #");
      Serial.println(address);
      EEPROM.write(address, value);
    }
    else if (command == "read"){
      Serial.print("Read from Address #");
      address = buffer.substring(buffer.indexOf(' ') + 1).toInt();
      Serial.print(address);
      Serial.print(": ");
      Serial.println(EEPROM.read(address)); 
    }
    else {
      Serial.println("Invalid command");
    }
  }  
}
