package _05_Pixel_Art;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;

public class PixelArtMaker implements MouseListener, ActionListener{
    private JFrame window;
    private GridInputPanel gip;
    private GridPanel gp;
    ColorSelectionPanel csp;

    public void start() {
        gip = new GridInputPanel(this);	
        window = new JFrame("Pixel Art");
        window.setLayout(new FlowLayout());
        window.setResizable(false);
        if(!datExist()) {
        window.add(gip);
        }else {
        	submitGridData(0,0,0,0);
        }
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void submitGridData(int w, int h, int r, int c) {
    	if(datExist()) {
        	try(FileInputStream fis = new FileInputStream(new File ("src/_05_Pixel_Art/saved.dat"));ObjectInputStream ois = new ObjectInputStream(fis)){
        		gp =(GridPanel) ois.readObject();
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
        }else {
    	gp = new GridPanel(w, h, r, c);
        }
        csp = new ColorSelectionPanel(this);
        window.remove(gip);
        window.add(gp);
        window.add(csp);
        gp.repaint();
        gp.addMouseListener(this);
        window.pack();
    }

    public static void main(String[] args) {
        new PixelArtMaker().start();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        gp.setColor(csp.getSelectedColor());
        System.out.println(csp.getSelectedColor());
        gp.clickPixel(e.getX(), e.getY());
        gp.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 final String DATA_FILE = "src/_05_Pixel_Art/saved.dat";
		
			try(ObjectOutputStream oOS = new ObjectOutputStream(new FileOutputStream(new File(DATA_FILE)))){
				oOS.writeObject(gp);
			}catch(IOException d) {
				
			}
	}
    private boolean datExist() {
    	try(FileInputStream fis = new FileInputStream(new File ("src/_05_Pixel_Art/saved.dat"));ObjectInputStream ois = new ObjectInputStream(fis)) {
    		gp = (GridPanel) ois.readObject();
    		return true;
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return false;
    }
}
