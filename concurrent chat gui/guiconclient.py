# -*- coding: utf-8 -*-
"""
Created on Sun Mar 22 14:18:27 2020

@author: Options
"""


from tkinter import *
from socket import *
import threading

def recieve_thread(s):
    while True:
        x=s.recv(2048)
        print(x.decode("utf-8"))
        text.insert(INSERT,x.decode("utf-8")+"\n")
        
def btn_send():
      x="client: "
      x+=E1.get()
      text.insert(INSERT,x+"\n")
      s.send(x.encode("utf-8")) 
      E1.delete(0 ,END)


    

s= socket(AF_INET,SOCK_STREAM)
port=7000
host="127.0.1.2"
s.connect((host,port))
top = Tk()
top.title("client")
top.geometry("200x310")
text = Text(top,height=15,width=14)
text.grid(row=1,column=1)
E1 = Entry(top, bd = 5)
E1.grid(row=2,column=1)
B = Button(top, text = "send",command=btn_send)
B.grid(row=3,column=1)

receive= threading.Thread(target=recieve_thread,args=(s,))
receive.start()
top.mainloop()