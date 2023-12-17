import javax.swing.*;
import java.awt.*;

public class Lab5_1 {
    public static void main(String[] args) {

        JFrame jf = new JFrame("Notepad");
        jf.setSize(600, 600);
        jf.setLayout(new BorderLayout()); // Using BorderLayout
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menubar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenu menuEdit = new JMenu("Edit");
        JMenu menuFormat = new JMenu("Format");
        JMenu menuView = new JMenu("View");
        JMenu menuHelp = new JMenu("Help");

        menubar.add(menuFile);
        menubar.add(menuEdit);
        menubar.add(menuFormat);
        menubar.add(menuView);
        menubar.add(menuHelp);

        jf.add(menubar, BorderLayout.NORTH); // Adding menubar to the top (North) of the frame

        JTextArea notearea = new JTextArea();
        JScrollPane notescroll = new JScrollPane(notearea);
        jf.add(notescroll, BorderLayout.CENTER); // Adding scrollable text area to fill the remaining space

        jf.setVisible(true);
    }
}
