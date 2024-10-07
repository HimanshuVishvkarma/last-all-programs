import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SnakeGame extends JPanel implements KeyListener, ActionListener {
   private final int WIDTH = 400;
   private final int HEIGHT = 400;
   private final int UNIT_SIZE = 20;
   private final int DELAY = 300;
   private ArrayList<Point> snake;
   private Point food;
   private char direction;
   private boolean running;
   private Timer timer;
   private int score;

   public SnakeGame() {
      this.setPreferredSize(new Dimension(400, 400));
      this.setBackground(Color.black);
      this.setFocusable(true);
      this.addKeyListener(this);
      this.initGame();
   }

   private void initGame() {
      this.snake = new ArrayList();
      this.snake.add(new Point(200, 200));
      this.generateFood();
      this.direction = 'R';
      this.running = true;
      this.score = 0;
      this.timer = new Timer(300, this);
      this.timer.start();
   }

   private void generateFood() {
      Random var1 = new Random();
      int var2 = var1.nextInt(20) * 20;
      int var3 = var1.nextInt(20) * 20;
      this.food = new Point(var2, var3);
   }

   private void move() {
      Point var1 = (Point)this.snake.get(0);
      Point var2 = new Point(var1);
      switch (this.direction) {
         case 'D':
            var2.y += 20;
            break;
         case 'L':
            var2.x -= 20;
            break;
         case 'R':
            var2.x += 20;
            break;
         case 'U':
            var2.y -= 20;
      }

      this.snake.add(0, var2);
      if (!var2.equals(this.food)) {
         this.snake.remove(this.snake.size() - 1);
      } else {
         this.generateFood();
         this.score += 10;
      }

   }

   private void checkCollision() {
      Point var1 = (Point)this.snake.get(0);
      if (var1.x >= 0 && var1.x < 400 && var1.y >= 0 && var1.y < 400) {
         for(int var2 = 1; var2 < this.snake.size(); ++var2) {
            if (var1.equals(this.snake.get(var2))) {
               this.running = false;
               return;
            }
         }

      } else {
         this.running = false;
      }
   }

   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      this.draw(var1);
   }

   private void draw(Graphics var1) {
      if (this.running) {
         var1.setColor(Color.green);
         var1.fillRect(this.food.x, this.food.y, 20, 20);
         Iterator var2 = this.snake.iterator();

         while(var2.hasNext()) {
            Point var3 = (Point)var2.next();
            var1.setColor(Color.white);
            var1.fillRect(var3.x, var3.y, 20, 20);
         }

         var1.setColor(Color.white);
         var1.drawString("Score: " + this.score, 10, 20);
      } else {
         this.gameOver(var1);
      }

   }

   private void gameOver(Graphics var1) {
      var1.setColor(Color.red);
      var1.setFont(new Font("Arial", 1, 40));
      var1.drawString("Game Over", 90, 200);
      var1.drawString("Score: " + this.score, 130, 250);
   }

   public void actionPerformed(ActionEvent var1) {
      if (this.running) {
         this.move();
         this.checkCollision();
         this.repaint();
      }

   }

   public void keyPressed(KeyEvent var1) {
      switch (var1.getKeyCode()) {
         case 37:
            if (this.direction != 'R') {
               this.direction = 'L';
            }
            break;
         case 38:
            if (this.direction != 'D') {
               this.direction = 'U';
            }
            break;
         case 39:
            if (this.direction != 'L') {
               this.direction = 'R';
            }
            break;
         case 40:
            if (this.direction != 'U') {
               this.direction = 'D';
            }
      }

   }

   public void keyReleased(KeyEvent var1) {
   }

   public void keyTyped(KeyEvent var1) {
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame("Snake Game");
      SnakeGame var2 = new SnakeGame();
      var1.add(var2);
      var1.pack();
      var1.setDefaultCloseOperation(3);
      var1.setLocationRelativeTo((Component)null);
      var1.setVisible(true);
   }
}