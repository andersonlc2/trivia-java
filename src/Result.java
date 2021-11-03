import javax.swing.*;
import java.awt.*;

public class Result extends JFrame{

    JPanel correct;
    JPanel background;
    JLabel resultado;
    JLabel pontos;
    JLabel pontuacao;
    public JButton next;

    public Result(){
        inicialize();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void inicialize(){

        correct = new JPanel();
        background = new JPanel();
        resultado = new JLabel();
        next = new JButton();
        pontuacao = new JLabel();
        pontos = new JLabel();


        next.setFocusable(false);
        next.setBackground(new Color(10,10,10));
        next.setForeground(new Color(188,188,188));


        pontuacao.setForeground(new Color(255, 255, 255));
        pontuacao.setFont(new Font("Cambria", 0, 18));

        pontos.setFont(new Font("Cambria", 0, 14));

        resultado.setFont(new Font("Cambria", 0, 48));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(background, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(background, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
        );

        GroupLayout backlayout = new GroupLayout(background);
        background.setLayout(backlayout);

        backlayout.setHorizontalGroup(
                backlayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(400,400,400)
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(112,112,112)
                                .addComponent(resultado, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE )

                        )
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(300,300,300)
                                .addComponent(next, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(10,10,10)
                                .addComponent(pontos, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE )
                                .addGap(10,10,10)
                                .addComponent(pontuacao, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE )

                        )


        );
        backlayout.setVerticalGroup(
                backlayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(160,160,160)
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(20,20,20)
                                .addComponent(resultado, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE )
                                .addGap(30,30,30)
                                .addComponent(next, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE )

                        )
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(108,108,108)
                                .addComponent(pontos, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE  )

                        )
                        .addGroup(backlayout.createSequentialGroup()
                                .addGap(108,108,108)
                                .addComponent(pontuacao, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE  )

                        )

        );

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        pack();

    }

}
