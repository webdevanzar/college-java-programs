import javax.swing.*;
import java.awt.*;

public class Books extends JFrame{
    DefaultListModel model = new DefaultListModel();
    JList list = new JList(model);

    public Books(){
        model.addElement("android programming");
        model.addElement("php ");

        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        //add
        addBtn.addActionListener(e-> {
            String name = JOptionPane.showInputDialog("Enter book name");
            if(name != null && !name.isEmpty()){
                model.addElement(name);
            }
        });

        //remove
        removeBtn.addActionListener(e-> {
            int index =  list.getSelectedIndex();
            if(index != -1){
                model.remove(index);
            }
        });


        setLayout(new FlowLayout());
        add(new JScrollPane(list));
        add(addBtn);
        add(removeBtn);

        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Books();
    }
}