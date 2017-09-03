package classes;
public class Main extends Thread{
    public static void main(String args[]){
        InterfaceGrafica interfacePrincipal=new InterfaceGrafica();
        interfacePrincipal.setVisible(true);
        while(true){
            interfacePrincipal.atualizarHora();
        }
    }
}
/*
Desenvolver uma aplicação que simule um Rádio Relógio, com as seguintes especificações:

ok  - Utilizar interface gráfica do Java;
ok  - Deverá apresentar um display com a hora atual, de preferência sincronizada com a hora do computador que estiver rodando a aplicação;
ok  - Deverá ser mostrada a hora no formato: HH:MM:SS;
ok  - Deverá conter um tabela que permita ao usuário selecionar uma lista de músicas que ele deseje ouvir;
ok  - Essa tabela deverá permitir incluir e excluir arquivos MP3 para serem tocados;
    - Ao selecionar uma música na tabela e ao pressionar o botão play, a música deverá ser tocada e ao seu término, 
        caso exista, deverá iniciar a próxima música escolhida, da sequência, e assim sucessivamente até a última música da lista;
    - A qualquer momento o usuário poderá incluir ou excluir música, inclusive se o aplicativo estiver tocando alguma;
ok  - A interface deverá apresentar um botão para para a música que estiver tocando;
    - A cada hora cheia, respeitando o término da música que estiver tocando, o rádio deverá informar a hora atual. 
        Por exemplo: Se for 21h e ainda estiver tocando uma música, a aplicação deverá esperar a música terminar para informar a hora. 
        Se a música terminar às 21:02h, esta é a hora a ser informada;
ok  - Deverá haver um botão para que a hora atual seja informada, por cima da música que estiver tocando.
    - Deverá ser possível a programação de N horários em que o rádio relógio irá "Despertar"
*/