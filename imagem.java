import java.util.Scanner; //importa scanner

public class imagem { //inicia classe
    public static final String ANSI_RESET = "\u001B[0m"; //cria uma string fixa com o valor de ANSI, para resetar a cor original de uma string
    public static final String ANSI_WHITE = "\u001B[47m"; //cria uma string fixa com o valor de ANSI para definir a cor de fundo numa string, pode não funcionar dependendo do modo de exibicao
    public static final String ANSI_BLACK = "\u001B[40m"; //cria uma string fixa com o valor de ANSI para definir a cor de fundo numa string, pode não funcionar dependendo do modo de exibicao
    public static final String ANSI_YELLOW = "\u001B[43m"; //cria uma string fixa com o valor de ANSI para definir a cor de fundo numa string, pode não funcionar dependendo do modo de exibicao
    public static final String ANSI_RED = "\u001B[41m"; //cria uma string fixa com o valor de ANSI para definir a cor de fundo numa string, pode não funcionar dependendo do modo de exibicao

    public static void main(String[] args) { //inicia o metodo main
        String[][] imagem = new String[16][16]; //cria uma matriz vazia 16 x 16
        Scanner sc = new Scanner(System.in); //cria um scanner
        int i = 0, j = 0, input = 0; //inicia variaveis e atribui valor zero a cada uma

        while (true) { //inicia loop infinito

            j = 0; //atribui/reseta valor de j como zero

            while (true) { //inicia loop infinito
                System.out.println("Digite a cor da posicao [" + (1+i)+ "] ["+(j+1)+"] <0=branco, 1=preto, 2=bege, 3=vermelho>"); //exibe instrucoes com a coordenada da posicao a ser digitada
                input = sc.nextInt(); //definie input como o valor digitado

                switch (input) { //inicia um switch para selecao da cor utilizando a entrada digitada
                    case 0 -> { //caso seja digitado 0
                        imagem[i][j] = ANSI_WHITE + " 0 " + ANSI_RESET; //define string junto com uma cor de fundo e logo depois sua instrucao de reset
                        j++; //adiciona 1 ao valor atual de j
                    }
                    case 1 -> { //caso seja digitado 1
                        imagem[i][j] = ANSI_BLACK + " 1 " + ANSI_RESET; //define string junto com uma cor de fundo e logo depois sua instrucao de reset
                        j++; //adiciona 1 ao valor atual de j
                    }
                    case 2 -> { //caso seja digitado 2
                        imagem[i][j] = ANSI_YELLOW + " 2 " + ANSI_RESET; //define string junto com uma cor de fundo e logo depois sua instrucao de reset
                        j++; //adiciona 1 ao valor atual de j
                    }
                    case 3 -> { //caso seja digitado 3
                        imagem[i][j] = ANSI_RED + " 3 " + ANSI_RESET; //define string junto com uma cor de fundo e logo depois sua instrucao de reset
                        j++; //adiciona 1 ao valor atual de j
                    }
                    default -> { //caso seja digitado uma opcao nao listada
                        System.err.println("Opcao invalida!"); //exibe texto em formato de erro (poderia tambem ser atribuido ao  voto nulo)
                        continue; //retorna ao inicio do switch sem aumentar o contador, para tentar novamente caso valor invalido seja digitado
                    }

                }
                if (j == 16) break; //quando j for 16, encerra o loop infinito (nestado no principal)
                }
                i++; //adiciona 1 ao valor atual de i
                if (i == 16) break; //quando i for 16, encerra o loop infinito (principal)
            }
                System.out.println("Imagem:"); //exibe o texto
                for (i = 0; i < 16; i++) { //loop para selecao da coluna
                    for (j = 0; j < 16; j++) { //subloop para selecao da linha
                        System.out.print(imagem[i][j]); //exibe o membro i x j da matriz
                    }
                    System.out.println(); //pula linha
                }
            }
        }
