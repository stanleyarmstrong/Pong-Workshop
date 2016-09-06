2# Imports
from tkinter import *
import time
import random

# Root definition
root = Tk()
root.title("Pong")
root.wm_attributes("-topmost", 1)

# Class definitions

class Game(object):
    def __init__(self):
        self.width = 400
        self.height = 800
        self.canvas = Canvas(root, width=self.width, height=self.height, highlightthickness=0)

    def draw(self):
        return

class Paddle(object):
    def __init__(self, game, color):
        self.game = game
        self.width = 20
        self.height = 20
        self.posX = game.width / 2 - self.width / 2
        self.posY = game.height / 2 - self.height / 2
        self.id = game.canvas.create_oval(self.posX, self.posY, self.posX + self.width, self.posY + self.height, fill=color)

    def draw(self):
        return

game = Game()
while 1:
    root.update()
    root.update_idletasks()
    time.sleep(0.01)
