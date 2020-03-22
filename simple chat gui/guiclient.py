# -*- coding: utf-8 -*-
"""
Created on Fri Mar 13 12:48:25 2020
 i.encode("utf-8")
  i= E1.get()
@author: Options
"""

from tkinter import *
from socket import * 

def task():
    x= s.recv(2048) 
    if not x :
        top.after(15000, task)
        return 
    print("client: ")
    var="server: "+x.decode("utf-8")+"\n"
    text.insert(INSERT,var)
    top.after(15000, task)  # reschedule event in 2 seconds


def btn():
    
    y=E1.get()
    s.send(y.encode("utf-8"))
     
s =socket(AF_INET,SOCK_STREAM)
host = '127.0.0.2'
port =702
s.connect((host,port))

top = Tk()
top.title("client")
top.geometry("300x400")
var = "StringVar()"
text = Text(top)
text.place(x= 0,y=70)
L1 = Label(top, textvariable = var, width=50)


E1 = Entry(top, bd = 5)
E1.pack(side = RIGHT and TOP)
B = Button(top, text = "send",command=btn)
B.pack( side = LEFT and TOP)
E1.pack(side = RIGHT and TOP)
top.after(6000, task)
top.mainloop()
