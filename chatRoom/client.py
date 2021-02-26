import socket
import threading

nickname = input("Choose a nickname")  #  get a nickname from the user

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client.connect(('127.0.0.1', 55555))  #  connect to the server that you created in the server.py

#  method to receive data from the server all the time
def receive():
    while True:
        try:
            message = client.recv(1024).decode('ascii')
            if message == 'NICK':       #  if the message is the nickname, send it to the server to be stored, print everything else
                client.send(nickname.encode('ascii'))
            else:
                print(message)
        except:
            print('An error occurred')
            client.close()
            break

def write():
    while True:
        message = f'{nickname}: {input("")}'
        client.send(message.encode('ascii'))

receive_thread = threading.Thread(target = receive)
receive_thread.start()

write_thread = threading.Thread(target = write)
write_thread.start()