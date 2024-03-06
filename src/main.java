import java.util.Scanner;
import java.io.File;
import javax.imageio.IIOException;
import javax.sound.sampled.*;
import java.io.IOException;

class main{
    public static void main(String[] args)throws UnsupportedAudioFileException,IOException,LineUnavailableException{
        Scanner scan = new Scanner(System.in);
        System.out.println("What song would you like to listen to?");
        System.out.println("1.Luxury");
        System.out.println("2.Vaudy");
        System.out.println("3.Persona");
        System.out.print("Your choice: ");
        int input3 = scan.nextInt();
        scan.nextLine();
        String input1 = "";
        if(input3 == 1){
            input1 = "E:\\Azealia Banks - Luxury.wav";
        } else if (input3 == 2) {
            input1 = "E:\\!!!Vaundy - Hadaka No Yusha.wav";
        }else if(input3 == 3){
            input1 = "E:\\Persona 4 - Specialist.wav";
        }else {
            System.out.println("The input given is not correct");
        }
        File file = new File(input1);
        AudioInputStream au = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(au);

        boolean flag = true;
        while(flag == true){
            System.out.print("What do you want to do?(s = START,p = PAUSE,r = RESET,c = Change SOng,q = QUIT):  ");
            String input = scan.nextLine();
            input = input.toUpperCase();
            switch (input){
                case "S":
                    clip.start();
                    break;
                case "P":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    clip.start();
                    break;
                case "Q":
                    flag = false;
                    clip.close();
                    System.out.println("THe program is closing");
                    break;
            }
            }
        }
    }


