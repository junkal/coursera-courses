import RPi.GPIO as GPIO
from time import sleep

GPIO.setwarnings(False)

if __name__ == "__main__":
	led_pin = 13
	button_pin = 15
	sleep_time = 1
	
	print("Initialising pi...")
	GPIO.setmode(GPIO.BOARD)
	GPIO.setup(led_pin, GPIO.OUT, initial=GPIO.LOW) 
	GPIO.setup(button_pin, GPIO.IN, pull_up_down=GPIO.PUD_DOWN) 
	
	print("Running pi now...")
	
	while True:
		if GPIO.input(button_pin) == GPIO.HIGH:
			print("Button is pushed!")
			GPIO.output(led_pin, GPIO.HIGH)
			sleep(sleep_time)
		else:
			print("Button is NOT pushed!")
			GPIO.output(led_pin, GPIO.HIGH)
			sleep(sleep_time)
			GPIO.output(led_pin, GPIO.LOW)
			sleep(sleep_time)

