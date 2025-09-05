//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
          Tictactoe game = new Tictactoe();
          game.initialize();
          String result=game.startGame();
          if(result!="Tie") {
          System.out.println("Game"+result+"wins");}
          else{
              System.out.println("Draw");
        }
        }
    }
