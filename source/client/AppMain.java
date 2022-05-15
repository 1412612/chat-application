import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMain extends JFrame{
    private JPanel contentPane;
    private JLabel headerText;
    private JButton loginButton;
    private JButton signupButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain frame = new AppMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public AppMain(){
        setTitle("CHAT APPLICATION");

       // setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        //contentPane.setBackground(new Color(230, 240, 247));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        headerText = new JLabel("WellCome to Chat Application!");
        headerText.setBounds(70,50, 300, 70);
        headerText.setFont(new Font("Tahoma", Font.PLAIN, 20));
        contentPane.add(headerText);
        //headerText.setBounds();
        loginButton = new JButton("Login");
        loginButton.setBounds(100,170, 100, 50);
        signupButton = new JButton("Signup");
        signupButton.setBounds(250,170, 100, 50);
        contentPane.add(loginButton);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
                dispose();

            }
        });
        contentPane.add(signupButton);
        signupButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SignupFrame signupFrame = new SignupFrame();
                signupFrame.setVisible(true);
                dispose();

            }
        });
    }
}


