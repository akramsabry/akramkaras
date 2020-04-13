# -*- coding: utf-8 -*-
"""
Created on Mon Apr 13 20:22:45 2020

@author: Options
"""
from socket import *
import threading
s= socket(AF_INET,SOCK_STREAM)                   
port=7000
host="127.0.0.1"
s.bind((host,port))
s.listen(5)
clients = []
def connectthreaduser(c,ad):
    while True:
        m=c.recv(2048)
        m=ad[0]+':'+m.decode("utf-8")
        sendtoall(m,c)
def sendtoall(message,con):
    for client in clients:
        if client != con:
            client.send(message.encode("utf-8"))
while True:
    c,ad=s.accept()
    clients.append(c)
    clientthred= threading.Thread(target=connectthreaduser,args=(c,ad))
    clientthred.start()
