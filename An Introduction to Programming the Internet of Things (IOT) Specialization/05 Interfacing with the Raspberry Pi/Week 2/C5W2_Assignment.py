import socket
import sys

if __name__ == "__main__":
	my_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	my_ip = ""
	my_port = 2244
	
	try:
		my_socket.bind((my_ip, my_port))
	except socket.error:
		print("Fail to bind socket")
		sys.exit()
	
	my_socket.listen(5)
	
	while True:
		connection, address = my_socket.accept()
		data = connection.recv(1000)
		if data:
			print("Got a request!")
	
	connection.close()
	my_socket.close()
