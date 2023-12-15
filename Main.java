import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner t = new Scanner(System.in); // t = teclado
    boolean rodando = true;
    // por ana carolina, maria eduarda, rafaela e emilly da 1K
    // arrays
    String[] QuestJOG = new String[]{"O personagem ‘Bowser’ é o antagonista de qual série de jogos?", "Quem é o protagonista de “The Legend of Zelda”?", "Qual o apelido do criador de Minecraft?", "Que distribuidora de jogos é responsável pela série “Call of Duty”?", "Qual desses jogos é um jogo de simulação de vida real?", "Qual foi a inspiração para o design do personagem ‘Pac-Man’?", "O Pikachu é qual tipo de pokémon?", "Qual personagem tem um companheiro chamado “Tails”?", "A maioria dos jogadores de jogos virtuais usam qual plataforma?", "Complete o título do  jogo: “World of…?”", "Que série de jogos frequentemente acompanha o clã Belmont?", "Quando foi lançado o último jogo da série principal de ‘Grand Theft Auto’?", "O personagem Mario se originou em que jogo?", "Qual é o nome do mundo ficcional onde “Super Mario Bros” acontece?", "Qual jogo ganhou “Game of the Year” em 2022?", "Qual foi o jogo mais vendido de todos os tempos?", "Qual é o número dado como nome ao personagem principal de 'Hitman'?", "O primeiro jogo da série de jogos ‘Devil May Cry’ era pra ser o quarto jogo de que série?", "Quantos jogos fazem parte da coleção de jogos apelidada de ‘Soulsborne’ por fãs?", "Qual foi o primeiro jogo a ser jogado no espaço?", "O personagem Solid Snake faz parte de qual série de jogos famosa?", "Qual console foi o melhor vendido de todos os tempos?", "Qual companhia liberou o primeiro jogo de simulador de voo?", "Qual o nome dos irmãos gêmeos de Devil May Cry?"};
    String[] JOGresA = new String[] {"Devil May Cry.", "Ganon.", "Notch.", "EA.", "Dark Souls.", "Bolo.", "Psíquico.", "Kirby.", "Xbox 360.", "Demons.", "Elden Ring.", "2022.", "Kirby.", "Reino de Hyrule.", "A Plague Tale: Requiem.", "Call of Duty: Modern Warfare.", "69.", "Resident Evil.", "5.","Mario.", "Metal Gear.", "Xbox One.", "Microsoft.", "Mario e Luigi."};
    String[] JOGresB = new String[] {"Call of Duty.", "Hyrule.", "Miyazaki.", "Nintendo.", "God of War.", "Doritos.", "Elétrico.", "Link.", "PC.", "Warcraft.", "Final Fantasy.", "2009.","Animal Crossing.", "South Island.", "God of War: Ragnarok.", "Minecraft.", "21.", "Doom.", "6.", "Sonic.", "Call of Duty.", "Playstation 5.", "Google.", "Dante e Vergil."};
    String[] JOGresC = new String[] {"Mario.", "Zelda.", "Hideo.", "Activision", "Stray.", "Torta.", "Terrestre.", "Tom Nook.", "Playstation 5.", "Knights.", "Castlevania.", "2019.", "Donkey Kong.", "Estados Unidos", "Elden Ring.", "Dark Souls 3.", "7.", "Singularity.", "7.", "Tetris.", "Resident Evil.", "Nintendo Switch.", "Apple.", "Malenia e Miquella."};
    String[] JOGresD = new String[] {"Kirby.", "Link.", "Jeb.", "Ubisoft.", "The Sims.", "Pizza.", "Normal.", "Sonic.", "Android.", "Apes.", "Silent Hill.", "2013.", "Sonic the Hedgehog.", "Reino dos Cogumelos.", "Horizon Forbidden West.", "Fortnite.", "47.", "Metal Gear.", "4.", "Roblox.", "DotA.", "Playstation 2.", "Amazon.", "Chris e Claire."};
    char[] JOGresCOR = {'c', 'd', 'a', 'c', 'd', 'd', 'b', 'd', 'b', 'b', 'c', 'd', 'c', 'd', 'c', 'b', 'd', 'a', 'c', 'c', 'a', 'd', 'a', 'b'};
    String[] QuestHIS = new String[] {"Quem foi o primeiro presidente dos estados unidos?","Quem foi o primeiro a pisar na lua?","Qual foi um dos primeiros códigos de leis que sobreviveu?","Qual foi a primeira esposa do rei Henry VII?","O tratado de Versalhes aconteceu após qual guerra?","A doença que destruiu um terço da população no século XIV foi?","Qual estado grego é considerado o berço da democracia?","A guerra fria aconteceu entre quais dos poderes?","O crescimento do fascismo na Europa se deu, majoritariamente, a:","Quantos anos durou a guerra de 100 anos?","Qual foi a última família a reinar na Rússia antes da Revolução de 1917?","Quem construiu o primeiro carro na América?","Qual o nome da primeira civilização humana?","Em que ano a União Soviética se dissolveu?","Os egípcios dependiam de qual evento anual para manterem sua população alimentada?"," A escravidão no Brasil é abolida, oficialmente, por qual lei?","Quantos presidentes dos Estados Unidos foram assassinados?","Quantas vezes a Mona Lisa foi roubada?","Quando aconteceu o Grande incêndio de Londres?","Qual é a ordem cronológica, de primeira à última, do desenvolvimento das seguintes religiões?","Qual dos impérios seguintes não tinham linguagem escrita?","Quantas das Sete Maravilhas do Mundo Antigo ainda existem?","Quando foi concedido o direito de voto às mulheres do Brasil?","Segundo historiadores, qual foi o pior ano para se estar vivo?"};
    String[] HISresA = new String[] {"John F. Kennedy", "Alexey Leonov." , "A pedra de roseta.", "Ana Bolena.", "A guerra do Vietnam." , "Sarampo.", "Esparta.", "Inglaterra e França.", "O discurso de ódio de Hitler.", "92 anos.", "Romanov.", "Henry Ford.", "Egito.", "1973.", "A inundação do rio Nilo.", "Lei dos Sexagenários.", "7.", "2.", "1669.", "Budismo, Cristianismo, Islã.", "Império Asteca.", "3.", "1914.", "1349."};
    String[] HISresB = new String[] {"James Madison.", "Neil Armstrong.", "O torá hebraico.", "Catarina Howard.", "Segunda Guerra Mundial.", "Ebola.", "Lesbos.","EUA e China.", "A derrota da França contra a Prússia.", "116 anos.", "Moscou.", "Elon Musk.", "Pérsia.", "1923.", "O solstício de verão.", "Lei Bill Aberdeen.", "4.", "4.", "1876.", "Cristianismo, Budismo, Islã.", "Império Romano.", "2.", "1932.", "1925."};
    String[] HISresC = new String[] {"Alexander Hamilton.", "Tenzing Norgay.", "O código de Hammurabi.", "Catarina de Aragão.", "Guerra de Independência Argelina.", "Peste Bubônica.", "Tebas.", "União Soviética e EUA.", "O discurso nacionalista durante a primeira Guerra Mundial.", "100 anos.", "Vasilyevich.", "Louis Chevrolet.", "Mesopotâmia.", "1991.", "A época de seca.", "Lei do Ventre Livre.", "1.", "1.", "1532.", "Islã, Budismo, Cristianismo.", "Dinastia Tang.", "1.", "1976.", "536."};
    String[] HISresD = new String[] {"George Washington.", "Genghis Khan.", "A pedra de Xabaca.","Joana Seymour.", "Primeira Guerra Mundial.", "Malária.", "Atenas.", "Espanha e Portugal.", "A separação da África entre as potências europeias. ", "101 anos.", "Ivanovich.", "Henry M. Leland.", "Grécia.", "1922.", "A oferenda aos deuses.", "Lei Áurea.","9.","3.", "1666.", "Cristianismo, Islã, Budismo.", "Império Inca.", "0.", "1898.", "2020."};
    char[] HISresCOR = {'d', 'b', 'c', 'c', 'd', 'c', 'd', 'c', 'c', 'b', 'a', 'a', 'c', 'c', 'a', 'd', 'b', 'c', 'd', 'a', 'd', 'c', 'b', 'c'};
    String[] QuestMUS = new String[] {"Complete a letra da música “As It Was” por Harry Styles: Holdin' me back / _______ holdin' me back", "Complete a letra da música “Esqueça-me se for capaz” de Marília Mendonça e Maiara e Maraísa: Pode namorar e postar para tentar tirar minha paz / Mudar _____, de ______, vai / Mas esqueça-me se for capaz", "Complete a letra da música “Ai preto” de L7NNON: Maciçado, _______, lalá no peito que elas gosta / Sabe que a tropa maceta bem / Os tralha que tá moda (ainda)", "Complete a letra da música “good 4 u” de Olivia Rodrigo: “Maybe I'm too _______ / But your apathy is like a wound in salt", "Complete a letra da música “Peaches” de Justin Bieber: I got my peaches out in Georgia (oh, yeah, shit) / I get my _____ from California (that's that shit)", "Complete a letra da música “Need to know” de Doja Cat: You're exciting, boy, come ____ me / Your eyes told me, girl, come ride me", "Complete a letra da música “Summertime Sadness” de Lana del Rey: Think I'll miss you forever / Like the stars miss the ___ in the morning sky’", "Complete a letra da música “Idiota” de Jão: Eu vou te ______ como um idiota ____ / Vou me preparar pro dia em que você já não me queira", "Complete a letra da música “ACORDA PEDRINHO” de Jovem Dionísio: Acorda, Pedrinho / Que hoje tem _____ / Vem _____ comigo.", "Complete a letra da música “Unholy” de Sam Smith e Kim Petras: Mummy don't know daddy's getting ___ / At the body shop, doin' somethin' unholy", "Complete a letra da música “Eu gosto assim” de Gustavo Mioto e Mari Fernandez: Mas eu gosto assim / ____ não me ama.", "Complete letra da música “Despacito” de Luis Afonso: Despacito / Vamos a hacerlo en una playa en ______ ____.", "Complete a letra da música “Take me to Church” de Hozier: I'll worship like a dog at the shrine of your lies / I'll tell you my ___ so you can sharpen your knife.", "Complete a letra da música “Haja Colírio” de Guilherme e Benuto: Haja Colírio pra esse olho vermelho /____ chorou o __ inteiro.", "Complete a letra da música “Cold Heart” de Elton John e Dua Lipa: Hardened by you / Some things looking better, ____.", "Complete a letra da música “Outra noite que se vai” de Armandinho: Outra _____ que você / passa e finge que nem vê / não esconde teu ____ / quer tentar me enlouquecer?", "Complete a letra da música “Pescador” de Armandinho: Hoje vamos ter / que ver o ___ da beira / tem ___ no mar.", "Complete a letra da música “Luz que me traz paz” de Maneva: Refletiu nos meus ____ / adeus solidão / das histórias que se cruzam sem intenção / combustível pra ____ / minha inspiração.", "Complete a letra da música “Smoke the weed” de Snoop Dogg: Younger ____ young boys and girls.", "Complete a letra da música “There 's nothing holding me back“ de Shawn Mendes: I wanna follow Where she ____ / I think about her and she ____ it.", "Complete a letra da música “Señorita” de Camila Cabello: I love it when you call me ____.", "Complete a letra da música “Dark Horse” de Katy Perry: I knew you ____ you were gonna come to ___.", "Complete a letra da música “Andei só” de Natiruts: Andei só pela ____ / Cantei um ____ pros cachorros da rua.", "Complete a letra da música “Rubi” de Andrade: Seu olho é tão ____ tipo água do ___."};
    String[] MUSresA = new String[] {"The weight's.", "Telefone / cidade.",  "Peitado.", "Emotional.", "Drinks.", "See.", "Moon.", "Amar / ama.", "Churras / comer.", "Hot.", "Ela.", "Copacabana.", "Sins.", "Você/ Mês", "Darling", "Semana / choro.", "Surf / Rede.", "Olhos / Vida.", "Generation.", "Think / now.", "Love.", "Me / Were.", "Madrugada / Samba.", "Lindo / Rio."};
    String[] MUSresB = new String[] {"Gravity.", "Casa / emprego.", "Vestido.", "Needy", "Cigarettes.", "Have.", "Clouds.", "Abraçar / abraça.", "Campeonato / dançar.", "Got.", "Ele.", "Rio.", "Mistakes", "Cê / Ano.", "Baby.", "Noite / Prazer.", "Mar / Rede.", "Feitos / Vida.", "Life.", "Go / Know.", "Señorita.", "Were / You.", "Rua / Reggae.", "Lindo / Mar."};
    String[] MUSresC = new String[] {"You're.", "País / nome", "Bolado.", "Angry.", "Weed.", "Find.", "Rain", "Beijar / beija.", "Festa / dançar.", "Caught.", "Essa.", "Puerto Rico.", "Crimes", "Você / Dia.", "Doll.", "Semana / Rancor.", "Morro / Prancha.", "Olhos / Alma.", "Looking.", "Goes / No.", "Baby.", "Was / me.", "Noite / Reggae.", "Azul / Mar."};
    String[] MUSresD = new String[] {"Sadness.", "Rua / telefone.", "Trajado.", "In love.", "Heroin", "Steal.", "Sun.", "Adorar / adora.", "Jogo / cantar.", "Stopped.", "Você.", "Mar del Prata.", "Misdeeds", "Cê / mês.", "Kitty.", "Noite / rancor.", "Golfinho / rede.", "Seios / alma.", "Being.", "Goes / knows.", "Life", "Were / me", "Noite / samba.", "Cristalino / mar."};
    char[] MUSresCOR = {'b', 'a', 'd', 'a','c', 'c', 'd', 'c', 'b', 'a', 'a', 'c', 'a', 'd', 'b', 'd', 'a', 'c', 'a', 'd', 'b', 'd', 'c','d'};
    
    System.out.println();
    System.out.println("\t. . . . . ╰──╮ Seja bem vindo(a) ao Show Do Milhão!  ╭──╯ . . . . .");
    
    JOGO: 
    while (rodando) {
      int categoria = 0; // 1 = jogos, 2 = história, 3 = letra
      int acertos = 0; 
      int trocar = 0;
      boolean respondendo = true;
      char resposta;
      int questD = 1;
      boolean perdeu = false;
      int questA = 0;

      System.out.println();
      System.out.println("\t## Escolha uma categoria! ##");
      System.out.println("1. Jogos Virtuais.");
      System.out.println("2. História.");
      System.out.println("3. Complete a letra de música.");

      System.out.println("\tDigite o número correspondente com a sua resposta.");

      while (categoria == 0) { // enquanto o usuario não responder uma opção válida ele fica preso aqui
        categoria = t.nextInt();
          if (categoria > 3 || categoria < 1) {
          categoria = 0;
          System.out.println("Por favor digite 1, 2 ou 3 para escolher sua categoria.");
        }
      }
        
        if (categoria == 1) { // ####### JOGOS
          System.out.println();
          System.out.println("\t. . . . . ╰──╮ JOGOS VIRTUAIS  ╭──╯ . . . . .");
        System.out.println("\t## Você escolheu jogos virtuais! Serão 24 questões focadas em jogos. ##");
          System.out.println("\tDigite a letra correspondente com a sua resposta (em minúscula). Caso queira trocar de categoria, a cada oito questões você terá a opção e o jogo vai começar de novo.");

          for (questA = 0; questA <= 23; questA++) { 
            System.out.println();
            System.out.println("\t" + questD + ". " + QuestJOG[questA]); // busca o item na lista de acordo com o número da questao
            System.out.println("\ta. " + JOGresA[questA]);
            System.out.println("\tb. " + JOGresB[questA]);
            System.out.println("\tc. " + JOGresC[questA]);
            System.out.println("\td. " + JOGresD[questA]);

            respondendo = true;
            while (respondendo) {
              resposta = t.next().charAt(0);
              if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
                respondendo = false;
                System.out.println("\tSua resposta está...");
                if (resposta == JOGresCOR[questA]) {
                  System.out.println("\t ## CORRETA! ##");
                  acertos++;
                  questD++;
                } else {
                  System.out.println("\t ## INCORRETA! ##");
                  perdeu = true; 
                }
              } else { 
                System.out.println("## Por favor digite a letra correspondente com a sua resposta, em minúscula ##");
              }
            }
            if (perdeu == true) {
              break;
            }
            
            if (questD == 9 || questD == 17) { // TROCAR
              System.out.println();
              System.out.println("\t# Vamos dificultar um pouquinho agora, quer mudar de categoria? #");
          System.out.println("\t1. Sim.");
          System.out.println("\t2. Não.");
            while (trocar == 0) {
            trocar = t.nextInt();

            if (trocar > 2 || trocar < 1) {
              System.out.println("Por favor digite um número correspondente com a sua resposta.");
              trocar = 0;
            }
          }
          if (trocar == 1) {
            continue JOGO; 
          } else if (trocar == 2) {
            trocar = 0;
          }
          
          }
          }

      } else if (categoria == 2) { // ######## HISTORIA
          System.out.println();
          System.out.println("\t. . . . . ╰──╮ HISTÓRIA  ╭──╯ . . . . .");
        System.out.println("\t## Você escolheu história! Serão 24 questões focadas em história. ##");
        System.out.println("\tDigite a letra correspondente com a sua resposta (em minúscula). Caso queira trocar de categoria, a cada oito questões você terá a opção e o jogo vai começar de novo.");

          for (questA = 0; questA <= 23; questA++) {
            System.out.println();
            System.out.println("\t" + questD + ". " + QuestHIS[questA]);
            System.out.println("\ta. " + HISresA[questA]);
            System.out.println("\tb. " + HISresB[questA]);
            System.out.println("\tc. " + HISresC[questA]);
            System.out.println("\td. " + HISresD[questA]);

            respondendo = true;
            while (respondendo) {
              resposta = t.next().charAt(0);
              if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
                respondendo = false;
                System.out.println("\tSua resposta está...");
                if (resposta == HISresCOR[questA]) {
                  System.out.println("\t ## CORRETA! ##");
                  acertos ++;
                  questD++;
                } else {
                  System.out.println("\t ## INCORRETA! ##");
                  perdeu = true; 
                }
              } else {
                System.out.println("## Por favor digite a letra correspondente com a sua resposta. ##");
              }
            }
            if (perdeu == true) {
              break;
            }
            
            if (questD == 9 || questD == 17) { // TROCAR
              System.out.println();
              System.out.println("\t# Vamos dificultar um pouquinho agora, quer mudar de categoria? #");
          System.out.println("\t1. Sim.");
          System.out.println("\t2. Não.");
          while (trocar == 0) {
            trocar = t.nextInt();

            if (trocar > 2 || trocar < 1) {
              System.out.println("Por favor digite um número correspondente com a sua resposta, em minúscula.");
              trocar = 0;
            }
          }
          if (trocar == 1) {
            continue JOGO; 
          } else if (trocar == 2) {
            trocar = 0;
          }
          }
            
          }
        } else { // ######## MUSICA
          System.out.println();
          System.out.println("\t. . . . . ╰──╮ COMPLETE A LETRA  ╭──╯ . . . . .");
        System.out.println("\t## Você escolheu complete a letra de música! Serão 24 questões focadas em músicas e suas letras. ##");
        System.out.println("\tDigite a letra correspondente com a sua resposta (em minúscula). Caso queira trocar de categoria, a cada oito questões você terá a opção e o jogo vai começar de novo.");
          
          for (questA = 0; questA <= 23; questA++) {
            System.out.println();
            System.out.println("\t" + questD + ". " + QuestMUS[questA]);
            System.out.println("\ta. " + MUSresA[questA]);
            System.out.println("\tb. " + MUSresB[questA]);
            System.out.println("\tc. " + MUSresC[questA]);
            System.out.println("\td. " + MUSresD[questA]);

            respondendo = true;
            while (respondendo) {
              resposta = t.next().charAt(0);
              if (resposta == 'a' || resposta == 'b' || resposta == 'c' || resposta == 'd') {
                respondendo = false;
                System.out.println("\tSua resposta está...");
                if (resposta == MUSresCOR[questA]) {
                  System.out.println("\t ## CORRETA! ##");
                  acertos ++;
                  questD++;
                } else {
                  System.out.println("\t ## INCORRETA! ##");
                  perdeu = true; 
                }
              } else {
                System.out.println("## Por favor digite a letra correspondente com a sua resposta,em minúscula ##");
              }
            }
            if (perdeu == true) {
              break;
            }
            
            if (questD == 9 || questD == 17) { // TROCAR
              System.out.println();
              System.out.println("\t# Vamos dificultar um pouquinho agora, quer mudar de categoria? #");
          System.out.println("\t1. Sim.");
          System.out.println("\t2. Não.");
          while (trocar == 0) {
            trocar = t.nextInt();

            if (trocar > 2 || trocar < 1) {
              System.out.println("Por favor digite um número correspondente com a sua resposta.");
              trocar = 0;
            }
          }
          if (trocar == 1) {
            continue JOGO; 
          } else if (trocar == 2) {
            trocar = 0;
          }
            }
        }
        }
      
      if (perdeu) {
        System.out.println();
        System.out.println("\t. . . . . ╰──╮ GAME OVER!  ╭──╯ . . . . .");
        switch (acertos) {
        case 0:
          System.out.println("Com 0 acertos você ganhou... R$0. Mais sorte na próxima!");
          break;
        case 1:
          System.out.println("Com 1 acerto você ganhou... R$250. Mais sorte na próxima!");
          break;
        case 2:
          System.out.println("Com 2 acertos você ganhou... R$300. Mais sorte na próxima!");
          break;
        case 3:
          System.out.println("Com 3 acertos você ganhou... R$350. Mais sorte na próxima!");
          break;
        case 4:
          System.out.println("Com 4 acertos você ganhou... R$400. Mais sorte na próxima!");
          break;
        case 5:
          System.out.println("Com 5 acertos você ganhou... R$450. Mais sorte na próxima!");
          break;
        case 6:
          System.out.println("Com 6 acertos você ganhou... R$500. Mais sorte na próxima!");
          break;
        case 7:
          System.out.println("Com 7 acertos você ganhou... R$1.000. Mais sorte na próxima!");
          break;
        case 8:
          System.out.println("Com 8 acertos você ganhou... R$1.500. Mais sorte na próxima!");
          break;
        case 9:
          System.out.println("Com 9 acertos você ganhou... R$2.000. Mais sorte na próxima!");
          break;
        case 10:
          System.out.println("Com 10 acertos você ganhou... R$2.500. Mais sorte na próxima!");
          break;
        case 11:
          System.out.println("Com 11 acertos você ganhou... R$3.000. Mais sorte na próxima!");
          break;
        case 12:
          System.out.println("Com 12 acertos você ganhou... R$5.000. Mais sorte na próxima!");
          break;
        case 13:
          System.out.println("Com 13 acertos você ganhou... R$10.000. Mais sorte na próxima!");
          break;
        case 14:
          System.out.println("Com 14 acertos você ganhou... R$15.000. Mais sorte na próxima!");
          break;
        case 15:
          System.out.println("Com 15 acertos você ganhou... R$20.000. Mais sorte na próxima!");
          break;
        case 16:
          System.out.println("Com 16 acertos você ganhou... R$25.000. Mais sorte na próxima!");
          break;
        case 17:
          System.out.println("Com 17 acertos você ganhou... R$30.000. Mais sorte na próxima!");
          break;
        case 18:
          System.out.println("Com 18 acertos você ganhou... R$50.000. Mais sorte na próxima!");
          break;
        case 19:
          System.out.println("Com 19 acertos você ganhou... R$100.000. Mais sorte na próxima!");
          break;
        case 20:
          System.out.println("Com 20 acertos você ganhou... R$150.000. Mais sorte na próxima!");
          break;
        case 21:
          System.out.println("Com 21 acertos você ganhou... R$200.000. Mais sorte na próxima!");
          break;
        case 22:
          System.out.println("Com 22 acertos você ganhou... R$250.000. Mais sorte na próxima!");
          break;
        case 23:
          System.out.println("Você chegou na última questão e errou! Você ganha... R$0. Mais sorte na próxima!");
          break;
      }
        System.out.println();
        System.out.println("\tGostaria de jogar de novo?");
        System.out.println("1. Sim.");
        System.out.println("2. Não.");
        
        while (trocar == 0) {
          trocar = t.nextInt();
          if (trocar > 2 || trocar < 1) {
            System.out.println("Por favor digite um número correspondente com a sua resposta.");
            trocar = 0;
          }
        }
        if (trocar == 1) {
          continue JOGO; 
        } else {
          System.out.println();
          rodando = false;
          System.out.println("\t. . . . . ╰──╮ Muito obrigada por jogar!!  ╭──╯ . . . . .");
        }
        
      } else {
        System.out.println();
        System.out.println("\t. . . . . ╰──╮ PARABÉNS!  ╭──╯ . . . . .");
        rodando = false;
        System.out.println();
        System.out.println("\t Você respondeu as 24 perguntas, e chegou ao fim do jogo, ganhando UM MILHÃO DE REAIS! Dá pra comprar um 1kg de carne já. :)");
      }

    } //jogo inteiro loop
  }
}