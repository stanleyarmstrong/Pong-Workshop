from tkinter import *
import time
import random

root = Tk()
root.title("Pong")
root.wm_attributes("-topmost", 1)

class Game(object):
    def __init__(self):
        self.width = 400
        self.height = 800
        self.canvas = Canvas(root, width=self.width, height=self.height, highlightthickness=0)
    
    def draw(self):
        return

game = Game()
while 1:
    root.update()
    root.update_idletasks()
    time.sleep(0.01)
