
package rpgproject;

 import java.util.*;
public class RpgProject {

    static void gameHUD(int VidaP, int VidaE, String NomeP, String NomeE, int i){
        System.out.println("======================");
        System.out.println("RODADA - " + i);
        System.out.println("Vida " + NomeP + ": " + VidaP);     
        System.out.println("Vida " + NomeE + ": " + VidaE);     
        System.out.println("======================");
    }
    static int AtaquePlayer(){
        System.out.println("Selecione um ataque");
        System.out.println("1 - Soco normal");
        System.out.println("2 - Chute");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    static int AtaqueInimigo(){
        Random random = new Random();
        return random.nextInt(2);
    }
    static void gameBattle(){
        int VidaP = 100;
        int VidaE = 20;
        System.out.println("Digite seu nome:");
        Scanner sc = new Scanner(System.in);
        String NomeP = sc.next();
        String NomeE = "Inimigo";
        int i = 1;
        while(VidaP > 0 && VidaE > 0){
            gameHUD(VidaP, VidaE, NomeP, NomeE, i);    
            int AtaquePlayer = AtaquePlayer();
            int AtaqueInimigo = AtaqueInimigo();
            if(VidaP > 0){
            switch(AtaquePlayer){
                case 1:
                    System.out.println("Você deu um soco normal");
                    VidaE -= 3;
                    break;
                case 2:
                    System.out.println("Você deu um chute");
                    VidaE -= 6;
                    break;
                default:
                    System.out.println("Movimento inválido, perdeu o turno");
                    break;
               }
            if(VidaE > 0){
               switch(AtaqueInimigo){
                case 0:
                    System.out.println("O inimigo deu um soco normal");
                    VidaP -= 3;
                    break;
                case 1:
                    System.out.println("O inimigo deu um chute");
                    VidaP -= 6;
                    break;
               }
            }else{
            i++;    
            VidaE = 20 + i; 
            }
            }
            
        }
    }

    public static void main(String[] args) {
        gameBattle();
 
    }
}
