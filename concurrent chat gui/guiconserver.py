# -*- coding: utf-8 -*-
"""
Created on Fri Mar 20 14:28:06 2020

@author: Options
"""


from tkinter import *
from socket import *
import threading


  
def client_thread(c):
       while True :
          x=c.recv(2048)
          print(x.decode("utf-8"))
          text.insert(INSERT,x.decode("utf-8")+"\n")
          

     
def btn_send():
     x="server: "
     x+=E1.get()
     text.insert(INSERT,x+"\n")
     c.send(x.encode("utf-8"))  
     E1.delete(0 ,END)
def socket_thread():
   while True : 
             global c
             c,add=s.accept()
             print("connection from ",add[0])
             clientthred= threading.Thread(target=client_thread,args=(c,))
             clientthred.start()
            

s= socket(AF_INET,SOCK_STREAM)                   
port=7000
host="127.0.1.2"
s.bind((host,port))
s.listen(5)
top = Tk()
top.title("server")
top.geometry("200x310")
text = Text(top,height=15,width=14)
text.grid(row=1,column=1)
E1 = Entry(top, bd = 5)
E1.grid(row=2,column=1)
B = Button(top, text = "send",command=btn_send)
B.grid(row=3,column=1)

sockth=threading.Thread(target=socket_thread)
sockth.start()
top.mainloop()
