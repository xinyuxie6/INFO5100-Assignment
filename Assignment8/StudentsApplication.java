
package assignment8;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentsApplication {

    public static void main(String[] args){
        
    	JFrame f = new JFrame();
        JTable table = new JTable(); 
        
        Object[] columns = {"ID","First Name","Last Name","Gender"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        
        Font font = new Font("TimesRoman", Font.PLAIN, 25);
        table.setFont(font);
        table.setRowHeight(30);
        
        JTextField id = new JTextField();
        JTextField first = new JTextField();
        JTextField last = new JTextField();
        JTextField gender = new JTextField();
        JButton addButton = new JButton("Add"); 
        
        JLabel idLabel = new JLabel("ID: ");
        JLabel firstLabel = new JLabel("First Name: ");
        JLabel lastLabel = new JLabel("Last Name: ");
        JLabel gLabel = new JLabel("Gender: ");
        
        id.setBounds(250, 220, 100, 25);
        first.setBounds(250, 250, 100, 25);
        last.setBounds(250, 280, 100, 25);
        gender.setBounds(250, 310, 100, 25);
        
        idLabel.setBounds(100, 220, 100, 25);
        firstLabel.setBounds(100, 250, 100, 25);
        lastLabel.setBounds(100, 280, 100, 25);
        gLabel.setBounds(100, 310, 100, 25);
        
        addButton.setBounds(450, 220, 100, 25);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(0, 0, 600, 200);
        f.setLayout(null);
        f.add(pane);
        f.add(idLabel);
        f.add(id);
        f.add(firstLabel);
        f.add(first);
        f.add(lastLabel);
        f.add(last);
        f.add(gLabel);
        f.add(gender);
        f.add(addButton);
        
        Object[] row = new Object[4];
        
        addButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
             
                row[0] = id.getText();
                row[1] = first.getText();
                row[2] = last.getText();
                row[3] = gender.getText();
                
                model.addRow(row);
            }
        });
        
        table.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
            int i = table.getSelectedRow();
            
            id.setText(model.getValueAt(i, 0).toString());
            first.setText(model.getValueAt(i, 1).toString());
            last.setText(model.getValueAt(i, 2).toString());
            gender.setText(model.getValueAt(i, 3).toString());
        }
        });
 
        
        f.setSize(600,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
}
