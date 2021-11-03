import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Question extends JFrame {

    JPanel tela;
    JPanel background;
    JLabel question;
    ButtonGroup answers;
    JRadioButton answerA;
    JRadioButton answerB;
    JRadioButton answerC;
    JRadioButton answerD;
    JButton sendBtn;
    Result result;
    JLabel pontuacao;
    JLabel pontos;

    int num;
    String [][] atualLista = new String[10][];


    public Question() {
        inicialize();
        setVisible(true);
//        setLocationRelativeTo(null);
        setTitle("Trivia");
        setResizable(false);
    }

    public void inicialize() {

        tela = new JPanel();
        background = new JPanel();
        question = new JLabel();
        pontos = new JLabel();
        pontuacao = new JLabel();

        answers = new ButtonGroup();
        answerA = new JRadioButton();
        answerB = new JRadioButton();
        answerC = new JRadioButton();
        answerD = new JRadioButton();
        sendBtn = new JButton();

        result = new Result();


        background.setBackground(new Color(0,0,0));

        // Aqui as perguntas e respostas são sorteadas e impressas na tela.
        if (Bank.contagem < 9) {
            atualLista = Bank.listaNUm;
        } else if (Bank.contagem < 18){
            atualLista = Bank.listaNDois;
        } else {
            atualLista = Bank.listaNTres;
        }


        num = new Random().nextInt(9);

        while (true) {
            int sorteado = 0;
            for (int c = 0; c < Bank.arr.length; c++) {
                if (atualLista[num][0].equals(Bank.arr[c])) {
                    sorteado++;
                    num = new Random().nextInt(9);
                }
            }
            if (sorteado == 0) {
                break;
            }
        }

        Bank.arr[Bank.contagem] = atualLista[num][0];

        answers.add(answerA);
        answers.add(answerB);
        answers.add(answerC);
        answers.add(answerD);

        question.setText("<html>" + atualLista[num][1] + "</html>");
        answerA.setText(atualLista[num][2]);
        answerB.setText(atualLista[num][3]);
        answerC.setText(atualLista[num][4]);
        answerD.setText(atualLista[num][5]);

        answerA.setBackground(new Color(0,0,0));
        answerA.setFocusable(false);
        answerA.setCursor(new Cursor(Cursor.HAND_CURSOR));
        answerA.setFont(new Font("Cambria", 0, 28));

        answerB.setBackground(new Color(0,0,0));
        answerB.setFocusable(false);
        answerB.setCursor(new Cursor(Cursor.HAND_CURSOR));
        answerB.setFont(new Font("Cambria", 0, 28));

        answerC.setBackground(new Color(0,0,0));
        answerC.setFocusable(false);
        answerC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        answerC.setFont(new Font("Cambria", 0, 28));

        answerD.setBackground(new Color(0,0,0));
        answerD.setFocusable(false);
        answerD.setCursor(new Cursor(Cursor.HAND_CURSOR));
        answerD.setFont(new Font("Cambria", 0, 28));

        question.setFont(new Font("Cambria", 0, 42));

        sendBtn.setText("Enviar");
        sendBtn.setFocusable(false);
        sendBtn.setBackground(new Color(10,10,10));
        sendBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        sendBtn.setForeground(new Color(188,188,188));


        pontuacao.setForeground(new Color(255, 255, 255));
        pontuacao.setFont(new Font("Cambria", 0, 18));
        pontuacao.setText(Integer.toString(Bank.points));

        pontos.setFont(new Font("Cambria", 0, 14));
        pontos.setText("Pontos:");


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        GroupLayout backLayout = new GroupLayout(background);
        background.setLayout(backLayout);

        backLayout.setHorizontalGroup(
                backLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(800,800,800)
                        .addGroup(backLayout.createSequentialGroup()
                            .addGap(80,80,80)
                            .addComponent(question, 700,700,700)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(120,120,120)
                                .addComponent(answerA, 320, 320, 320)
                                .addComponent(answerB, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(120,120,120)
                                .addComponent(answerC, 320, 320, 320)
                                .addComponent(answerD, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)

                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(360,360,360)
                                .addComponent(sendBtn, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(10,10,10)
                                .addComponent(pontos, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                                .addGap(10,10,10)
                                .addComponent(pontuacao, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )
        );

        backLayout.setVerticalGroup(
                backLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(600,600,600)
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(80,80,80)
                                .addComponent(question, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(400,400,400)
                                .addComponent(answerA, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20,20,20)
                                .addComponent(answerC, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(400,400,400)
                                .addComponent(answerB, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20,20,20)
                                .addComponent(answerD, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(540,540,540)
                                .addComponent(sendBtn, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(10,10,10)
                                .addComponent(pontos, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )
                        .addGroup(backLayout.createSequentialGroup()
                                .addGap(10,10,10)
                                .addComponent(pontuacao, GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
                        )

        );

        sendBtn.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(MouseEvent event){
                sendBtnClicked(event);
            }
        });

        result.next.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(MouseEvent event){
                nextClickedDois(event);
            }
        });


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public void sendBtnClicked(MouseEvent event) {

        Bank.contagem++;

        String escolha = "";
        String opcao = "";
        if (answerA.isSelected()) {
            escolha = answerA.getText();
            opcao = "a";
        }
        if (answerB.isSelected()) {
            escolha = answerB.getText();
            opcao = "b";
        }
        if (answerC.isSelected()) {
            escolha = answerC.getText();
            opcao = "c";
        }
        if (answerD.isSelected()) {
            escolha = answerD.getText();
            opcao = "d";
        }

        if (escolha.equals(atualLista[num][0])){
            Bank.acertou = true;
        } else {
            Bank.acertou = false;
        }


        if (Bank.acertou) {
            Bank.points+=100;

            if (opcao.equals("a")){
                answerA.setForeground(new Color(22,120,22));
            }
            if (opcao.equals("b")){
                answerB.setForeground(new Color(22,120,22));
            }
            if (opcao.equals("c")){
                answerC.setForeground(new Color(22,120,22));
            }
            if (opcao.equals("d")){
                answerD.setForeground(new Color(22,120,22));

            }
        }

        setEnabled(false);
        setFocusableWindowState(false);

        result.setVisible(true);
        result.setLocationRelativeTo(this);


        if (Bank.acertou) {
            result.resultado.setText("Acertou!");
            result.resultado.setForeground(new Color(80, 150, 80));
            result.background.setBackground(new Color(0,0,0));
            result.next.setText("Próxima");

        } else {
            result.resultado.setText("  Errado!");
            result.resultado.setForeground(new Color(150, 30, 50));
            result.background.setBackground(new Color(0,0,0));
            result.next.setText("Início");

            result.pontos.setText("Pontos:");
            result.pontuacao.setText(Integer.toString(Bank.points));

        }

    }

    public void nextClickedDois(MouseEvent event) {

        if (Bank.acertou) {
            this.dispose();
            new Question().setLocationRelativeTo(result);
            result.dispose();

        } else {
            result.dispose();
            this.dispose();
            new Interface();
            Bank.points = 0;
            Bank.contagem = 0;
        }

    }

}
