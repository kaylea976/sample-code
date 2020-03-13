#kaylea stewart
import socket
def Main():
    host = '127.0.0.1'
    port = 8008
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((host, port))
    message = input("->")
    myint = 0
    while message != 'EXIT':
            s.send(message.encode('utf-8'))
            data = s.recv(1024).decode('utf-8')
            print(data)
            if (message == 'BYE'):
                    break
            message = input("->")
    s.close()


if __name__ == '__main__':
    Main()
