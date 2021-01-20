/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text_editor;

import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author GOVIND SINGLA
 */
public class Text_Editor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser j=new JFileChooser();
        j.setAcceptAllFileFilterUsed(false);
        j.addChoosableFileFilter(new FileNameExtensionFilter("*.txt", "txt"));
        
        try
        {
            if(j.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
            {
                File f= j.getSelectedFile();
                 jTextArea1.setText("");
                 FileInputStream fis=new FileInputStream(f);
                 int i;
                 while((i = fis.read())!=-1)
                 {
                       jTextArea1.append(String.valueOf((char)i));
                 }
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    new button 
            if(!jTextArea1.getText().equals(""))
        {
            System.out.println(jTextArea1.getText());

            Object[] choices = {"Save", "Don't Save", "Cancel"};
            Object defaultChoice = choices[0];
            int i =  JOptionPane.showOptionDialog(this,
                "Do you want to save the changes to file",
                "Text Editor",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                choices,
                defaultChoice);

                if(i == 0)
                {
                    jTextArea1.setText("");
                }
                else if(i == 1)
                {
                    jTextArea1.setText("");
                }
        }
    
}
