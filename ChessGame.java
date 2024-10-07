import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class ChessGame extends JFrame {
    private static final int SIZE = 8; // Chess board size
    private final JPanel boardPanel = new JPanel(new GridLayout(SIZE, SIZE));
    private JLabel[][] chessBoardSquares = new JLabel[SIZE][SIZE];
    private Point startDrag, endDrag;

    public ChessGame() {
        initializeGui();
        setTitle("Simple Chess Game");
        setSize(800, 800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeGui() {
        boardPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(boardPanel);
        Insets buttonMargin = new Insets(0, 0, 0, 0);

        for (int i = 0; i < chessBoardSquares.length; i++) {
            for (int j = 0; j < chessBoardSquares[i].length; j++) {
                JLabel square = new JLabel();
                square.setOpaque(true);
                square.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                square.setBackground((i + j) % 2 == 0 ? Color.WHITE : Color.GRAY);
                square.setHorizontalAlignment(SwingConstants.CENTER);
                chessBoardSquares[j][i] = square;
                boardPanel.add(square);
            }
        }
        // Set initial positions for pieces using Unicode chess characters
        setupInitialBoard();
    }

    private void setupInitialBoard() {
        try {
            for (int i = 0; i < SIZE; i++) {
                chessBoardSquares[i][1].setIcon(new ImageIcon(getPieceImage("wp")));
                chessBoardSquares[i][6].setIcon(new ImageIcon(getPieceImage("bp")));
            }
            String[] pieces = {"wr", "wn", "wb", "wq", "wk", "wb", "wn", "wr"};
            for (int i = 0; i < SIZE; i++) {
                chessBoardSquares[i][0].setIcon(new ImageIcon(getPieceImage(pieces[i])));
                chessBoardSquares[i][7].setIcon(new ImageIcon(getPieceImage("b" + pieces[i].charAt(1))));
            }

            // Add mouse listeners to enable dragging pieces
            boardPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    startDrag = e.getPoint();
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    endDrag = e.getPoint();
                    handleDrag();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleDrag() {
        int startX = startDrag.x / 100;
        int startY = startDrag.y / 100;
        int endX = endDrag.x / 100;
        int endY = endDrag.y / 100;
        if (startX == endX && startY == endY) return; // No movement
        Icon mover = chessBoardSquares[startX][startY].getIcon();
        chessBoardSquares[endX][endY].setIcon(mover);
        chessBoardSquares[startX][startY].setIcon(null);
    }

    private BufferedImage getPieceImage(String piece) throws IOException {
        String path = "/images/" + piece + ".png";
        URL url = getClass().getResource(path);
        return ImageIO.read(url);
    }

    public static void main(String[] args) {
        new ChessGame();
    }
}
