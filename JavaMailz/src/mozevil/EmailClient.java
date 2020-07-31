/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EmailClient.java
 *
 * Created on 18.04.2009, 16:21:15
 */

package mozevil;

import java.awt.Cursor;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author MozEvil
 */
public class EmailClient extends javax.swing.JFrame {

    /** Creates new form EmailClient */
    public EmailClient() {        
        initComponents();
        updateButtons();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogConnection = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        serverTypeComboBox = new javax.swing.JComboBox();
        serverTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        smtpServerTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        dialogMessage = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fromTextField = new javax.swing.JTextField();
        toTextField = new javax.swing.JTextField();
        subjectTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        contentTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SettingsButton = new javax.swing.JButton();
        newMessageButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        dialogConnection.setTitle("Connect");
        dialogConnection.setIconImage(null);
        dialogConnection.setMinimumSize(new java.awt.Dimension(410, 260));
        dialogConnection.setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Connection Settings"));

        serverTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "pop3", "imap" }));

        serverTextField.setText("pop.mail.ru");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Login: ");

        loginTextField.setText("mozevil");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password: ");

        jLabel1.setText("SMTP");

        smtpServerTextField.setText("smtp.mail.ru");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(serverTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(serverTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(smtpServerTextField)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordField)
                            .addComponent(loginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smtpServerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(loginTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton3.setText("Connect");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogConnectionLayout = new javax.swing.GroupLayout(dialogConnection.getContentPane());
        dialogConnection.getContentPane().setLayout(dialogConnectionLayout);
        dialogConnectionLayout.setHorizontalGroup(
            dialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogConnectionLayout.createSequentialGroup()
                .addGroup(dialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogConnectionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogConnectionLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogConnectionLayout.setVerticalGroup(
            dialogConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogConnectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dialogMessage.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dialogMessage.setTitle("New Message");
        dialogMessage.setMinimumSize(new java.awt.Dimension(500, 450));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("От кого:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Кому:");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Тема:");

        contentTextArea.setColumns(20);
        contentTextArea.setFont(new java.awt.Font("Arial", 0, 12));
        contentTextArea.setRows(5);
        jScrollPane3.setViewportView(contentTextArea);

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogMessageLayout = new javax.swing.GroupLayout(dialogMessage.getContentPane());
        dialogMessage.getContentPane().setLayout(dialogMessageLayout);
        dialogMessageLayout.setHorizontalGroup(
            dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dialogMessageLayout.createSequentialGroup()
                        .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(fromTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                            .addComponent(subjectTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, dialogMessageLayout.createSequentialGroup()
                        .addComponent(sendButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 364, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        dialogMessageLayout.setVerticalGroup(
            dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogMessageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogMessageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Moz-Mail Client");

        SettingsButton.setText("Connection");
        SettingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsButtonActionPerformed(evt);
            }
        });

        newMessageButton.setText("New Message");
        newMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMessageButtonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mails:"));

        jSplitPane1.setDividerLocation(170);
        jSplitPane1.setDividerSize(7);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        jScrollPane2.setViewportView(messageTextArea);

        jSplitPane1.setRightComponent(jScrollPane2);

        table.setModel(tableModel);
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(table);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                tableSelectionChanged();
            }
        });

        jSplitPane1.setLeftComponent(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );

        deleteButton.setText("Delete Message");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Check Mail");
        jButton1.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SettingsButton)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(newMessageButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SettingsButton)
                    .addComponent(jButton1)
                    .addComponent(newMessageButton)
                    .addComponent(deleteButton))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SettingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsButtonActionPerformed
        // connect settings
        dialogConnection.setVisible(true);       
}//GEN-LAST:event_SettingsButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // connect
        if (serverTextField.getText().trim().length() < 1
        || loginTextField.getText().trim().length() < 1
        || passwordField.getPassword().length < 1
        || smtpServerTextField.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(this,"One or more settings is missing.",
                  "Missing Setting(s)", JOptionPane.ERROR_MESSAGE);
        } else {
            StringBuffer connURL = new StringBuffer();
            // делаем УРЛ = pop3://логин:пароль@сервер/
            connURL.append(serverTypeComboBox.getSelectedItem() + "://"
                    + loginTextField.getText().trim() + ":"
                    + new String(passwordField.getPassword()) + "@"
                    + serverTextField.getText().trim() + "/");

            // создать сеанс Java Mail и подключитса к серверу
            Store store = null;
            try {
                // инициализировать сеанс Java Mail c SMTP сервером
                Properties props = new Properties();
                props.put("mail.smtp.host", smtpServerTextField.getText().trim());
                session = Session.getDefaultInstance(props, null);

                // подключитса к почтовому серверу
                URLName urln = new URLName(connURL.toString());
                store = session.getStore(urln);
                store.connect();

            } catch (Exception e) {
                showError("Unable to connect.", false);
            }

            // загрузить заголовки сообщений
            try {
                // открываем папку "INBOX"
                Folder folder = store.getFolder("INBOX");
                folder.open(Folder.READ_WRITE);

                // получить список сообщений из папки
                Message[] messages = folder.getMessages();

                // получить заголовок каждого сообщения в папке
                FetchProfile profile = new FetchProfile();
                profile.add(FetchProfile.Item.ENVELOPE);
                folder.fetch(messages, profile);

                // поместить сообщение в таблицу
                tableModel.setMessages(messages);

            } catch (Exception e) {
                showError("Unable to download messages.", false);
            } finally {
                dialogConnection.dispose();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMessageButtonActionPerformed
        // new message
        dialogMessage.setVisible(true);
}//GEN-LAST:event_newMessageButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        // send
        if (fromTextField.getText().trim().length() < 1
        || toTextField.getText().trim().length() < 1
        || subjectTextField.getText().trim().length() < 1
        || contentTextArea.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(this,"One or more fields is missing.",
                    "Missing Field(s)", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Message newMessage = new MimeMessage(session);
                newMessage.setFrom(new InternetAddress(fromTextField.getText().trim())); // от кого
                newMessage.setRecipient(Message.RecipientType.TO,
                        new InternetAddress(toTextField.getText().trim()));             // кому
                newMessage.setSubject(subjectTextField.getText().trim());               // тема
                newMessage.setSentDate(new Date());                                     // дата отправки
                newMessage.setText(contentTextArea.getText());                          // текст сообщения

                Transport.send(newMessage);         // отправляем

            } catch (Exception e) {
                showError("Unable to send message.", false);
            }
            dialogMessage.dispose();
        }
    }//GEN-LAST:event_sendButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // delete
        try {
            // удаляем с сервера
            selectedMessage.setFlag(Flags.Flag.DELETED, true);
            Folder folder = selectedMessage.getFolder();
            folder.close(true);
            folder.open(Folder.READ_WRITE);
        } catch (Exception e) {
            showError("Unable to delete message.", false);
        }
        // удалить сообщение из таблицы
        tableModel.deleteMessage(table.getSelectedRow());

        // обновить GUI
        messageTextArea.setText("");
        selectedMessage = null;
        updateButtons();

}//GEN-LAST:event_deleteButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // clear
        fromTextField.setText("");
        toTextField.setText("");
        subjectTextField.setText("");
        contentTextArea.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailClient().setVisible(true);
            }
        });
    }

    // когда выбираем строку в таблице
  private void tableSelectionChanged() {
      selectedMessage = tableModel.getMessage(table.getSelectedRow());
      showSelectedMessage();
      updateButtons();
  }

    // прочитать выбранное сообщение
    private void showSelectedMessage() {
        // показать песочные часики вместо курсора пока загружаетса сообщение
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
          //messageTextArea.setText(selectedMessage.getContent().toString());
          messageTextArea.setText(getMessageContent(selectedMessage));
          messageTextArea.setCaretPosition(0);

        } catch(Exception e) {
            showError("Unabled to load message.", false);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
  }

  // Get a message's content.
  public static String getMessageContent(Message message) throws Exception {
    Object content = message.getContent();
    if (content instanceof Multipart) {
      StringBuffer messageContent = new StringBuffer();
      Multipart multipart = (Multipart) content;
      for (int i = 0; i < multipart.getCount(); i++) {
          Part part = (Part) multipart.getBodyPart(i);
          if (part.isMimeType("text/plain")) {
              messageContent.append(part.getContent().toString());
          }
      }
      return messageContent.toString();
    } else {
        return content.toString();
    }
  }


    // Show error dialog and exit afterwards if necessary.
  private void showError(String message, boolean exit) {
    JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    if (exit)
      System.exit(0);
  }

  private void updateButtons() {
    if (selectedMessage != null) {
        deleteButton.setEnabled(true);
    } else {
        deleteButton.setEnabled(false);
    }
  }




    private Session session; // сессия для Java Mail
    private Message selectedMessage;
    private MessageTableModel tableModel = new MessageTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SettingsButton;
    private javax.swing.JTextArea contentTextArea;
    private javax.swing.JButton deleteButton;
    private javax.swing.JDialog dialogConnection;
    private javax.swing.JDialog dialogMessage;
    private javax.swing.JTextField fromTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField loginTextField;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton newMessageButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton sendButton;
    private javax.swing.JTextField serverTextField;
    private javax.swing.JComboBox serverTypeComboBox;
    private javax.swing.JTextField smtpServerTextField;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTable table;
    private javax.swing.JTextField toTextField;
    // End of variables declaration//GEN-END:variables

}
