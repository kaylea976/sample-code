#kaylea stewart
#w0541976
import socket
import time
host = '127.0.0.1'
port = 8008

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((host,port))
s.listen(1)
c, addr = s.accept()
def Main():
    print("Server Listening")
    while True:
            data = c.recv(1024).decode('utf-8')
            if not data:
                    break
            if data =='HELO':
                    Hello(data)
            elif data == 'REQTIME':
                    REQTIME(data)
            elif data == 'REQDATE':
                    REQDATE(data)
            elif data == 'REQIP':
                    IP(data)
            elif data =='BYE':
                    BYE()
            elif data[:4] == 'ECHO': 
                    ECHO(data)
            else:
                    message = ("Invalid command")
                    c.send(message.encode('utf-8'))

def Hello(data):
    if data !='HELO':
            message = ("Server: 510 Sorry i can not service your request at this time. \n Connection Closed")
            c.send(message.encode('utf-8'))
            c.close()

    message = ("Server: 210 Hello " + host + " pleased to meet you.")
    c.send(message.encode('utf-8'))
    Main()

def REQTIME(data):
    if data !='REQTIME':
            message = ("Server: 520 Sorry, time is not available right now")
            c.send(message.encode('utf-8'))

    message = ("Server: 220 " + (time.strftime('%H:%M:%S')))
    c.send(message.encode('utf-8'))
    Main()

def REQDATE(data):
    if data !='REQDATE':
            message =("Server: 530 Sorry, date is not available right now")
            c.send(message.encode('utf-8'))

    message = ("Server: 230 " +  (time.strftime("%Y/%m/%d")))
    c.send(message.encode('utf-8'))
    Main()

def ECHO(data):
    if data[:4] !='ECHO':
            message =("Server: 5350 Cant seem to echo")
            c.send(message.encode('utf-8'))

    text = ("Server: 240 " )
    message = text + data[4:]
    c.send(message.encode('utf-8'))
    Main()

def IP(data):
    if data !='REQIP':
            message = ("Server: 550 Sorry i can not get your IP Address.")

    message =("Server: 250 " + host)
    c.send(message.encode('utf-8'))
    Main()


def BYE():           
    message =("Server: 600 See Ya Later!")
    c.send(message.encode('utf-8'))

if __name__ == '__main__':
    Main()

