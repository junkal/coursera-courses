import RPi.GPIO as GPIO
import time

if __name__ == "__main__":
	led_pin = 12
	pwm = None

	GPIO.setwarnings(False)
	GPIO.setmode(GPIO.BOARD)
	GPIO.setup(led_pin, GPIO.OUT)
	pwm = GPIO.PWM(led_pin, 100)
	pwm.start(0)

	while True:
		try:
			print("Increasing Duty Cycle")
			for i in range(0, 100, 1):
				pwm.ChangeDutyCycle(i)
				time.sleep(0.1)

			print("Decreasing Duty Cycle")
			for i in range(100, 0, -1):
				pwm.ChangeDutyCycle(i)
				time.sleep(0.1)
		except KeyboardInterrupt:
			print("Stopping the LED")
			pwm.stop()
			GPIO.cleanup()
			print("Exiting")
			exit()
