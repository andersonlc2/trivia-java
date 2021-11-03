import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Objects;


public class Interface extends JFrame {

    JPanel janela;
    JLabel gif;
    JButton iniciarBtn;
    JPanel background;
    Question questao;

    public Interface() {
        inicialize();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Trivia");
        setResizable(false);
    }

    public void inicialize() {
        janela = new JPanel();
        gif = new JLabel();
        iniciarBtn = new JButton();
        background = new JPanel();

        // Personalização
        // Adiciona a GIF de fundo da tela
        gif.setIcon(new ImageIcon(Objects.requireNonNull(getClass().getResource("images/test.gif"))));

        // Backaground
        background.setBackground(new Color(0,0,0));

        // Personaliza o Botão Iniciar
        iniciarBtn.setText("Iniciar");
        iniciarBtn.setFont(new Font("Cambria", 0, 16));
        iniciarBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        iniciarBtn.setFocusable(false);
        iniciarBtn.setBackground(new Color(10,10,10));
        iniciarBtn.setForeground(new Color(188,188,188));


        // Layout
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        // Horizontal
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        );
        // Vertical
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
        );

        GroupLayout backLayout = new GroupLayout(background);
        background.setLayout(backLayout);

        backLayout.setHorizontalGroup(
                backLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                            .addGap(200,200,200)
                            .addComponent(iniciarBtn, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                    )
                    .addComponent(gif, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        backLayout.setVerticalGroup(
                backLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(backLayout.createSequentialGroup()
                            .addGap(180,180,180)
                            .addComponent(iniciarBtn, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                            .addGap(20,20,20)
                    )
                    .addComponent(gif, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
        );

        iniciarBtn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(MouseEvent event) {
                iniciarBtnClick(event);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public void iniciarBtnClick(MouseEvent event) {
        questao = new Question();
        questao.setLocationRelativeTo(this);
        this.dispose();

        Bank.contagem++;
    }

}
