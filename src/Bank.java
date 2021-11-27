public class Bank {

    public static String [] arr = new String[50];
    public static int contagem = 0;
    public static boolean acertou;
    public static int points;

    public static String[][] listaNUm = {
            {"Super-Homem", "Kryptonita é a fraqueza de qual super-herói?", "Super-Homem", "Batman", "Hulk", "Flash"},
            {"Vaticano e Rússia", "Quais o menor e o maior país do mundo?", "Mônaco e Canadá", "Malta e Estados Unidos", "Vaticano e Rússia", "São Marino e Índia"},
            {"Infinitas", "Quantas casas decimais tem o número pi?", "Infinitas", "Centenas", "Milhares", "Duas"},
            {"Lenda", "O que a palavra legend significa em português?", "Lenda", "Legenda", "História", "Conto"},
            {"Bambu", "Qual o alimento preferido dos Pandas?", "Bambu", "Carnes", "Mel", "Aves e ovos"},
            {"Argentina", "Qual a nacionalidade de Che Guevara?", "Boliviana", "Argentina", "Peruana", "Cubana"},
            {"Caipora", "Qual personagem folclórico costuma ser agradado pelos caçadores com a oferta de fumo?", "Saci", "Lobisomem", "Boitatá", "Caipora"},
            {"Elefante africano", "Qual o maior animal terrestre?", "Elefante africano", "Tubarão Branco", "Girafa", "Baleia Azul"},
            {"Neil Armstrong", "Quem foi o primeiro homem a pisar na Lua?", "Yuri Gagarin", "Neil Armstrong", "Charles Conrad", "Buzz Aldrin"},
            {"Canguru", "Qual o animal nacional da Austrália?", "Morcego", "Camelo", "Canguru", "Tatu"},
            {"Newton", "Qual físico produziu três leis que levaram seu nome na sua denominação?", "Einstein", "Karl Marx","Newton","Rosseau"},
            {"Brasil","Qual dos países disputou todas as copas do mundo?", "Brasil", "França", "Alemanha", "Inglaterra"},
            {"Portugal", "O Brasil foi colônia de qual país?","Inglaterra", "Espanha", "Portugal","Itália"},
            {"Herbivoros", "Como são chamados os animais que só comem plantas?", "Oviparos","Herbivoros","Carnivoros","Veganos"},
            {"Tijolos", "Em Os Três Porquinhos, de que é feita a casa mais forte?", "Tijolos","Gravetos","Palha","Bambu"},
            {"Inglaterra", "Por qual país David Beckham jogou?", "Espanha","Inglaterra","Brasil","EUA"},
            {"Pombo", "Qual passáro simbolo da paz ?", "Tordo","Avestruz","Pombo","Tucano"},
            {"Brasil", "Qual é o país que produz mais café no mundo?", "Colômbia","Indonésia","Brasil","Vietnã"},
            {"Ásia","Qual é o continente mais populoso do mundo?", "America","Europa","Ásia","Africa"},
            {"Leonardo da Vinci","Qual o pintor produziu a obra Monalisa?", "Vicent Van Gogh","Leonardo da Vinci","Seven Screw","Cândido do Amaral"},

    };
    public static String[][] listaNDois = {
            {"Bob Esponja", "Que personagem de desenho animado mora num abacaxi no fundo do mar?", "Linguado","Nemo","Rick e Morty","Bob Esponja"},
            {"Bogotá","Qual é a capital da Colômbia?", "Bogotá","Montevidéu","Quito","Buenos Aires"},
            {"Animalia", "O ser humano pertence a qual reino?" , "Monera" , "Fungi", "Animalia", "Plantae"},
            {"Mark Zuckerberg", "Qual o nome do Fundador do Facebook?", "Mark Zuckerberg","Mark Wahlberg","Mark Ruffalo","Mark Harmon"},
            {"Cristo Redentor", "Qual monumento brasileiro é uma das sete maravilhas do mundo moderno?", "Elevador Lacerda","Cristo Redentor","Catedral da Sé","Arcos da Lapa"},
            {"Pele", "A dematologia é uma especialidade que trata qual parte do corpo?", "Pele","Garganta","Ouvido","Ossos"},
            {"Árabe", "O quibe é uma comida de origem:", "Japonesa","Russa","Árabe","Chinesa"},
            {"Elétrico", "Qual modelo de carro é considerado ecologicamente correto?", "Elétrico","A Gás","A Gasolina","A Álcool"},
            {"2ª Guerra Mundial", "O que aconteceu no mundo entre os anos de 1939 e 1945?", "1ª Guerra Mundial","Guerra do Golfo","Guerra Fria","2ª Guerra Mundial"},
            {"Maçã", "A Sidra é uma bebida alcoólica feita com o suco fermentado de qual fruta?", "Uva","Cereja","Maçã","Pera"},
            {"Mercúrio", "Qual é o menor planeta do nosso sistema solar?", "Terra","Vênus","Marte","Mercúrio"},
            {"Alemanha", "Em que país foi construído o Muro de Berlim?", "Estados Unidos", "China", "Coreia do Norte", "Alemanha"},
            {"Dióxido de carbono", "Que substância é absorvida pelas plantas e expirada por todos os seres vivos?", "Nitrogênio", "Nitrato de sódio", "Dióxido de ferro", "Dióxido de carbono"},
            {"Ouro", "Qual o metal cujo símbolo químico é o Au?", "Ouro", "Prata", "Cobre", "Manganês"},
            {"Michelangelo", "Quem pintou o teto da Capela Sistina?", "Leonardo da Vinci", "Michelangelo", "Rafael", "Sandro Botticelli"},
            {"Itália", "Que país tem o formato de uma bota?", "Portugal", "Itália", "México", "Butão"},
            {"Thomas Edison", "Quem inventou a lâmpada?", "Steve Jobs", "Thomas Edison", "Henry Ford", "Santos Dumont"},
            {"Júpiter", "Qual o maior planeta do sistema solar?", "Terra", "Saturno", "Marte", "Júpiter"},
            {"Doenças nariz, ouvido e garganta", "Qual a especialidade do Otorrinolaringologista?", "Doenças bucais", "Doenças da pele", "Doenças dos olhos", "Doenças nariz, ouvido e garganta"},
            {"7", "Qual o número mínimo de jogadores numa partida de futebol?", "5", "9", "7", "10"},

    };
    public static String[][] listaNTres = {
            {"Ilha de Vera Cruz", "Qual o primeiro nome do Brasil dado pelos portugueses?", "Ilha de São Joaquim","Terra do Brasil","Ilha de Portugal","Ilha de Vera Cruz"},
            {"Big Ben", "Qual é o apelido do sino do relógio do Palácio de Westminster em Londres?", "The Calabash","Big Ben","The Armadillo","The Mummy"},
            {"República Tcheca", "Em que país fica Praga?", "Espanha","República Tcheca","Brasil","Inglaterra"},
            {"Imperador Hirohito", "Quem era o chefe de estado no Japão durante a segunda guerra mundial?", "Imperador Mutsuhito","Imperador Hirohito","Imperador Akihito","Imperador Yoshihito"},
            {"Tecidos", "Uma indústria textil produz o que?", "Tecidos","Textos","livros","Lápis"},
            {"Cavalo", "Quais destes animais relincha?", "bode","macaco","galinha","Cavalo"},
            {"Pluviômetro", "Qual aparelho mede a quantidade de chuva que cai em uma região?", "Pluviômetro","Anenômetro","Voltímetro","Manômetro"},
            {"Urtiga", "Qual dessas plantas pode causar ardência e coceira na pele?", "Espada-de-São-Jorge","Urtiga","Cacto","Boldo"},
            {"21", "Qual o resultado da soma de todos os lados de um Dado?", "17","24","21","19"},
            {"Y", "Quais são os cromossomos que determinam o sexo masculino?", "V", "X", "Y", "Z"},
            {"Artérias", "Como se chamam os vasos que transportam sangue do coração para a periferia do corpo?", "Veias", "Átrios", "Artérias", "Aurículos"},
            {"Descartes", "De quem é a famosa frase “Penso, logo existo”?", "Platão", "Galileu Galilei", "Sócrates", "Descartes"},
            {"118", "Atualmente, quantos elementos químicos a tabela periódica possui?", "113", "109", "118", "92"},
            {"8 minutos", "Quanto tempo a luz do Sol demora para chegar à Terra?", "8 minutos", "1 dia", "12 horas", "16 segundos"},
            {"3,05 m", "Qual é a altura da cesta de basquete oficial da NBA?", "1,88 m", "3,80 m", "2,77 m", "3,05 m"},
            {"Paleolítico", "Em que período da pré-história o fogo foi descoberto?", "Neolítico", "Paleolítico", "Idade dos Metais", "Idade Média"},
            {"Pico da Neblina", "Qual a montanha mais alta do Brasil?", "Pico da Bandeira", "Pico Paraná", "Monte Roraima", "Pico da Neblina"},
            {"299 792 458 (m/s)", "Qual a velocidade da luz?", "150 000 000 (m/s)", "30 000 000 (m/s)", "299 792 458 (m/s)", "199 792 458 (m/s)"},
            {"Grécia", "Em que país foram realizados os primeiros Jogos Olímpicos?", "Itália", "Japão", "Grécia", "França"},
            {"Terremotos", "Qual desastre natural é medido com uma escala Richter?", "Tornados", "Terremotos", "Dilúvios", "Furacões"},

    };
}
