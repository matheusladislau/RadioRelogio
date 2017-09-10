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

OK  - Utilizar interface gráfica do Java;
OK  - Deverá apresentar um display com a hora atual, de preferência sincronizada com a hora do computador que estiver rodando a aplicação;
OK  - Deverá ser mostrada a hora no formato: HH:MM:SS;
OK  - Deverá conter um tabela que permita ao usuário selecionar uma lista de músicas que ele deseje ouvir;
OK  - Essa tabela deverá permitir incluir e excluir arquivos MP3 para serem tocados;
OK    - Ao selecionar uma música na tabela e ao pressionar o botão play, a música deverá ser tocada e ao seu término, 
OK     caso exista, deverá iniciar a próxima música escolhida, da sequência, 
OK        e assim sucessivamente até a última música da lista;
OK  - A qualquer momento o usuário poderá incluir ou excluir música, inclusive se o aplicativo estiver tocando alguma;
OK  - A interface deverá apresentar um botão para parar a música que estiver tocando;
    - A cada hora cheia, respeitando o término da música que estiver tocando, o rádio deverá informar a hora atual. 
        Por exemplo: Se for 21h e ainda estiver tocando uma música, a aplicação deverá esperar a música terminar para informar a hora. 
        Se a música terminar às 21:02h, esta é a hora a ser informada;
OK  - Deverá haver um botão para que a hora atual seja informada, por cima da música que estiver tocando.
OK  - Deverá ser possível a programação de N horários em que o rádio relógio irá "Despertar"
*/