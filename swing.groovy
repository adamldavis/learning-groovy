import javax.swing.*
import java.awt.*

def w= new JFrame()
w.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
w.size = new Dimension(500,500)
w.setLocation 100,100
w.contentPane.layout = new FlowLayout()
w.contentPane.add(tp = new JTextPane())
tp.styledDocument.insertString(0, 'Test', null)
w.show()
