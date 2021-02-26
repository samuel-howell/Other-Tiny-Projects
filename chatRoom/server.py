import threading  #  python can't do real multithreading, it only simulates it, so not the best language to do this in
import socket

host = '127.0.0.1'  #  local host.
port = 55555      #  dont pick any reserved ports. don't choose anything from 1 - 10,000

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind((host, port))
server.listen()

clients = []        # create clients and nicknames list
nicknames = []

#  broadcast function
def broadcast(message):
    for client in clients:
        client.send(message)

def handle(client):
    while True:
        try:
            message = client.recv(1024)
            broadcast(message)
        except:
            index = clients.index(client)
            clients.remove(client)
            client.close()
            nickname = nicknames[index]
            broadcast(f'{nickname} left the chat!'.encode('ascii') )
            nicknames.remove(nickname)
            break

def receive():
    while True:
        client, address = server.accept()
        print(f'Connected with {str(address)}')

        client.send('NICK'.encode('ascii'))     #  tell the client to submit a nickname
        nickname = client.recv(1024).decode('ascii')  #  recieve the nickname from the client
        nicknames.append(nickname)              #  append nickname to the list
        clients.append(client)                  #  append client to the list

        print(f'Nickname of the client is {nickname}')
        broadcast(f'{nickname} joined the chat'.encode('ascii'))    # send this to all other members in the chat
        client.send('Connected to the server'.encode('ascii'))      #  send this to the user who just entered the chatroom

        thread = threading.Thread(target = handle, args = (client,))
        thread.start()

print('the server is listening...')
receive()  #  calling the recieve in the main method