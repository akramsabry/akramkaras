# -*- coding: utf-8 -*-
"""
Created on Mon Mar 23 21:38:15 2020

@author: Options
"""
from tkinter import * 
turn=1
flag=1

def check():
    global flag
    flag = flag +1
    if (btn1["text"]==btn2["text"] and btn2["text"]==btn3["text"]and btn3["text"]=="x"):
            
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn1["text"]==btn2["text"] and btn2["text"]==btn3["text"]and  btn3["text"]=="o"):    
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
             
    if (btn4["text"]==btn5["text"] and btn5["text"]==btn6["text"]and btn5["text"]=="x"):
        
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn4["text"]==btn5["text"] and btn5["text"]==btn6["text"]and btn5["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
             
    if (btn7["text"]==btn8["text"] and btn8["text"]==btn9["text"]and btn9["text"]=="x"):
    
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn7["text"]==btn8["text"] and btn8["text"]==btn9["text"]and btn9["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if (btn1["text"]==btn4["text"] and btn4["text"]==btn7["text"]and btn7["text"]=="x"):

            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn1["text"]==btn4["text"] and btn4["text"]==btn7["text"]and btn7["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if (btn2["text"]==btn5["text"] and btn5["text"]==btn8["text"]and btn8["text"]=="x"):
    
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn2["text"]==btn5["text"] and btn5["text"]==btn8["text"]and btn8["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if (btn3["text"]==btn6["text"] and btn6["text"]==btn9["text"]and btn9["text"]=="x"):
  
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn3["text"]==btn6["text"] and btn6["text"]==btn9["text"]and btn9["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if (btn1["text"]==btn5["text"] and btn5["text"]==btn9["text"]and btn9["text"]=="x"):
   
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn1["text"]==btn5["text"] and btn5["text"]==btn9["text"]and btn9["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if (btn3["text"]==btn5["text"] and btn5["text"]==btn7["text"]and btn7["text"]=="x"):
            messagebox.showinfo("congratulation","player1 :x is win ")
            reset()
    if (btn3["text"]==btn5["text"] and btn5["text"]==btn7["text"]and btn7["text"]=="o"):
             messagebox.showinfo("congratulation","player2 :o is win ")
             reset()
    if flag == 10:
        messagebox.showinfo("Sorry","Game Over")
        reset()
def reset():
    global flag 
    global turn 
    flag =1
    turn =1
    btn1["text"]=" "
    btn2["text"]=" "
    btn3["text"]=" "
    btn4["text"]=" "
    btn5["text"]=" "
    btn6["text"]=" "
    btn7["text"]=" "
    btn8["text"]=" "
    btn9["text"]=" "
    
def clicked(arg):
    global turn
    if arg==1:
        if btn1["text"] == " ":
            if turn ==1:
                turn=2
                btn1["text"]="x"
                check()
            else:
                turn=1
                btn1["text"]="o"
                check()
    if arg==2:
        if btn2["text"] == " ":
            if turn ==1:
                turn=2
                btn2["text"]="x"
                check()
            else:
                turn=1
                btn2["text"]="o"
                check()
    if arg==3:
        if btn3["text"] == " ":
            if turn ==1:
                turn=2
                btn3["text"]="x"
                check()
            else:
                turn=1
                btn3["text"]="o"
                check()
    if arg==4:
        if btn4["text"] == " ":
            if turn ==1:
                turn=2
                btn4["text"]="x"
                check()
            else:
                turn=1
                btn4["text"]="o"
                check()
    if arg==5:
        if btn5["text"] == " ":
            if turn ==1:
                turn=2
                btn5["text"]="x"
                check()
            else:
                turn=1
                btn5["text"]="o"
                check()
    if arg==6:
        if btn6["text"] == " ":
            if turn ==1:
                turn=2
                btn6["text"]="x"
                check()
            else:
                turn=1
                btn6["text"]="o"
                check()
    if arg==7:
        if btn7["text"] == " ":
            if turn ==1:
                turn=2
                btn7["text"]="x"
                check()
            else:
                turn=1
                btn7["text"]="o"
                check()
    if arg==8:
        if btn8["text"] == " ":
            if turn ==1:
                turn=2
                btn8["text"]="x"
                check()
            else:
                turn=1
                btn8["text"]="o"
                check()
             
    if arg==9:
        if btn9["text"] == " ":
            if turn ==1:
                turn=2
                btn9["text"]="x"
                check()
            else:
                turn=1
                btn9["text"]="o"
                check()
wind = Tk()
wind.title("tik tak")
wind.geometry("300x200")
lb1= Label(wind,text="player1:x  ",font=('Helvat','15'))
lb2= Label(wind,text="player2:o  ",font=('Helvat','15'))
btn1= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(1))
btn2= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(2))
btn3= Button(wind,text=" ",bg="black",fg="red",width=3,height=1, font=('Helvat','15'),command= lambda:clicked(3))
btn4= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(4))
btn5= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(5))
btn6= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(6))
btn7= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(7))
btn8= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(8))
btn9= Button(wind,text=" ",bg="black",fg="red",width=3,height=1,font=('Helvat','15'), command= lambda:clicked(9))
lb1.grid(row=0,column=0)
lb2.grid(row=1,column=0)
btn1.grid(row=0,column=1)
btn2.grid(row=0,column=2)
btn3.grid(row=0,column=3)
btn4.grid(row=1,column=1)
btn5.grid(row=1,column=2)
btn6.grid(row=1,column=3)
btn7.grid(row=2,column=1)
btn8.grid(row=2,column=2)
btn9.grid(row=2,column=3)
wind.mainloop()